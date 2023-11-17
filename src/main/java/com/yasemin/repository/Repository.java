package com.yasemin.repository;

import com.yasemin.entity.Worker;

public interface Repository {
     void save(Worker worker);

    void update(Worker worker);
    void deleteById(String id);
    Object findById(int id);
    Object[] findAll();

}
