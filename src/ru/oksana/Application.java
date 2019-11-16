package ru.oksana;

import ru.oksana.models.Person;
import ru.oksana.models.Soldier;

public class Application {
    public static void main(String[] args) {
        Person ivanov = new Person( "Ivan", "Ivanovich", "Ivanov" );
        String fullname = ivanov.getFullname();
        System.out.println(fullname);

        Person petrov = new Person("Petr", "Petrovich", " petrov", 45);
        System.out.println(petrov.getFullname());


        Person anonim = new Person();
        System.out.println(anonim.getFullname());
        anonim.setName ("Semen");
        anonim.setSecondname(" Alekseevich" );
        anonim.setSurname(" Sidorov");
        anonim.setAge(55);
        System.out.println(anonim.getFullname());


        Soldier sergiant = new Soldier( "Bruce", "Willies", "Petrovich");
        String sergName = sergiant.getFullname();
        System.out.println(sergName);
    }
}
