package ru.oksana.models;

public class Person {
    String name;
    String surname;
    String secondname;
    int age;

    public Person() {
    }

    public Person (String name, String surname, String secondname ){
        this.name= name;
        this.surname = surname;
        this.secondname = secondname;
    }

    public Person(String name, String surname, String secondname, int age) {
        this.name = name;
        this.surname = surname;
        this.secondname = secondname;
        this.age = age;
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

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return name + " " + secondname + " " + surname + " " + age;
    }

}
