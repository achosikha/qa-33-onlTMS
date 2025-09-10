package lesson_12_set_stream_api.listCol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyListCollection {
    public static void main(String[] args) {
        // Iterable -> Collection:
        // 1. List - Список, который имитирует массив
        // 2. Set - Данность, ГЛАВНОЕ ЕГО СВОЙСТВО ЭТО УНИКАЛЬНОСТЬ ЗНАЧЕНИЙ
        // 3. Queue - FIFO (FIRST IN, FIRST OUT | FILO - FIRST IN, LAST OUT)

        // ОТДЕЛЬНО: MAP -> КЛЮЧ --> ЗНАЧЕНИЕ, ДОМ -> HOUSE

        // ДЛИНЫ НЕТ у КОЛЛЕКЦИЙ ЕСТЬ РАЗМЕР
        // РАЗМЕР КОЛЛЕКЦИИ - ЭТО ТО, СКОЛЬКО ЭЛЕМЕНТОВ У НЕГО РЕАЛЬНО ЗАНЯТО
        // У Коллекции есть еще один параметр, называется CAPACITY, которое указывает на РАЗМЕР ВСЕЙ КОЛЛЕКЦИИ
        // КОГДА ВЫ СОЗДАЕТЕ КАКОЙ РАСШИРЯЕМЫФЙ МАССИВ, НО АВТОМАТИЧЕСКИ ПОНИМАЕТ, ЧТО ЭТОТ КОНТЕЙНЕР ДОЛЖЕН
        // РАСШИРЯТЬСЯ. ПОЭТОМУ СОЗДАЕТ СРАЗУ ЛИШНЕЕ ПРОСТРАНСТВА, ЧТОБЫ КОГДА ВЫ НАЧАЛИ ЗАПОЛНЯТЬ РАСШИРЯЕМЫЙ
        // МАССИВ ЕМУ НЕ ПРИХОДИЛОСЬ КАЖДЫЙ РАЗ ЗАНОВО ВЫДЕЛЯТЬ ПАМЯТЬ
        // new ArrayList() -> пространство под 100 элементов сразу же (это CAPACITY, ОБЪЕМ)
        // Вы начинаете его заполнять, количество вложенных данных ЭТО РАЗМЕР
        // Как только размер приближается к объему, он умножает существующий объем на 1.2 - 1.5
        useLinkedList();
    }

    public static void useLinkedList(){
        // LinkedList - связанный список
        // Связывает элементы между собой, но не одной цепочкой, а АДРЕСАМИ
        // Class Wrapper - ОБЕРТКА КЛАССА
        // У каждого примитивного типа есть свой КЛАССОВЫЕ ОБЕРТКИ
        // int - Integer, char - Character, double - DOUBLE, float - FLOAT, boolean - Boolean
        // Boolean isAlive = true; -> DON'T DO THIS
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, 5, -1, 100, 9, 100, 1));
        System.out.println(numbers);
        numbers.add(199);
        System.out.println(numbers.reversed());

        // ArrayList [1, 2, 3, E -> 4, 5, 6, 7, 8]
        // LinkedList [1]-[2]-[3]-[4]-[5]-[6]
        // [3]-->[RT]-[4]-[5][6]....
        // Big[O] Notation - это формула, которая определяет затраты вашего компьютера на выполнение задач
    }

    public static void useBasicList(){
        // <> - внутри должен быть указатель на ОБЪЕКТ, указатели на примитивные типы недопустимы
        List<String> names = Arrays.asList("Archil", "Lena", "Anatoly", "Vladimir", "Ksenya", "Olesya");
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }

        System.out.println("-".repeat(50));

        // Если я могу обращаться в контейнере через индексы, значит у нас под копотом что-то типа МАССИВА
        for(int index = 0; index < names.size(); index++){
            System.out.println(names.get(index));
        }

        // ERROR - CANNOT CHANGE LIST
        // names.add("Nina"); -> NO WARNING, EXCEPTION
    }

    public static void useArrayList(){
        // LIST - сам себя не может создать
        // Лист не может расширяться и менять себя, если он не создан на основе ArrayList or LinkedList
        // List -> похож на массив, но не расширяется, имеет индексы, а это значит он СОХРАНЯЕТ ПОРЯДОК ВСТАВКИ
        // ЭЛЕМЕНТОВ
        List<String> names = new ArrayList<>();
        names.add("Ylia"); // APPEND, add the last element
        names.add("Yulia");
        names.add("Ksenia");
        names.add("Dmitriy");
        names.add("Vasya");
        names.addAll(Arrays.asList("Oleg", "Nina", "Petr"));

        if (names.isEmpty()){
            System.out.println("THERE ARE NO VALUES IN YOUR CONTAINER...");
        } else {
            System.out.println(names);
        }

        // size() - capacity()
        // Array indexes - 0....
        names.add(1, "Nick");
        System.out.println(names);
        System.out.println("Under which index is Vasya stored? " + names.indexOf("Vasya"));
        names.remove(names.size() - 2);
        System.out.println(names);

        // List - SIZE()
        System.out.println("Collection has SIZE == length: " + names.size());
        names.clear();
        System.out.println(names);
        names.addAll(Arrays.asList("James", "Johnny", "Dacota", "Evgenya"));
        System.out.println("Added new values: " + names);
    }

    public static void checkSizeCapacity(){
        // List базовый класс обеспечивает ФУНКЦИОНАЛ
        // Если вам нужны продвинутые возможности надо создавать на основе классов, на основе самого себя
        ArrayList<String> names = new ArrayList<>();
        String[] name = new String[10]; // 10xString !!!

        System.out.println("names = new ArrayList<>(), SIZE: " + names.size());
        names.ensureCapacity(1000); // +++++
    }
}
