package lesson_8_oop_interfaces.composition;

public class Cooler {
    private final String model;
    private final int voltage;

    public Cooler(String model, int voltage) {
        this.model = model;
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\n\t\t" +
                "Voltage: " + this.voltage;
    }
}
