package com.company;

public class FirstClass {

    public static int a = 1;
    public static int b = 2;


    int sum = sum();
    int max = maximum();

    public static int sum (){

        int sum = a + b;
        return sum;
    }

    public static int maximum(){
        int max;

        if(a>b){
            max=a;
        }
        else {
            max = b;
        }
        return max;

    }


}
