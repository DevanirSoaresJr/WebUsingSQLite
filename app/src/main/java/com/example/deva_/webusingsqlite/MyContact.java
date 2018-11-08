package com.example.deva_.webusingsqlite;

public class MyContact {

    private String name,number,age,gender,faveAnimal;

    public MyContact(String name, String number, String age, String gender, String faveAnimal) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.gender = gender;
        this.faveAnimal = faveAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAge() { return age; }

    public void setAge(String age) { this.age = age; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getFaveAnimal() { return faveAnimal; }

    public void setFaveAnimal(String faveAnimal) { this.faveAnimal = faveAnimal; }
}
