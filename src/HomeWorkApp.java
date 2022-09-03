/**
 * Created by Chernykh on 03.09.2022
 */
public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sum(-5, 16));
        System.out.println(isNumber(-1));
        System.out.println(isInteger(1));
        print("Hello World", 2);
        System.out.println(leapYear(2022));
        System.out.println(leapYear(1900));
        System.out.println(leapYear(2000));

    }

    static void printThreeWords() {
        System.out.println("""
                Orange
                Banana
                Apple""");
    }

    static void checkSumSign() {
        int a = 5;
        int b = 6;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    static void compareNumbers() {
        int a = 2;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    static boolean sum(int a, int b) {
        int sum = a + b;
        boolean sumIs = false;
        if (sum >= 10 && sum <= 20) {
            sumIs = true;
        }
        return sumIs;
    }

    static String isNumber(int a) {
        String msg;
        if (a >= 0) {
            msg = "Положительное число";
        } else msg = "Отрицательное число";
        return msg;
    }

    static boolean isInteger(int a) {
        return a < 0;
    }


    static String print(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
        return null;
    }

    static boolean leapYear(int year) {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }
}


