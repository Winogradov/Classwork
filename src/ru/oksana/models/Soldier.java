package ru.oksana.models;

public class Soldier extends Person{

    String rank;

   public Soldier (String name, String surname, String secondname) {
        super(name, secondname, surname);
        this.rank = rank;

    }

    @Override
    public String getFullname() {
        return rank + " " + super.getFullname();
    }
}

