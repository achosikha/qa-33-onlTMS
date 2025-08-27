package lesson_8_oop_interfaces.composition;

public class Motherboard {
    private final String model;
    private final int slots;

    public Motherboard(String model, int slots) {
        this.model = model;
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\n\t\t" +
                "Slots: " + this.slots;
    }
}
