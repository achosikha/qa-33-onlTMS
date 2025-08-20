package lesson_6_methods_oop;

import lesson_6_methods_oop.classes.*; // .* ДОБАВЬ ВСЕ ФАЙЛЫ ИЗ ПАКЕТА

// Функциональный стиль - она парадигма
// Классами - это вторая ООП парадигма
// Если я могу и так, и сяк - это называется мультипарадигменный язык программирования
// Наприме, в языке С только функциональное программирование, нет классов
// В С++ - функции и можно отдельно классы
public class MyMain {
    public static void main(String[] args) {
        // Начнем анализировать классы
        // Что такое объект, а что такое класс, и экземпляр класса
        // Поля класса
        // И в методах посмотрим, что такое перегрузка метода
        // И начнем работать уже с файлами, т.е. перейдем на уровень класс - файл
        // OOP - Джава создавался непосредственно под ООП, т.е. его идея была подточена под такую парадигму
        // Парадигмы программирования - это стиль в котором язык позволяет вам создавать рабочие приложения
        // Джава - базовый и, по сути, единственный стиль это ООП

        // Объект - это любая рабочая единица в Джаве
        // Класс - реализация объекта
        // Экземпляр класса - это уже непосредственная переменная, которая была создана на основе класса
        // ОБЪЕКТ это ЛЮБАЯ РАБОЧАЯ ЕДИНИЦА, а КЛАСС - это то, как объект реализован, а Экмзепляр класса - это уже
        // созданная вами переменная, которая использует внутренности класса

        // Один ОБЪЕКТ - ОДИН КЛАСС
        // Т.е. если у меня например ЧЕЛОВЕК - это ОБЪЕКТ, я создал КЛАСС - ЧЕЛОВЕК и впихнул в него разные вещи
        // Сюда добавлять еще объект - РЕБЕНОК, КОШКА, СОБАКА - НЕ НАДО!!!!
        createAnimal();
    }

    public static void createAnimal(){
        // lion -> АДРЕС, как и у любого класса !!!
        // Классы сравнивать нельзя обычным способом и что самое главное, задавать друг другу тоже просто так нельзя
        ZooAnimal lion = new ZooAnimal("Jennifer", "Lion", "Yellow", 150);
        System.out.println(lion.getAnimalData());

        System.out.println("-".repeat(50));

        ZooAnimal wolf = new ZooAnimal("John", "Wolf", "Grey", 55);
        System.out.println(wolf.getAnimalData());
    }

    public static void createUser(){
        // archil - специализированная версия шаблона User - archil является экземпляром класса User
        // Все объекты, которые мы с вами создаем, всегда хранятся в КУЧЕ, поэтому мы обязаны выделать память
        // через ключевое слово NEW
        User archil = new User();

        System.out.println(archil.getFullData());

        System.out.println("Let's change archil's data...");
        archil.name = "Archil";
        archil.surname = "Sikharulidze";
        archil.id = 404561456L;
        archil.sex = "Male";
        archil.dateOfBirth = "16/10/1988";
        archil.age = 36;
        archil.contactNumber = 591456791L;

        System.out.println("-".repeat(50));
        System.out.println(archil.getFullData());
        System.out.println("-".repeat(50));

        User nadezhda = new User();
        nadezhda.name = "Nadezha";
        nadezhda.surname = "Simionova";
        nadezhda.id = 34958333L;
        nadezhda.surname = "Female";
        nadezhda.dateOfBirth = "15/01/2002";
        nadezhda.age = 23;
        nadezhda.contactNumber = 528504331L;

        System.out.println(nadezhda.getFullData());

        System.out.println(nadezhda.checkAgeStatus(archil.age));
    }
}