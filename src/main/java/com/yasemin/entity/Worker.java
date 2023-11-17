package com.yasemin.entity;

import com.yasemin.enums.Gender;
import com.yasemin.enums.MaritalStatus;
import com.yasemin.enums.Title;

import java.util.Random;
import java.util.UUID;

public  class Worker extends BaseWorker{
    private int id;
    private String name;
    private String surname;
    private int tcId;
    private int phoneNo;
    private String address;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Title title;
    private Double salary;

    public Worker() {
        this.id = new Random().nextInt(1,9999);
    }

    public Worker( String name, String surname, int tcId, int phoneNo, String address, Gender gender, MaritalStatus maritalStatus, Title title, Double salary) {
        this.id = new Random().nextInt(1,9999);
        this.name = name;
        this.surname = surname;
        this.tcId = tcId;
        this.phoneNo = phoneNo;
        this.address = address;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.title = title;
        this.salary = salary;
    }

    /**
     *  .toString te hata aldım.Bu methodu yazdım.
     */
  public void yazdir(){
      System.out.println("****************************************");
      System.out.println("id..............:"+id);
      System.out.println("Name............:"+name);
      System.out.println("Surname.........:"+surname);
      System.out.println("TC no...........:"+tcId);
      System.out.println("Phone...........:"+phoneNo);
      System.out.println("Address.........:"+address);
      System.out.println("Gender..........:"+gender);
      System.out.println("Marital Status..:"+maritalStatus);
      System.out.println("Title...........:"+title);
      System.out.println("Salary..........:"+salary);

  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTcId() {
        return tcId;
    }

    public void setTcId(int tcId) {
        this.tcId = tcId;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
