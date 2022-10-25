package HomeTasks.Lesson2;

import java.util.Scanner;

public class MyRainbowOne {
    public static final String RED = "КРАСНЫЙ";
    public static final String ORANGE = "ОРАНЖЕВЫЙ";
    public static final String YELLOW = "ЖЕЛТЫЙ";
    public static final String GREEN = "ЗЕЛЕНЫЙ";
    public static final String BLUE = "ГОЛУБОЙ";
    public static final String INDIGO = "СИНИЙ";
    public static final String VIOLET = "ФИОЛЕТОВЫЙ";

    private static int numFirst = inputColorFirst();
    private static int numSecond = inputColorSecond();
    private static String phrase = "Цвет радуги : ";
    private static String x;
    private static String y;

    public static void printRainbowColor() {
        setMethod(numFirst, numSecond);
    }

    public static int inputColorFirst() {
        System.out.println("ТАБЛИЦА СООТВЕТСТВОВАНИЯ ЦВЕТОВ РАДУГИ \n 1 - КРАСНЫЙ \n 2 - ОРАНЖЕВЫЙ \n 3 - ЖЕЛТЫЙ\n" +
                " 4 - ЗЕЛЕНЫЙ \n 5 - ГОЛУБОЙ \n 6 - СИНИЙ \n 7 - ФИОЛЕТОВЫЙ ");
        System.out.println("Введите первое число радуги");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    public static int inputColorSecond() {
        System.out.println(" Если вы хотите получить смешаный цвет введите\n второе число радуги," +
                " в противном случае введите '0'");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }


    public static void inputInvalid() {
        System.out.println("Цвета совпадают");

    }

    public static void setMethod(int numFirst, int numSecond) {
        if (numFirst >= 1 && numFirst <= 7 && numSecond >= 1 && numSecond <= 7) {
            setColorSecond(numFirst, numSecond);
        } else if (numFirst < 1 || numFirst > 7) {
            System.out.println("Введены не верные значения первого цвета");
        } else if (numSecond < 0 || numSecond > 7) {
            System.out.println("Введены не верные значения второго цвета");
        } else if (numSecond == 0) {
            setColorOne(numFirst);
        }

    }


    public static void setColorOne(int numFirst) {
        switch (numFirst) {
            case 1:
                System.out.println(phrase + RED);
                break;
            case 2:
                System.out.println(phrase + ORANGE);
                break;
            case 3:
                System.out.println(phrase + YELLOW);
                break;
            case 4:
                System.out.println(phrase + GREEN);
                break;
            case 5:
                System.out.println(phrase + BLUE);
                break;
            case 6:
                System.out.println(phrase + INDIGO);
                break;
            case 7:
                System.out.println(phrase + VIOLET);
                break;
        }
    }

    public static void setColorSecond(int numFirst, int numSecond) {
        if (numFirst == numSecond) {
            inputInvalid();
        }


        switch (numFirst) {
            case 1:
                x = RED;
                break;
            case 2:
                x = ORANGE;
                break;
            case 3:
                x = YELLOW;
                break;
            case 4:
                x = GREEN;
                break;
            case 5:
                x = BLUE;
                break;
            case 6:
                x = INDIGO;
                break;
            case 7:
                x = VIOLET;
                break;
        }

        switch (numSecond) {
            case 1:
                y = RED;
                break;
            case 2:
                y = ORANGE;
                break;
            case 3:
                y = YELLOW;
                break;
            case 4:
                y = GREEN;
                break;
            case 5:
                y = BLUE;
                break;
            case 6:
                y = INDIGO;
                break;
            case 7:
                y = VIOLET;
                break;
        }
        System.out.println(phrase + x + " " + y);
    }
}

