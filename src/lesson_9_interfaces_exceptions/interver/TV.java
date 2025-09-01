package lesson_9_interfaces_exceptions.interver;

// REGULAR INTERFACE
public interface TV {
    // NON-CLASSICAL INTERFACE
    // НЕИЗМЕНЯЕМЫЕ ПЕРЕМЕННЫЕ, КОТОРЫЕ ДОСТУПНЫ ВСЕМ
    // ПЕРЕМЕННЫЕ В ИНТЕРФЕЙСЕ - ВСЕГДА ПУБЛИЧНЫЕ, ВСЕГДА КОНСТАНТЫ (НЕЛЬЗЯ МЕНЯТЬ ИХ ЗНАЧЕНИЯ), ВСЕГДА СТАТИЧЕСКИЕ
    String NAME = "SAMSUNG";
    int SPEED = 5;
    String MESSAGE = "TV WELCOMES YOU!";

    // CLASSICAL: ONLY PUBLIC ABSTRACT METHODS
    void turnOnTV();

    // NEW FEATURES
    // Interface Variables - переменные интерфейса - STATIC and PUBLIC
    // Дефолтные методы, закрытые и т.д. - ИМЕЮТ ТЕЛО РЕАЛИЗАЦИИ
    default void getMSG(){
        // ЕСЛИ ВНЕЗАПНО НАМ ПОНАДОБИТЬСЯ КАКАЯ-ТО ВСЕ-ТАКИ ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ МЕТОДА
        System.out.println("This is a DEFAULT REALIZATION METHOD getMSG()...");
    }

    default void getDefaultSpeed(){
        System.out.println("This is a DEFAULT SPEED VALUE!");
    }
}
