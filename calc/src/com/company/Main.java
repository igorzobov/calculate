package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner String = new Scanner(System.in); //инициализация сканера
        String str = String.next(); //создание строки через вызов сканера
        char [] arr = str.toCharArray(); //перевод строки в массив символов
        int res_1 = 0; //объявление глобальной переменной res_1 для десятичной СС
        int res_2 = 0; //объявление глобальной переменной res_2 для десятичной СС
        int res_3 = 0; //объявление глобальной переменной res_3 для римской СС
        int res_4 = 0; //объявление глобальной переменной res_4 для римской СС
        String oper = ""; //объявление глобальной переменной oper
        for (char el: arr) { //краткая форма записи перебора элементов массива
            if (Character.isDigit(el)) { //проверка что символ является числом
                res_2 = res_2*10 + Character.getNumericValue(el); //конкатинация цифр
            } else if (el == 43) { //прокерка что символ == +
                res_1 = res_2; // сохранение полученного res_1
                res_2=0; //обнуление res_2
                oper = Character.toString(el); //сохранение операции +
            } else if (el == 45) {
                res_1 = res_2; // сохранение полученного res_1
                res_2=0; //обнуление res_2
                oper = Character.toString(el); //сохранение операции-
            } else if (el == 42) {
                res_1 = res_2; // сохранение полученного res_1
                res_2=0; //обнуление res_2
                oper = Character.toString(el); //сохранение операции *
            } else if (el == 47) {
                res_1 = res_2; // сохранение полученного res_1
                res_2=0; //обнуление res_2
                oper = Character.toString(el); //сохранение операции /
            } if (Character.isLetter(el)) {
                if (el == 88 || el == 120) {
                    res_4 = res_4 + 10;
                    System.out.println("res4 = " + res_4);
                } else if (el == 86 || el == 118) {
                    res_4 = res_4 + 5;
                    System.out.println("res4 = " + res_4);
                } else if (el == 73 || el == 105) {
                    res_4 = res_4 + 1;
                    System.out.println("res4 = " + res_4);
                }
//                System.out.println("elall = " + el);
            }
        }

//        Выбоо знака математической операции и вызов соотвествующего метода
        switch(oper) {
            case "+":
                System.out.println("result = " + summ(res_1, res_2));
                break;
            case "-":
                System.out.println("result = " + sub(res_1, res_2));
                break;
            case "*":
                System.out.println("result = " + mul(res_1, res_2));
                break;
            case "/":
                System.out.println("result = " + div(res_1, res_2));
                break;
        }

    }
//    Метод суммы
    public static int summ(int a, int b) {
        return a + b;
    }
//    Метод разности
    public static int sub(int a, int b) {
        return a - b;
    }
//    Метод умножения
    public static int mul(int a, int b) {
        return a * b;
    }
//    Метод деления
    public static int div(int a, int b) {
        return a / b;
    }
}
