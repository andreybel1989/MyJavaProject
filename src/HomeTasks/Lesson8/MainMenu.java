package HomeTasks.Lesson8;

import java.util.Random;

public class MainMenu implements createRobot {
    Factori factori = new Factori();

    @Override
    public  void createNewRobot () {

        Robot factoryRobot1 = new Robot(inputNameRobot(), factori.getFactoriBody().bigBody, factori.getFactoriHead().bigHead);
        Robot factoryRobot2 = new Robot(inputNameRobot(), factori.getFactoriBody().bigBody, factori.getFactoriHead().middleHead);
        Robot factoryRobot3 = new Robot(inputNameRobot(), factori.getFactoriBody().bigBody, factori.getFactoriHead().smallHead);
        Robot factoryRobot4 = new Robot(inputNameRobot(), factori.getFactoriBody().middleBody, factori.getFactoriHead().bigHead);
        Robot factoryRobot5 = new Robot(inputNameRobot(), factori.getFactoriBody().middleBody, factori.getFactoriHead().middleHead);
        Robot factoryRobot6 = new Robot(inputNameRobot(), factori.getFactoriBody().middleBody, factori.getFactoriHead().smallHead);
        Robot factoryRobot7 = new Robot(inputNameRobot(), factori.getFactoriBody().smallBody, factori.getFactoriHead().bigHead);
        Robot factoryRobot8 = new Robot(inputNameRobot(), factori.getFactoriBody().smallBody, factori.getFactoriHead().middleHead);
        Robot factoryRobot9= new Robot(inputNameRobot(), factori.getFactoriBody().smallBody, factori.getFactoriHead().smallHead);
        System.out.println(factoryRobot1 +"\n"+ factoryRobot2+"\n"+factoryRobot3+"\n"+factoryRobot4+"\n"+factoryRobot5+"\n"+
                factoryRobot6+"\n"+factoryRobot7+"\n"+factoryRobot8+"\n"+factoryRobot9);
    }

    public String inputNameRobot() {
        String characters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String nameRobot = "";
        int lengh = 5;
        Random rand = new Random();
        char[] result = new char[lengh];
        for (int i = 0; i < lengh; i++) {
            result[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for (int i = 0; i < result.length; i++) {
            nameRobot += result[i];
        }

        return nameRobot;

    }
    public static void StartCreateNewRobot(){
        MainMenu mainMenu=new MainMenu();
        mainMenu.createNewRobot();

    }
}