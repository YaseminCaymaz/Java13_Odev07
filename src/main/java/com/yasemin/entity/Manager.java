package com.yasemin.entity;

import com.yasemin.enums.Gender;
import com.yasemin.enums.MaritalStatus;
import com.yasemin.enums.Title;

public class Manager extends Worker{
    public Manager() {
        this.setTitle(Title.MANAGER);
    }

    public Manager(String name, String surname, int tcId, int phoneNo, String address, Gender gender, MaritalStatus maritalStatus, Double salary) {
        super(name, surname, tcId, phoneNo, address, gender, maritalStatus,Title.MANAGER, salary);
    }

   @Override
    public void yazdir(){
        super.yazdir();
   }
}
