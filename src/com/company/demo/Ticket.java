package com.company.demo;



public class Ticket {
    private String name;
    private int age;
    private String gender;
    private String birthPreference;
    private String berthConfirmed;
    private String type;
    private boolean isCancelled;


    public Ticket(String name, int age, String gender, String birthPreference) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthPreference = birthPreference;
        this.berthConfirmed="";
        this.type="";
        this.isCancelled = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthPreference() {
        return birthPreference;
    }

    public void setBirthPreference(String birthPreference) {
        this.birthPreference = birthPreference;
    }

    public String getBerthConfirmed() {
        return berthConfirmed;
    }

    public void setBerthConfirmed(String berthConfirmed) {
        this.berthConfirmed = berthConfirmed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthPreference='" + birthPreference + '\'' +
                ", berthConfirmed='" + berthConfirmed + '\'' +
                ", type='" + type + '\'' +
                ", isCancelled=" + isCancelled ;
    }
}
