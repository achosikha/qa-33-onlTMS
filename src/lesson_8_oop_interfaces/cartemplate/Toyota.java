package lesson_8_oop_interfaces.cartemplate;

public class Toyota extends Car{
    public Toyota(String type, String model, String productionYear, int maxSpeed, int minSpeed, String[] spareParts) {
        super(type, model, productionYear, maxSpeed, minSpeed, spareParts);
    }

    @Override
    public void startCarEngine() {
        System.out.println(this.getClass().getSimpleName() + " STARTS ENGINE!");
        System.out.println("Welcome to " + this.getClass().getSimpleName() + " CAR.");
    }

    public void getToyotaNotification(){
        System.out.println("This is general notification message from TOYOTA CLASS.");
    }
}