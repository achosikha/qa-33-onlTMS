package lesson_8_oop_interfaces.cartemplate;

import java.util.Arrays;

public class Car {
    // Переменные класса, которые не должны после инициализации меняться извне
    // Почему их не сделать КОНСТАНТАМИ?
    // Ключевое слово const есть но оно не применяется в Джаве для инициализации неизменяемых небеременных
    // final - указывает компилятору что изменение значения ЗАПРЕЩЕНО
    final private String type;
    final private String model;
    final private String productionYear;
    final private int maxSpeed;
    final private int minSpeed;
    final private String[] spareParts;

    // ПРИНАДЛЕЖИТ НЕПОСРЕДСТВЕННО К КЛАССУ
    // У НАС СТАТИЧЕСКИЕ ПЕРЕМЕННЫЕ КАК И МЕТОДЫ ДЛЯ ВСЕЪ ЭКЗЕМПЛЯРОВ КЛАССА ЕДИНЫЕ
    // ЧТОБЫ К НИМ ПОЛУЧИТЬ ДОСТУП НАДО УКАЗАТЬ ПОКА САМ КЛАСС. - метод или переменная
    private static int counter;

    public Car(String type, String model, String productionYear, int maxSpeed, int minSpeed, String[] spareParts) {
        this.type = type;
        this.model = model;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.spareParts = spareParts;
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public void startCarEngine(){
        System.out.println(this.getClass().getSimpleName() + " ENGINE HAS BEEN STARTED!");
        System.out.println("DEFAULT METHOD.");
    }

    // final + method обозначает запрет на полиморфизм, т.е. нельзя в дочерних классах переопределять метод
    final public void getCarNotification(){
        System.out.println("This is a notification method that contains basic data from a SUPER-CLASS. " +
                "\nIT SHOULDN'T BE OVERRIDDEN!");
    }

    @Override
    public String toString() {
        return "Car: \n\t" +
                "Type: " + this.type + "\n\t" +
                "Model: " + this.model + "\n\t" +
                "Production year: " + this.productionYear + "\n\t" +
                "Maximum speed: " + this.maxSpeed + "\n\t" +
                "Minimum speed: " + this.minSpeed + "\n\t" +
                "Spare parts: " + Arrays.toString(this.spareParts);
    }
}
