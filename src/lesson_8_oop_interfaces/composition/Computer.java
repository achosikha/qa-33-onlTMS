package lesson_8_oop_interfaces.composition;

// Парадигма - COMPOSITION - композиция
// INHERITANCE - отношение строиться по принципу ЯВЛЯЕТСЯ, is a
// BMW is a CAR, CAR is an OBJECT
// Landcruiser is a TOYOTA, TOYOTA is a CAR, CAR is an Object

// Computer PC:
// CASE + PROCESSOR, RAM, MOTHERBOARD, HDD, COOLER - отношение между объектами ИМЕЕТ has, надо использовать КОМПОЗИЦИЮ
public class Computer {
    final private String computerModel;
    final private Processor processor;
    final private Motherboard motherboard;
    final private RAM ram;
    final private HDD hdd;
    final private Cooler cooler;

    public Computer(String computerModel, Processor processor, Motherboard motherboard,
                    RAM ram, HDD hdd, Cooler cooler) {
        this.computerModel = computerModel;
        this.processor = processor;
        this.motherboard = motherboard;
        this.ram = ram;
        this.hdd = hdd;
        this.cooler = cooler;
    }

    @Override
    public String toString() {
        return "Computer: \n\t" +
                "My computer model: \n\t\t" + this.computerModel + "\n\t\t" +
                "My processor: \n\t\t" + this.processor + "\n\t\t" +
                "My motherboard: \n\t\t" + motherboard + "\n\t\t" +
                "My ram: \n\t\t" + this.ram + "\n\t\t" +
                "My hadd: \n\t\t" + this.hdd + "\n\t\t" +
                "My cooler: \n\t\t" + this.cooler;
    }
}
