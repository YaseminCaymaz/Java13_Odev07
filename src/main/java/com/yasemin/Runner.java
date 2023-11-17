package com.yasemin;

import com.yasemin.entity.Engineer;
import com.yasemin.entity.Intern;
import com.yasemin.entity.Manager;
import com.yasemin.entity.Worker;
import com.yasemin.enums.Gender;
import com.yasemin.enums.MaritalStatus;
import com.yasemin.enums.Title;
import com.yasemin.repository.Repository;
import com.yasemin.repository.WorkerRepository;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
       choose();

    }

    /**
     *Class içinde sürekli kullanıldıgı için genel bir nesne yarattım.
     */
    public static WorkerRepository repository=new WorkerRepository();
    public static Scanner sc=new Scanner(System.in);

    public static void print(){
            System.out.println("*********************************");
            System.out.println("******* COMPUTİNG *************");
            System.out.println("*********************************");
            System.out.println("1-Add new worker");
            System.out.println("2-Update");
            System.out.println("3-Delete By Id");
            System.out.println("4-Find By Id");
            System.out.println("5-Find All");
            System.out.println("0-EXİT");
            System.out.println("Lütfen bir seçim yapınız");
    }

    /**
     * Ekrana yazdırılan secenekler arasından birisini seçerek o methoda yonlendirir.
     */
    public static void choose(){
        int index=0;
        do {
            print();
            index=sc.nextInt();
            switch (index){
                case 1: save();break;
                case 2: System.out.println("Updated");;break;
                case 3: deleteId();break;
                case 4: findById();break;
                case 5: findAll();break;
                case 0:System.out.println("Cıkıs yapıldı");break;
                default: System.out.println("Hatalı giriş yaptınız");break;
            }

        }while (index!=0);
    }

    /**
     * Yeni çalışan bilgisini alıp listeye atar yani kaydeder.
     */
    public static void save(){
        System.out.println("****************************************");
        Worker worker=new Worker();
        System.out.println("Name............:");
        worker.setName(sc.nextLine());
        System.out.println("Surname.........:");
        worker.setSurname(sc.nextLine());
        System.out.println("TC no...........:");
        worker.setTcId(sc.nextInt());
        System.out.println("Phone...........:");
        worker.setPhoneNo(sc.nextInt());
        System.out.println("Address.........:");
        worker.setAddress(sc.nextLine());
        System.out.println("Gender..........:");
        String string=sc.nextLine();
        if (string.equalsIgnoreCase("man"))
            worker.setGender(Gender.MAN);
        else if (string.equalsIgnoreCase("woman"))
            worker.setGender(Gender.WOMAN);
        else worker.setGender(Gender.OTHER);
        System.out.println("Marital Status..:");
        string=sc.nextLine();
        if (string.equalsIgnoreCase("married"))
            worker.setMaritalStatus(MaritalStatus.MARRIED);
        else if (string.equalsIgnoreCase("single"))
            worker.setMaritalStatus(MaritalStatus.SINGLE);
        System.out.println("Title...........:");
        string=sc.nextLine();
        if (string.equalsIgnoreCase("intern"))
            worker.setTitle(Title.INTERN);
        else if (string.equalsIgnoreCase("manager"))
            worker.setTitle(Title.MANAGER);
        else if (string.equalsIgnoreCase("engineer"))
            worker.setTitle(Title.ENGINEER);
        else worker.setTitle(Title.OFFICE_WORKER);
        System.out.println("Salary..........:");
        worker.setSalary(sc.nextDouble());
        repository.save(worker);
        System.out.println("Worker is save");
    }

    /**
     * Bellekten silinmek istenen veriyi siler
     */
    public static void deleteId(){
        System.out.println("Enter the name you want to delete..:");
        repository.deleteById(sc.nextLine());
        System.out.println("Deleted..");
    }

    /**
     * Bilgilerini görmek istediginiz çalişanın verilerini getirir
     */
    public static void findById(){
        System.out.println("Enter the id you want to print..:");
        Worker worker=repository.findById(sc.nextInt());
        worker.yazdir();
    }

    /**
     * Bellekte bulunan tum çalışan bilgilerini getirir.
     */
    public static void findAll(){
        for (Worker worker: repository.findAll())
            worker.yazdir();
    }
}
