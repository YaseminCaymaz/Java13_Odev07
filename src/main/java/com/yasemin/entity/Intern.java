package com.yasemin.entity;

import com.yasemin.enums.Gender;
import com.yasemin.enums.MaritalStatus;
import com.yasemin.enums.Title;

import java.util.Date;

public class Intern extends Worker{

    public Intern() {
    }

    public Intern(String name, String surname, int tcId, int phoneNo, String address, Gender gender, MaritalStatus maritalStatus, Double salary) {
        super(name, surname, tcId, phoneNo, address, gender, maritalStatus, Title.INTERN, salary);
    }
    @Override
    public void yazdir(){
        super.yazdir();
    }
}
