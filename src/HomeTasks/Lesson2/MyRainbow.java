package HomeTasks.Lesson2;

import java.util.Scanner;

public class MyRainbow {
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
        if (numFirst == 1 && numSecond == 2) {
            System.out.println(phrase + RED + " " + ORANGE);
        } else if
        (numFirst == 1 && numSecond == 3) {
            System.out.println(phrase + RED + " " + YELLOW);
        } else if
        (numFirst == 1 && numSecond == 4) {
            System.out.println(phrase + RED + " " + GREEN);
        } else if
        (numFirst == 1 && numSecond == 5) {
            System.out.println(phrase + RED + " " + BLUE);
        } else if
        (numFirst == 1 && numSecond == 6) {
            System.out.println(phrase + RED + " " + INDIGO);
        } else if
        (numFirst == 1 && numSecond == 7) {
            System.out.println(phrase + RED + " " + VIOLET);
        } else if
        (numFirst == 2 && numSecond == 1) {
            System.out.println(phrase + ORANGE + " " + RED);
        } else if
        (numFirst == 2 && numSecond == 3) {
            System.out.println(phrase + ORANGE + " " + YELLOW);
        } else if
        (numFirst == 2 && numSecond == 4) {
            System.out.println(phrase + ORANGE + " " + GREEN);
        } else if
        (numFirst == 2 && numSecond == 5) {
            System.out.println(phrase + ORANGE + " " + BLUE);
        } else if
        (numFirst == 2 && numSecond == 6) {
            System.out.println(phrase + ORANGE + " " + INDIGO);
        } else if
        (numFirst == 2 && numSecond == 7) {
            System.out.println(phrase + ORANGE + " " + VIOLET);
        } else if
        (numFirst == 3 && numSecond == 1) {
            System.out.println(phrase + YELLOW + " " + RED);
        } else if
        (numFirst == 3 && numSecond == 2) {
            System.out.println(phrase + YELLOW + " " + ORANGE);
        } else if
        (numFirst == 3 && numSecond == 4) {
            System.out.println(phrase + YELLOW + " " + GREEN);
        } else if
        (numFirst == 3 && numSecond == 5) {
            System.out.println(phrase + YELLOW + " " + BLUE);
        } else if
        (numFirst == 3 && numSecond == 6) {
            System.out.println(phrase + YELLOW + " " + INDIGO);
        } else if
        (numFirst == 3 && numSecond == 7) {
            System.out.println(phrase + YELLOW + " " + VIOLET);
        } else if
        (numFirst == 4 && numSecond == 1) {
            System.out.println(phrase + GREEN + " " + RED);
        } else if
        (numFirst == 4 && numSecond == 2) {
            System.out.println(phrase + GREEN + " " + ORANGE);
        } else if
        (numFirst == 4 && numSecond == 3) {
            System.out.println(phrase + GREEN + " " + YELLOW);
        } else if
        (numFirst == 4 && numSecond == 5) {
            System.out.println(phrase + GREEN + " " + BLUE);
        } else if
        (numFirst == 4 && numSecond == 6) {
            System.out.println(phrase + GREEN + " " + INDIGO);
        } else if
        (numFirst == 4 && numSecond == 7) {
            System.out.println(phrase + GREEN + " " + VIOLET);
        } else if
        (numFirst == 5 && numSecond == 1) {
            System.out.println(phrase + BLUE + " " + RED);
        } else if
        (numFirst == 5 && numSecond == 2) {
            System.out.println(phrase + BLUE + " " + ORANGE);
        } else if
        (numFirst == 5 && numSecond == 3) {
            System.out.println(phrase + BLUE + " " + YELLOW);
        } else if
        (numFirst == 5 && numSecond == 4) {
            System.out.println(phrase + BLUE + " " + GREEN);
        } else if
        (numFirst == 5 && numSecond == 6) {
            System.out.println(phrase + BLUE + " " + INDIGO);
        } else if
        (numFirst == 5 && numSecond == 7) {
            System.out.println(phrase + BLUE + " " + VIOLET);
        } else if
        (numFirst == 6 && numSecond == 1) {
            System.out.println(phrase + INDIGO + " " + RED);
        } else if
        (numFirst == 6 && numSecond == 2) {
            System.out.println(phrase + INDIGO + " " + ORANGE);
        } else if
        (numFirst == 6 && numSecond == 3) {
            System.out.println(phrase + INDIGO + " " + YELLOW);
        } else if
        (numFirst == 6 && numSecond == 4) {
            System.out.println(phrase + INDIGO + " " + GREEN);
        } else if
        (numFirst == 6 && numSecond == 5) {
            System.out.println(phrase + INDIGO + " " + BLUE);
        } else if
        (numFirst == 6 && numSecond == 7) {
            System.out.println(phrase + INDIGO + " " + VIOLET);
        } else if
        (numFirst == 7 && numSecond == 1) {
            System.out.println(phrase + VIOLET + " " + RED);
        } else if
        (numFirst == 7 && numSecond == 2) {
            System.out.println(phrase + VIOLET + " " + ORANGE);
        } else if
        (numFirst == 7 && numSecond == 3) {
            System.out.println(phrase + VIOLET + " " + YELLOW);
        } else if
        (numFirst == 7 && numSecond == 4) {
            System.out.println(phrase + VIOLET + " " + GREEN);
        } else if
        (numFirst == 7 && numSecond == 5) {
            System.out.println(phrase + VIOLET + " " + BLUE);
        } else if
        (numFirst == 7 && numSecond == 6) {
            System.out.println(phrase + VIOLET + " " + INDIGO);
        } else if
        (numFirst == numSecond) {
            inputInvalid();
        }
    }
}

