package lesson_8_oop_interfaces.composition;

public class RAM {
    private final String model;
    private final int size;

    public RAM(String model, int size) {
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\n\t\t" +
                "Size: " + this.size;
    }
}
