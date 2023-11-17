package com.yasemin.repository;


import static com.yasemin.Database.WorkerDB.*;
import com.yasemin.entity.Worker;

public class WorkerRepository implements Repository{
    /**
     * Sisteme girilen yeni çalışan bilgilerini listeye ekler.
     * @param worker
     */
    @Override
    public  void save(Worker worker) {
        workers[numberOfWorker++]=worker;
    }

    /**
     * Sistem üzerindeki çalışan bilgilerini günceller.
     * @param worker
     */
    @Override
    public void update(Worker worker) {
        for (int i=0;i<numberOfWorker;i++){
            if (workers[i].getId()==worker.getId()){
                workers[i]=worker;
            }
        }

    }

    /**
     * Çalışanın id sine göre bulup kişiyi siler.
     * @param name
     */
        @Override
    public void deleteById(String name) {//Kodu çalıstırırken daha kolay olsun diye parametresini 'id' den 'name' çevirdim.
       for (int i=0;i<numberOfWorker;i++){
          if(workers[i].getName().equalsIgnoreCase(name)){
              workers[i]=null;
              numberOfWorker--;
          }

       }
    }

    /**
     * Çalişanı id sine göre bulup tüm bilgilerini geri döner.
     * @param id
     * @return
     */

    @Override
    public Worker findById(int id) {
        int index=-1;
        for (int i=0;i<numberOfWorker;i++){
            if (workers[i].getId()==id)
                index=i;
        }
       return workers[index];
    }

    /**
     * Tüm çalışanlar listesini geri döner.
     * @param worker
     * @return
     */
    @Override
    public Worker[] findAll() {
        Worker[] result=new Worker[numberOfWorker];
        int sayac=0;
        for (int i=0;i<numberOfWorker;i++){
            if(workers[i]!=null)
                result[sayac++]=workers[i];
        }
        workers=result;
        return workers;
    }
}
