package lesson_8_oop_interfaces.cartemplate;

public class Landcruiser extends Toyota{
    public Landcruiser(String type, String model, String productionYear, int maxSpeed, int minSpeed, String[] spareParts) {
        super(type, model, productionYear, maxSpeed, minSpeed, spareParts);
    }

    public void getLandcruiserData(){
        System.out.println(this.getClass().getSimpleName() + " is a child model of the Toyota.");
        System.out.println("This method had been called from the class: " + this.getClass().getSimpleName());
    }
}