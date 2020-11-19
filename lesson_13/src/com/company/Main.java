package com.company;

import java.util.stream.Stream;

import static java.sql.Types.NULL;

public class Main {


    private static String myString = "abCdeFghiGh";
    private static String newString = myString.toLowerCase();

    public static void main(String[] args) {

        // 1) Дана строка. Вывести первые три символа и
        //последний три символа, если длина строки больше 5.
        //Иначе вывести первый символ столько раз, какова
        //длина строки.
        int stringLenth = 5;

        if (myString.length() > stringLenth) {
            System.out.println("Первые три символа " + myString.substring(0, 3) + " последние три символа " + myString.substring(myString.length() - 3, myString.length()));
        } else {
            for (int i = 0; i <= myString.length(); i++) {

                System.out.println(myString.substring(0, 1));
            }
        }

        //2) Дана строка. Показать номера символов,
        //совпадающих с последним символом строки.
        for (int j = 0; j <= myString.length() - 1; j++) {
            if (myString.charAt(j) == myString.charAt(myString.length() - 1)) {
                System.out.println("Порядковый номер в строке: " + j);
            }
        }


        //3) Дана строка. Определите, какой символ в ней
        //встречается раньше: 'x' или 'w'. Если какого-то
        //из символов нет, вывести сообщение об этом.
        String x = "x";
        String w = "w";

        if (!newString.contains(x) && !newString.contains(w)) {
            System.out.println("Указанных символов нет в строке");
        } else if (!newString.contains(x)) {
            System.out.println("Символа " + x + " нет в строке");

        } else if (!newString.contains(w)) {
            System.out.println("Символа " + w + " нет в строке");
        }
        if (chekString() == ' ') {

        } else {
            System.out.println("Символ " + chekString() + " встречается первым");
        }

        String1();// Задание 4
        String2();//Задание 5
        String3();//Задание 6


    }

    private static char chekString() {
        char newChar = ' ' ;
        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == 'x' || newString.charAt(i) == 'w') {
                newChar = newString.charAt(i);
                break;
            }
        }
        return newChar;

    }

    //4) Дана строка. Если ее длина больше 10, то оставить
    //в строке только первые 6 символов, иначе дополнить
    //строку символами 'o' до длины 12.

    private static void String1() {


        if (newString.length() > 10) {
            newString = newString.substring(0, 6);
            System.out.println(newString);
        } else {
            int stringLength = 12 - newString.length();

            for (int i = 0; i < stringLength; i++) {
                newString = newString + 'o' ;
            }
            System.out.println(newString);
        }
    }


    private static void String2() {


        // 5) Замените в строке все вхождения 'word' на
        // 'letter'.

        String string = "Word fsdbh word bls led";
        String string1 = string.toLowerCase();
        System.out.println(string1.replace("word", "letter"));
    }
    // 6) Даны два слова. Найдите только те символы слов,
    // которые встречаются в обоих словах только один раз.

    private static void String3() {

        String Hello = "Hello odgn";
        String World = "World edhgn";
        String symbol = "";
        String finalString = "";

        // Находим повторяющиеся символы

        for (int i = 0; i < Hello.length(); i++) {

            for (int j = 0; j < World.length(); j++) {

                if (World.charAt(j) == Hello.charAt(i)) {

                    symbol = symbol + World.charAt(j);
                }
            }
        }

        int counter = 0;
        // Сравниваем каждый символ со строкой

        for (int z = 0; z < symbol.length(); z++) {

            for (int x = 0; x < symbol.length(); x++) {

                if (z != x && symbol.charAt(z) == symbol.charAt(x)) { //Исключаем символы с абсолютно одинаковыми параметрами(позиция + символ)
                    counter++;
                }
            }
                if (counter == 0) {
                    finalString = finalString + symbol.charAt(z);
                }
            counter = 0;
        }
        System.out.println(finalString);

    }

}
















