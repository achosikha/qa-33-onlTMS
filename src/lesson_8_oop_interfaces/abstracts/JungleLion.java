package lesson_8_oop_interfaces.abstracts;

public class JungleLion extends Lion{
    public JungleLion(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " runs.");
    }

    @Override
    public void jump() {
        System.out.println(this.getClass().getSimpleName() + " jumps.");
    }
}