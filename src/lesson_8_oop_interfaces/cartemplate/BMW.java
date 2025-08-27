package lesson_8_oop_interfaces.cartemplate;

// final + class означает ЗАПРЕТ НА НАСЛЕДОВАНИЕ ЭТОГО КЛАССА
// В данном случае, мы не может больше у наследоваться от класса BMW
final public class BMW extends Car{
    public BMW(String type, String model, String productionYear, int maxSpeed, int minSpeed, String[] spareParts) {
        super(type, model, productionYear, maxSpeed, minSpeed, spareParts);
    }

    @Override
    public void startCarEngine() {
        System.out.println(this.getClass().getSimpleName() + " STARTS ENGINE!");
        System.out.println("Welcome to " + this.getClass().getSimpleName() + " CAR.");
    }
}
