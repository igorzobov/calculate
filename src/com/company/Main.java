package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int var1 = 0;
    int var2 = 0;
    int result = 0;
    String romanResult = "";
    char oper;
    boolean stateRoman1 = false;
    boolean stateRoman2 = false;
    boolean stateArabic1 = false;
    boolean stateArabic2 = false;

    //Ввод строки с клавиатуры
	Scanner scaner = new Scanner(System.in);
	String str = scaner.nextLine();
    str = str.replaceAll("\\s+", ""); //Избавляемся от пробелов
    str = str.toUpperCase(); //Перевод в верхний регистр
    String [] block = str.split("[+-/*]"); //Разбиваем строку на блоки по регулярному выражению соотвествующему одному из четырех символов
    oper = str.charAt(block[0].length()); //В переменную oper сохраняем символ соотвествующий символу строки стоящему под индесом равным длине первого блока(т.е. символу идущему сразу после первого блока)

    //Массивы ожидаемых значений
    String [] arabic = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String [] roman = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    //Проверка встреченных значений на соответствие одному из двух массиовов ожидаемых значений
        for (int i=0; i<=10; i++) {
            if (block[0].equals(roman[i])) {
                var1 = i;
                stateRoman1 = true;
            }
            if (block[1].equals(roman[i])) {
                var2 = i;
                stateRoman2 = true;
                stateArabic1 = false; // Костыль отлавливающий разность типов введенных значений
            }
        }
        for (int i=0; i<=10; i++) {
            if (block[0].equals(arabic[i])) {
                var1 = i;
                stateArabic1 = true;
            }
            if (block[1].equals(arabic[i])) {
                var2 = i;
                stateArabic2 = true;
                stateRoman1 = false; // Костыль отлавливающий разность типов введенных значений
            }
        }
        if (((stateRoman1 == true) && (stateRoman2 == true) && (var1>=0) && (var2>=0)) || ((stateArabic1 == true) && (stateArabic2 == true) && (var1>=0) && (var2>=0))) {
            switch(oper) {
                case 43:
                    result = calc.sum(var1, var2);
                    break;
                case 45:
                    result = calc.sub(var1, var2);
                    break;
                case 42:
                    result = calc.mul(var1, var2);
                    break;
                case 47:
                    result = calc.div(var1, var2);
                    break;
            } if ((stateRoman1 == true) && (stateRoman2 == true)) { // Перевод результата в римскую СС
                result = result+100;
                romanResult = romanToArabic.convert(result);
                System.out.println("result " + romanResult);
            } else
            System.out.println("result " + result);
        } else {
            System.out.println("ошибка!");
        }
    }
}
