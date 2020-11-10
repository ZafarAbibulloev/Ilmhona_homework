package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Buyer buyer = new Buyer();
        Buyer buyer2 = new Buyer();

        buyer.setName("Zafar");
        buyer.setID(1284);
        buyer2.setName("Muntasir");
        buyer2.setID(2038);


        Buyer[] buyers = new Buyer[2];
        buyers[0] = buyer;
        buyers[1] = buyer2;
        for (int i = 0; i < buyers.length; i++) {
            if (buyers[i].getID() % 2 == 0) {
                System.out.println("Имя: " + buyers[i].getName() + "  ID: " + buyers[i].getID());
            }
        }

        Persons persons = new Persons();
        Persons persons1 = new Persons();
        Persons persons2 = new Persons();
        persons.setRoumigTime(2.38);
        persons.setName("Muntasir");
        persons1.setName("Zafar");
        persons2.setName("Nigina");
        persons2.setLocalTime(3.58);

        double maxlocal = 1.58;

        Persons[] Person = new Persons[3];
        Person[0]=persons;
        Person[1]=persons1;
        Person[2]=persons2;

        for (int i = 0; i < Person.length; i++) {
            if (Person[i].getLocalTime()>maxlocal) {
                System.out.println( "Превысили лимит городской связи " + Person[i].getName() + ", время разговора " + Person[i].getLocalTime()); // перелимит городских звонков

            }
            if (Person[i].getRoumigTime() != 0.00) {
                System.out.println("Междугородней связью пользовались " + Person[i].getName() + " " + Person[i].getRoumigTime());// использовали междуню связь


            }
        }


    }
}




