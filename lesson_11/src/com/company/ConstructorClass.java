package com.company;

public class ConstructorClass {

    String name;
    int age;

    public ConstructorClass(String name, int age){

        this.name = name;
        this.age = age;
    }

    public ConstructorClass(){
        this.name ="Unknown";
        this.age = 0;

    }
}
