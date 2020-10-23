package com.company;



public class Main {

    public static void main(String[] args) {
        // write your code here

        max();
        System.out.println("1. Максимальное значение = " + max());

        sumOfSquares();
        System.out.println("2. Cумма квадратов всех целых чисел = " + sumOfSquares());

        maxInArray();
        System.out.println("3. Наибольшее число в массиве = " + maxInArray());


        int [] NewArray = {99,5,-12,909,100,-100,25,-30};
        int [] array3 = PositiveNumbers(NewArray);
        for (int i=0; i<array3.length;i++){

            System.out.println("4. Положительные числа в массиве NewArray  " + array3[i]);

            //System.out.println(array3[i]);
        }
        int [] arraySum = {1,2,3,4,6};
        int x = Sumarray(arraySum);
        System.out.println("5. Сумма чисел масива = " + x);


    }

    //Написать метод max(int x, int y), который вернёт максимальное из x и y.

    public static int max (){
        int x = 58;
        int y = 12;
        int max =0;

        if (x<y){
            max=y;
        }else {
            max =x;
        }
        return max;
    }

    //Написать метод sumOfSquares(int a, int b), где a<b и вернуть сумму квадратов всех целых чисел от a до b включительно.

    public static double sumOfSquares(){

        int a = 1;
        int b = 6;
        double sum = a;

        while (a!=b){
            a++;
            sum = sum+Math.pow(a,2);
        }
        return sum;

    }

    //Написать метод maxInArray(int[] array), который вернёт максимальное число в массиве array.

    public static int maxInArray() {

        int [] My_array = {999, 5, 12, 909,100};

        int  maxinArray = My_array[0];

        for (int i = 0; i<My_array.length; i++){

            if (My_array[i]>maxinArray){

                maxinArray = My_array[i];
            }
        }
        return  maxinArray;
    }

    // Написать метод, который удалит все отрицательные числа в переданном массиве и вернёт новый массив без отрицательных чисел.

    public static int[] PositiveNumbers(int [] array){
        //int [] NewArray = {99, 5,-12, 909,100, - 100, 25,-30};

        int counter=0;

        for(int i =0; i<array.length;i++){
            if(array[i]<0){
                counter++;
            }
        }

        int [] array2 = new int[array.length-counter];
        int z=-1;
        for (int j=0;j<array.length;j++){

            if (array[j]>=0){
                z++;
                array2[z]=array[j];
            }
        }
        return  array2;
    }

    //Написать метод, который вернёт сумму цифр переданного массива.

    public static int Sumarray (int[] sum){
        int arrSum=0;
        for (int i =0; i<sum.length;i++){
            arrSum=arrSum+sum[i];

        }//System.out.println(arrSum);
        return  arrSum;

    }




}

