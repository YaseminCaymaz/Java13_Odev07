package com.yasemin.entity;

import com.yasemin.enums.Gender;
import com.yasemin.enums.MaritalStatus;
import com.yasemin.enums.Title;

public class Engineer extends Worker{
    public Engineer() {
        this.setTitle(Title.ENGINEER);
    }

    public Engineer(String name, String surname, int tcId, int phoneNo, String address, Gender gender, MaritalStatus maritalStatus, Double salary) {
        super(name, surname, tcId, phoneNo, address, gender, maritalStatus,Title.ENGINEER, salary);
    }

    @Override
    public void yazdir(){
        super.yazdir();
    }
}
