package HomeTasks.Lesson5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static String inputName() {
        String characters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String randomString = "";
        int lengh = 7;
        Random rand = new Random();
        char[] result = new char[lengh];
        for (int i = 0; i < lengh; i++) {
            result[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for (int i = 0; i < result.length; i++) {
            randomString += result[i];
        }
        return randomString;

    }

    public static String inputNum() {

        Random random = new Random();
        double result = random.nextDouble();
        String value = new DecimalFormat("#0.00000").format(result + 1);
        return value;

    }

    static String array[] = new String[100];

    public static String[] greatArrayOne() {

        for (int i = 0; i < 100; i++) {

            int sum = (i + 1) % 3;
            if (sum == 0) {
                array[i] = inputName();
            } else {
                array[i] = inputNum();
            }
        }
        return array;
    }

    static String arrayDouble[][] = new String[10][10];

    public static String[][] greatArrayDouble() {
        int k = 0;
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble.length; j++) {
                arrayDouble[i][j] = array[k];
                k++;
            }
        }
        return arrayDouble;
    }

    static String arrayDiagonalBasic[] = new String[10];

    public static String greatArrayDiagonalBasic() {
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble.length; j++) {
                if (i == j) {
                    arrayDiagonalBasic[i] = arrayDouble[i][j];
                }
            }
            System.out.print(arrayDiagonalBasic[i] + " ");
        }
        return String.valueOf(arrayDiagonalBasic);
    }

    static String arrayDiagonalMore[] = new String[10];

    public static String greatArreyDiagonalMore() {
        System.out.println("\n");
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble.length; j++) {
                if (i == arrayDouble.length - j - 1) {
                    arrayDiagonalMore[i] = arrayDouble[i][j];
                }
            }
            System.out.print(arrayDiagonalMore[i] + " ");
        }
        return String.valueOf(arrayDiagonalMore);
    }

    public static void compareDiagonal() {
        boolean result = Arrays.equals(arrayDiagonalBasic, arrayDiagonalMore);
        System.out.println("\n" + result);
    }

    static String arreyUniteDioganal[] = new String[arrayDiagonalBasic.length + arrayDiagonalMore.length];

    public static String greatArrayUniteDiagonal() {

        for (int i = 0; i < arrayDiagonalBasic.length; i++) {
            arreyUniteDioganal[i] = arrayDiagonalBasic[i];
        }
        for (int i = arreyUniteDioganal.length - arrayDiagonalBasic.length; i < arreyUniteDioganal.length; i++) {
            arreyUniteDioganal[i] = arrayDiagonalMore[i - arrayDiagonalBasic.length];
        }
        for (int i = 0; i < arreyUniteDioganal.length; i++) {
            System.out.print(arreyUniteDioganal[i] + " ");
        }
        return String.valueOf(arreyUniteDioganal);
    }

    public static void outputArrayStr() {

        StringBuilder arrayStrOne = new StringBuilder(arreyUniteDioganal[1]);
        StringBuilder arrayStrSecond = new StringBuilder(arreyUniteDioganal[4]);
        StringBuilder arrayStrThird = new StringBuilder(arreyUniteDioganal[7]);
        System.out.println("\n" + arrayStrOne.subSequence(2, 5) + "," + arrayStrSecond.subSequence(2, 5) + "," +
                arrayStrThird.substring(2, 5));
    }

    static Double arrayNum[] = new Double[17];

    public static void inputArrayNum() {
        Double result0 = Double.parseDouble(arreyUniteDioganal[0].replace(",", "."));
        if (result0 >= 1.7) {
            result0 = Math.ceil(result0);
        } else result0 = Math.floor(result0);
        arrayNum[0] = result0;
        Double result1 = Double.parseDouble(arreyUniteDioganal[2].replace(",", "."));
        if (result1 >= 1.7) {
            result1 = Math.ceil(result1);
        } else result1 = Math.floor(result1);
        arrayNum[1] = result1;
        Double result2 = Double.parseDouble(arreyUniteDioganal[3].replace(",", "."));
        if (result2 >= 1.7) {
            result2 = Math.ceil(result2);
        } else result2 = Math.floor(result2);
        arrayNum[2] = result2;
        Double result3 = Double.parseDouble(arreyUniteDioganal[5].replace(",", "."));
        if (result3 >= 1.7) {
            result3 = Math.ceil(result3);
        } else result3 = Math.floor(result3);
        arrayNum[3] = result3;
        Double result4 = Double.parseDouble(arreyUniteDioganal[6].replace(",", "."));
        if (result4 >= 1.7) {
            result4 = Math.ceil(result4);
        } else result4 = Math.floor(result4);
        arrayNum[4] = result4;
        Double result5 = Double.parseDouble(arreyUniteDioganal[8].replace(",", "."));
        if (result5 >= 1.7) {
            result5 = Math.ceil(result5);
        } else result5 = Math.floor(result5);
        arrayNum[5] = result5;
        Double result6 = Double.parseDouble(arreyUniteDioganal[9].replace(",", "."));
        if (result6 >= 1.7) {
            result6 = Math.ceil(result6);
        } else result6 = Math.floor(result6);
        arrayNum[6] = result6;
        Double result7 = Double.parseDouble(arreyUniteDioganal[10].replace(",", "."));
        if (result7 >= 1.7) {
            result7 = Math.ceil(result7);
        } else result7 = Math.floor(result7);
        arrayNum[7] = result7;
        Double result8 = Double.parseDouble(arreyUniteDioganal[11].replace(",", "."));
        if (result8 >= 1.7) {
            result8 = Math.ceil(result8);
        } else result8 = Math.floor(result8);
        arrayNum[8] = result8;
        Double result9 = Double.parseDouble(arreyUniteDioganal[12].replace(",", "."));
        if (result9 >= 1.7) {
            result9 = Math.ceil(result9);
        } else result9 = Math.floor(result9);
        arrayNum[9] = result9;
        Double result10 = Double.parseDouble(arreyUniteDioganal[13].replace(",", "."));
        if (result10 >= 1.7) {
            result10 = Math.ceil(result10);
        } else result10 = Math.floor(result10);
        arrayNum[10] = result10;
        Double result11 = Double.parseDouble(arreyUniteDioganal[14].replace(",", "."));
        if (result11 >= 1.7) {
            result11 = Math.ceil(result11);
        } else result11 = Math.floor(result11);
        arrayNum[11] = result11;
        Double result12 = Double.parseDouble(arreyUniteDioganal[15].replace(",", "."));
        if (result12 >= 1.7) {
            result12 = Math.ceil(result12);
        } else result12 = Math.floor(result12);
        arrayNum[12] = result12;
        Double result13 = Double.parseDouble(arreyUniteDioganal[16].replace(",", "."));
        if (result13 >= 1.7) {
            result13 = Math.ceil(result13);
        } else result13 = Math.floor(result13);
        arrayNum[13] = result13;
        Double result14 = Double.parseDouble(arreyUniteDioganal[17].replace(",", "."));
        if (result14 >= 1.7) {
            result14 = Math.ceil(result14);
        } else result14 = Math.floor(result14);
        arrayNum[14] = result14;
        Double result15 = Double.parseDouble(arreyUniteDioganal[18].replace(",", "."));
        if (result15 >= 1.7) {
            result15 = Math.ceil(result15);
        } else result15 = Math.floor(result15);
        arrayNum[15] = result15;
        Double result16 = Double.parseDouble(arreyUniteDioganal[19].replace(",", "."));
        if (result16 >= 1.7) {
            result16 = Math.ceil(result16);
        } else result16 = Math.floor(result16);
        arrayNum[16] = result16;

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + "_");
        }
        System.out.println("\n");
    }

    public static void printMatrix() {
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble[i].length; j++) {
                System.out.print(arrayDouble[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
