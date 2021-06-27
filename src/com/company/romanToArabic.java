package com.company;

public class romanToArabic {
    public static String convert(int var) {
        String result = "";
        String[] roman = {
                "-C","-XCIX", "-XCVIII", "-XCVII", "-XCVI", "-XCV", "-XCIV", "-XCIII", "-XCII", "-XCI",
                "-XC","-LXXXIX", "-LXXXVIII", "-LXXXVII", "-LXXXVI", "-LXXXV", "-LXXXIV", "-LXXXIII", "-LXXXII", "-LXXXI",
                "-LXXX","-LXXIX", "-LXXVIII", "-LXXVII", "-LXXVI", "-LXXV", "-LXXIV", "-LXXIII", "-LXXII", "-LXXI",
                "-LXX","-LXIX", "-LXVIII", "-LXVII", "-LXVI", "-LXV", "-LXIV", "-LXIII", "-LXII", "-LXI",
                "-LX","-LIX", "-LVIII", "-LVII", "-LVI", "-LV", "-LIV", "-LIII", "-LII", "-LI",
                "-L","-XLIX", "-XLVIII", "-XLVII", "-XLVI", "-XLV", "-XLIV", "-XLIII", "-XLII", "-XLI",
                "-XL","-XXXIX", "-XXXVIII", "-XXXVII", "-XXXVI", "-XXXV", "-XXXIV", "-XXXIII", "-XXXII", "-XXXI",
                "-XXX","-XXIX", "-XXVIII", "-XXVII", "-XXVI", "-XXV", "-XXIV", "-XXIII", "-XXII", "-XXI",
                "-XX","-XIX", "-XVIII", "-XVII", "-XVI", "-XV", "-XIV", "-XIII", "-XII", "-XI",
                "-X","-IX", "-VIII", "-VII", "-VI", "-V", "-IV", "-III", "-II", "-I",
                "0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXVXIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCIII", "XCIX", "C"
        };
        result = roman[var];
        return result;
    }
}
