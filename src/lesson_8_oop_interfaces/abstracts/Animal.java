package lesson_8_oop_interfaces.abstracts;

// ANIMAL это ВСЕГО ЛИШЬ НАБРОСОК
// ПОЭТОМУ, ТЫ НЕ МОЖЕШЬ ЕГО СОЗДАТЬ НА ОСНОВЕ САМОГО СЕБЯ
// НЕ ИМЕЕТ СМЫСЛА СОЗДАВАТЬ ЭКЗЕМПЛЯР КЛАССА ЖИВОТНОЕ, ЗДЕСЬ НЕТ КОНКРЕТИКИ
public abstract class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ABSTRACT METHOD ONLY IN AN ABSTRACT CLASS
    abstract void run();
    abstract void jump();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
