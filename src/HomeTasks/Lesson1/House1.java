package HomeTasks.Lesson1;


public class House1 {
    static int flat1 = 12;
    static short flat2 = 32;
    static long flat3;
    static int flat4 = 23;
    static byte flat5 = 4;
    static int flat6 = 553;
    static byte flat7;
    static float areaFlat1;
    static double areaFlat2;

    static String str = "Hello World";
    static Integer sumFlat = 3;


    public static void main(String[] args) {

        int room1 = 28;
        long room2 = 34;
        var room3 = room1 + room2;
        Integer sumRoom = 6;


        flat3 = flat5;                      // автоматическое преобразование
        flat7 = (byte) flat1;                 // преобразование  int в byte
        areaFlat1 = flat1;                   // преобразование int во float
        areaFlat2 = flat2 + flat4;
        flat6 = sumFlat + sumRoom;
        byte room4 = (byte) (room1 + room2);


        System.out.println(" flat1=" + flat1 + "\n flat2=" + flat2 + "\n flat3=" + flat3 + "\n flat4=" + flat4 +
                " \n flat5=" + flat5 + "\n flat6=" + flat7);
        System.out.println("areaFlat1=" + areaFlat1 + "  areaFlat2=" + areaFlat2 + "\n" + str + "\n" +
                "sumFlat=" + sumFlat);
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println(room4);
        System.out.println("sumRoom=" + sumRoom);

        House entrance = new House();
        entrance.setEntrance((byte) 3);
        byte entranceNum = entrance.getEntrance();
        System.out.println("entrance--" + entranceNum);

        House floor = new House();
        floor.setFloor((short) 5);
        short floorNum = floor.getFloor();
        System.out.println("flor--" + floorNum);

//        House flatOne = new House();                             тоже работает если flatOne не Private
//        flatOne.setFlatOne(34);
//        System.out.println("flat--" + flatOne.flatOne);

        House flatOne = new House();
        flatOne.setFlatOne(34);
        int flatOneNum = flatOne.getFlatOne();
        System.out.println("flat--" + flatOneNum);

        House flatTwo = new House();
        flatTwo.setFlatTwo(54);
        long flatTwoNum = flatTwo.getFlatTwo();
        System.out.println("flat--" + flatTwoNum);

        House areLiv = new House();
        areLiv.setAreaLiv(94.865F);
        float areLivNum = areLiv.getAreaLiv();
        System.out.println("living space--" + areLivNum);

        House areTotal = new House();
        areTotal.setAreaTotal(135.8653315D);
        double areTotalNum = areTotal.getAreaTotal();
        System.out.println("living space--" + areTotalNum);

        House sing = new House();
        sing.setSign('#');
        char singNum = sing.getSign();
        System.out.println(singNum);

        House yes = new House();
        yes.setYes(true);
        boolean yesNum = yes.isYes();
        System.out.println(yesNum);

        House city = new House();
        city.setCity("Brest");
        String cityName = city.getCity();
        System.out.println(singNum + " My hometown--" + cityName + " it is--" + yesNum);

        House room = new House();
        room.setRoom((byte) 8);
        Byte roomNum = room.getRoom();
        System.out.println("room--" + roomNum);

        House door = new House();
        door.setDoor((short) 15);
        Short doorNum = door.getDoor();
        System.out.println("door--" + doorNum);

        House nom = new House();
        nom.setNom(12);
        Integer nomNum = nom.getNom();
        System.out.println("nom--" + nomNum);

        House loggia = new House();
        loggia.setLoggia(23425346457L);
        Long loggiaNum = loggia.getLoggia();
        System.out.println("loggia--" + loggiaNum);

        House areaHall = new House();
        areaHall.setAreaHall(23423425.34535436F);
        Float areaHallNum = areaHall.getAreaHall();
        System.out.println("areaHall--" + areaHallNum);

        House areaKitchen = new House();
        areaKitchen.setAreaKitchen(2323442342343.323525252523);
        Double areaKitchenNum = areaKitchen.getAreaKitchen();
        System.out.println("areaKitchen--" + areaKitchenNum);

        House symbol = new House();
        symbol.setSymbol('@');
        Character symbolNum = symbol.getSymbol();
        System.out.println(symbolNum);

        House no = new House();
        no.setNo(false);
        Boolean noNum = no.getNo();
        System.out.println(noNum);


    }
}

