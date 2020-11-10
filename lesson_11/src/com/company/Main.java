package com.company;

public class Main {





    public static void main(String[] args) {

        //Создать класс с 2 переменными. Вывести значения, сумму и наибольшее значение переменных

        FirstClass firstClass = new FirstClass();
        System.out.println("Значение переменной а = " + firstClass.a + " и " + "Значение переменной b = " + firstClass.b);
        System.out.println("Сумма переменных = " + firstClass.sum);
        System.out.println("Максимальное значение = " + firstClass.max);

        //Cоздать класс с 2 переменными. Добавиткь конструктор с входными параметрами.
        //Добавить конструктор, инициализирующий свойства класса по умолчанию.

        ConstructorClass constructorClass = new ConstructorClass("Zafar", 35);
        System.out.println("Меня зовут " + constructorClass.name + " и мне " + constructorClass.age + " лет");

        ConstructorClass constructorClass1 =new ConstructorClass();
        System.out.println("Меня зовут " + constructorClass1.name + " и мне " + constructorClass1.age + " лет");


        // Создать класс счетчик int currentNumber>=0.

        Counter counter1 = new Counter(5);
        Counter counter = new Counter();
        System.out.println("Метод увеличивающий значение " + counter.CounterResult);
        System.out.println("Метод уменьшающий значение " + counter.CounterResult2);
        System.out.println("Метод возвращающий текущее значение " + counter.CounterResult3);


















    }
}







