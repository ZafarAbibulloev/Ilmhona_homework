package com.company;

public class Main {

    public static void main(String[] args) {

        // Коробки

        box Box = new box();
        Box.form  = "Квадратная";
        Box.heightA = 153.2;
        Box.heightB = 153.2;
        Box.width = 153.2;

        box Box2 = new box();
        Box2.form  = "Прямоугольная";
        Box2.heightA = 100;
        Box2.heightB = 50;
        Box2.width = 120;

        // Яблоки

        apple GreenApple = new apple();
        GreenApple.color = "Зеленое";
        GreenApple.size="Крупные";
        GreenApple.variety="Славянка";
        GreenApple.weight = 120;

        apple RedApple = new apple();
        RedApple.color = "Красное";
        RedApple.size="Маленькие";
        RedApple.variety="Китайка темно-красная";
        RedApple.weight = 20;

        // Автомобили

        car Sedan = new car();
        Sedan.clas = "Седан";
        Sedan.model = "Toyota camry";
        Sedan.year = 2020;
        Sedan.speed = 220;

        car Universal = new car();
        Sedan.clas = "Универсал";
        Sedan.model = "Mercedes Benz A45 AMG";
        Sedan.year = 2013;
        Sedan.speed = 200;

        car Cabriolet = new car();
        Sedan.clas = "Кабриолет";
        Sedan.model = "Lexus LC500";
        Sedan.year = 2019;
        Sedan.speed = 260;

        System.out.println(Sedan.one +": "+ Sedan.model);
        System.out.println(Sedan.two+": "+ Sedan.year);
        System.out.println(Sedan.three+": "+ Sedan.clas);
        System.out.println(Sedan.four+": "+ Sedan.speed + " км/ч");


    }
}
