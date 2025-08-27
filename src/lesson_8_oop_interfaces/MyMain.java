package lesson_8_oop_interfaces;

import lesson_8_oop_interfaces.abstracts.*;
import lesson_8_oop_interfaces.cartemplate.*;
import lesson_8_oop_interfaces.composition.*;

public class MyMain {
    // ключевое слово static - все в рамках static принадлежит самому КЛАССУ
    // Когда у нас обычный метод, переменная - она каждая своя у экземпляров класса
    public static void main(String[] args) {
        // Entry-point
        createAnimal();
    }

    public static void createAnimal(){
        JungleLion jungleLion = new JungleLion("Mufasa", 10);
        Wolf wolf = new Wolf("Kira", 5);

        System.out.println(jungleLion);
        jungleLion.run();
        jungleLion.jump();
        System.out.println("-".repeat(50));
        System.out.println(wolf);
        wolf.run();
        wolf.jump();
    }

    public static void createComputer(){
        Computer pci9 = new Computer(
                "PC i9 ADVANCED",
                new Processor("i9", 3.2, 8),
                new Motherboard("JK-456", 10),
                new RAM("DDR5", 32),
                new HDD("Kingston", "HDD", 1000),
                new Cooler("H-Hot", 220)
        );

        System.out.println(pci9);
    }

    // 1. СТАТИКА ПРИНАДЛЕЖИТ КЛАССУ, ДОСТУП ЧЕРЕЗ ИМЯ КЛАССА. +
    // 2. Статические методы работают только со статическими методами и переменными
    // 3. Из нестатических методов вызывать статику?
    public void getNonStaticMethod(){
        System.out.println("This is a non-static method.");
        getCar();
    }

    public static void getBasicParentClasses(){
        // БАЗОВЫЙ КЛАСС - это МАШИНА
        // ДОЧЕРНИЙ КЛАСС - это тоже МАШИНА
        // Car general = new Car() -> Car ... базовый класс, а new Car() дочерний
        Car general = new Car("Racing", "KL-98", "2025",
                40, 320, new String[]{});

        // Basic class - CAR, child class - BMW
        Car bmw = new BMW("BMW", "Sedan", "2019",
                30, 220, new String[]{});
        // Basic class - Car, child class = Mercedes
        Car mercedes = new Mercedes("Mercedes", "Jeep", "1994",
                20, 180, new String[]{});

        // Basic class - Car, child class - Toyota
        Car carToyota = new Toyota("Car Toyota", "Regular", "2018",
                20, 200, new String[]{});

        // Basic Toyota, child class - Toyota
        Toyota toyota = new Toyota("Toyota", "Racing", "2022",
                40, 320, new String[]{});

        // Basic Toyota, child class - Landcruiser
        Toyota toyotaLandcruiser = new Landcruiser("Toyota Landcruiser", "Regular", "2012",
                120, 180, new String[]{});

        // (Super-class) Basic Landcruiser, child class - Landcruiser
        Landcruiser landcruiser = new Landcruiser("Landcriuser", "Regular", "2017",
                30, 280, new String[]{});

        general.getCarNotification();
        bmw.startCarEngine();
        mercedes.startCarEngine();

        // Есть доступ к МЕТОДАМ СУПЕР-КЛАССА, но не к методам ДОЧЕРНЕГО
        // (Super-class) БАЗОВЫЙ КЛАСС - ПРЕДОПРЕДЕЛЯЕТ ФУНКЦИОНАЛ
        carToyota.startCarEngine();

        // Я взял за основу не МАШИНУ, а TOYOTA, весь функционал от класса МАШИНА + весь функционал от класса TOYOTA
        toyota.getToyotaNotification();

        // Toyota ... = new Landcruiser() -> функционал TOYOTA
        toyotaLandcruiser.getToyotaNotification();

        // Landcruiser - весь функционал от класса МАШИНА + TOYOTA + Landcruiser
        landcruiser.getLandcruiserData();

        // OBJECT - CAR - TOYOTA - Landcruiser
        // Landcruiser = new Landcruiser, все методы по цепочке свои, TOYOTA, машина, Object
        // Toyota = new Landcruiser, все из TOYOTA, Машина, Object
        // Toyota = new Toyota, все свое + смотрю наверх, что ЕСТЬ? Это МАШИНА + Object

        // Object - Human - Staff - IT
        // Staff = new IT, methods from Staff, Human, Object

        // Object - Person - Male
        // Object - Staff - IT

        // Object - Staff = new Male !!! ERROR
        // CAR - TOYOTA - Landcruiser
        // Landcruiser может уложиться TOYOTA, CAR, Object
        // Toyota - CAR, Object
        // НЕЛЬЗЯ УЛОЖИТЬ по ИЕРАРХИИ БОЛЬШЕЕ В МЕНЬШЕЕ В КЛАССАХ
        double valueDouble = 346.45;
        int value = (int) valueDouble;

        BMW generalBMW = new BMW("BMW", "G", "G", 0, 120, new String[]{});

        System.out.println(Car.getCounter());
    }

    public static void getCar(){
        Car someCar = new Car("Sedan", "JK34-00", "2016", 20, 220,
                                new String[]{"Panel", "Front Window", "Wheels"});

        System.out.println(someCar);

        System.out.println("-".repeat(50));

        Car[] cars = new Car[]{
                new Mercedes("Regular", "CR-18", "2022",
                        30, 280, new String[]{}),
                new Toyota("Jeep", "RAV-4", "2019",
                        25, 260, new String[]{}),
                new BMW("City Jeep", "X5", "2014",
                        30, 320, new String[]{})
        };

        for (Car car : cars){
            System.out.println(car);
            car.startCarEngine();
            System.out.println("-".repeat(50));
        }
    }
}
