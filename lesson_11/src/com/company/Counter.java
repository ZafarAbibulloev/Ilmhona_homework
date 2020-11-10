package com.company;

public class Counter {

   public static int currentNumber;

   int getCurrentNumber = currentNumber;
   int CounterResult = CounterResult();
   int CounterResult2 = CounterResult2();
   int CounterResult3 = CounterResult3();


    // инициализация через конструктор

    public Counter (){
        this.currentNumber = 0;
        System.out.println("Значение конструктора по умолчанию = " + currentNumber);
    }
    public Counter(int currentNumber){

        this.currentNumber = currentNumber;
        System.out.println("В конструктор передано значение = " + currentNumber);
    }



    // Метод уменьшающий (но не меньше 0) или увеливающий  currentNumber;

    // Метод увеличивающий значение;
    public static int CounterResult (){
        currentNumber = currentNumber+ 1;
        return currentNumber;
    }

    // Метод уменьшающий значение;
    public static int CounterResult2 (){

        currentNumber = currentNumber-1;

           if (currentNumber<0){
               currentNumber = 0;
        } else {
               currentNumber = currentNumber;

           }

        return currentNumber;

    }

    // Метод возвращающий текущее значение;
    public static int CounterResult3 (){

       currentNumber =currentNumber;
       return currentNumber;
       }

    }







