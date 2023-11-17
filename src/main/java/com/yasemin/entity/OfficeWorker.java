package com.yasemin.entity;

import com.yasemin.enums.Gender;
import com.yasemin.enums.MaritalStatus;
import com.yasemin.enums.Title;

public class OfficeWorker extends Worker{
    public OfficeWorker() {
        this.setTitle(Title.OFFICE_WORKER);
    }

    public OfficeWorker(String name, String surname, int tcId, int phoneNo, String address, Gender gender, MaritalStatus maritalStatus, Double salary) {
        super(name, surname, tcId, phoneNo, address, gender, maritalStatus,Title.OFFICE_WORKER, salary);
    }

    @Override
    public void yazdir(){
        super.yazdir();
    }
}
