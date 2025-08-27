package lesson_8_oop_interfaces.composition;

public class HDD {
    private final String model;
    private final String type;
    private final int capacity;

    public HDD(String model, String type, int capacity) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\n\t\t" +
                "Type: " + this.type  + "\n\t\t" +
                "Capacity: " + this.capacity;
    }
}
