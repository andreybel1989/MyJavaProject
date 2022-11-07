package HomeTasks.Lesson6;

public class Phone {
    private int weight;
    private String model, number, name;

    public void runnerPhone() {
        Phone phoneNokia = new Phone(120, "Nokia7710", "+375295556699", "Vadim");
        System.out.println(phoneNokia.model + " " + phoneNokia.number + " " + phoneNokia.weight);
        phoneNokia.receiveCall(phoneNokia.name);
        phoneNokia.receiveCall(phoneNokia.getName(), phoneNokia.getNumber());

        Phone phoneSamsung = new Phone(100, "Samsung-Y7", "+375296668877", "Marina");
        System.out.println(phoneSamsung.model + " " + phoneSamsung.number + " " + phoneSamsung.weight);
        phoneSamsung.receiveCall(phoneSamsung.name);
        phoneSamsung.receiveCall(phoneSamsung.getName(), phoneSamsung.getNumber());

        Phone phoneZTE = new Phone(250, "ZTE1423", "+375298885544", "Bob");
        System.out.println(phoneZTE.model + " " + phoneZTE.number + " " + phoneZTE.weight);
        phoneZTE.receiveCall(phoneZTE.name);
        phoneZTE.receiveCall(phoneZTE.getName(), phoneZTE.getNumber());

        sendMessage(phoneNokia.getNumber(), phoneSamsung.getNumber(), phoneZTE.getNumber());


    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + "  его номер " + number);
    }

    public void sendMessage(String... number) {
        for (String s : number) {
            System.out.println("отправить сообщение на номер " + s + " ");
        }
    }

    public Phone() {

    }

    public Phone(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public Phone(int weight, String model, String number) {
        this(weight, model);
        this.number = number;
    }

    public Phone(int weight, String model, String number, String name) {
        this.weight = weight;
        this.model = model;
        this.number = number;
        this.name = name;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


