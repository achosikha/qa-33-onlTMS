package lesson_8_oop_interfaces.composition;

public class Processor {
    private final String processor;
    private final double speed;
    private final int cores;

    public Processor(String processor, double speed, int cores) {
        this.processor = processor;
        this.speed = speed;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Model: " + this.processor + "\n\t\t" +
                "Speed: " + this.speed + "\n\t\t" +
                "Cores: " + this.cores;
    }
}