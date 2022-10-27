package HomeTasks.Lesson3;

import java.util.Random;

public class Cats {
    public int defAge = 5;
    public String defName = "Vasia";
    private static int age;
    private static String name;

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Cats.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Cats.name = name;
    }

    public Cats() {
    }

    public Cats (String name, int age) {
        this.name = inputName();
        this.age = inputAge();
    }

    @Override
    public String toString() {
        return "Cats{" +
                "cat age is =" + age +
                ", cat name is ='" + name + '\'' +
                '}';
    }

    public static int inputAge() {
        int min = 1;
        int max = 28;
        int diff = max - min;
        Random random = new Random();
        int result = random.nextInt(diff);
        result += 1;
        return result;


    }

    public static String inputName() {
        String characters = "qwertyuiopasdfghjklzxcvbnm";
        String randomString = "";
        int lengh = 5;
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
}
