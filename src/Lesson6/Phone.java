package Lesson6;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }
    @Override
    public String toString(){
        return "[\"" + number + "\", \"" + model + "\", \"" + weight + "\"]";
    }

    public String receiveCall(int number){
        String name = null;

        switch (number){
            case 1234567:
                name = "Marina";
                System.out.println("Звонит " + name);
                break;
            case 7654321:
                name = "Lena";
                System.out.println("Звонит " + name);
                break;
            default: System.out.println("Номер не известен");
                break;
        }
        return name;
    }

    public void receiveCall(String name, int number){
        if (name == null) {
            System.out.println("Номер не известен - " + number);
        }
        else {
        System.out.println(name + " - " + number);
        }
    }

    public void getNumber(int number){
        System.out.println("Номер телефона: " + number);
    }

    public int[] sendMessage(int ... number){
        System.out.println("Сообщение для " + number);
        return number;
    }

    public int getNumber() {return number;}

    public void setNumber(int number) {this.number = number;}

    public String getModel(){return model;}

    public void setModel(String model) {this.model = model;}

    public double getWeight(){return weight;}

    public void setWeight(double weight) {this.weight = weight;}
}
