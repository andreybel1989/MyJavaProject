package HomeTasks.Lesson3;

import HomeTasks.Lesson1.House;

public class Runner {
    public static void main(String[] args) {
        System.out.println("\n" + "         Задание 1      " + "\n");
        int valueCat = 10;
        while (valueCat > 0) {
            Cats myCat = new Cats();
            valueCat--;
            System.out.println("name default  " + myCat.defAge + "   age default  " + myCat.defName);
        }
        System.out.println("\n" + "         Задание 2      " + "\n");
        for (int i = 0; i < 10; i++) {
            Cats otherCat = new Cats();
            Cats name = new Cats();
            name.setName(Cats.inputName());
            String nameNum = name.getName();

            Cats age = new Cats();
            age.setAge(Cats.inputAge());
            Integer ageNum = name.getAge();

            System.out.println("Name cat is ---" + nameNum + "   age cat---" + ageNum);

        }
        System.out.println("\n" + "         Задание 3      " + "\n");
        int namberCat = 10;
        do {
            Cats streetCat = new Cats(Cats.inputName(), Cats.inputAge());
            System.out.println(streetCat);
            namberCat--;
        } while (namberCat > 0);
        System.out.println("\n" + "         Задание 4      " + "\n");
        Cats[] catArr = new Cats[5];
        catArr[0] = new Cats(Cats.inputName(), Cats.inputAge());
        catArr[1] = new Cats(Cats.inputName(), Cats.inputAge());
        catArr[2] = new Cats(Cats.inputName(), Cats.inputAge());
        catArr[3] = new Cats(Cats.inputName(), Cats.inputAge());
        catArr[4] = new Cats(Cats.inputName(), Cats.inputAge());
        for (int i = 0; i < 5; i++)
            System.out.println(catArr[i]);
        System.out.println(catArr[1].equals(catArr[2]) );
        System.out.println(catArr[1].equals(catArr[1]) );
        System.out.println( );
    }

}



