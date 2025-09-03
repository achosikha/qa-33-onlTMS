package lesson_10_excep_strings.str;

import java.util.Arrays;

public class StringBasics {
    public static void main(String[] args) {
        // String - используется ТОЛЬКО В ТЕХ СЛУЧАЯХ, КОГДА МЫ НЕ ПЛАНИРУЕМ АКТИВНО МЕНЯТЬ ЕГО ЗНАЧЕНИЯ
        // КОГДА МЫ ПРОСТО ХОТИМ ИМЕТЬ КОНСТАНТУ или же изредка ВОЗМОЖНО ПОМЕНЯЕТ ВЕСЬ ЕГО КОНТЕНТ

        // StringBuilder - ТОЖЕ САМОЕ, ЧТО и STRING, но РАСШИРЯЕМЫЙ. ПОД капотом специально доработанный String,
        // который позволяет менять его отдельные элементы (буквы), целые части, удалить, добавить, все заменить.
        // Следовательно, если вы работает со СТРОЧКОЙ АКТИВНО - ТО вам нужен StringBuilder

        // StringBuffer - тоже самое, что и StringBuilder, редко используется, поскольку связан с ПОТОКАМИ !!!
        getStringBasicInfo();
    }

    public static void getStringBasicInfo(){
        // 1. Строчка в Джаве - это КОНСТАНТА, она неизменяемая !!! IMMUTABLE
        // 2. Это означает, что КОГДА ВЫ МЕНЯЕТЕ ЕЕ ЗНАЧЕНИЕ, ВЫ СОЗДАЕТЕ НОВУЮ СТРОЧКУ С НОВЫМ ЗНАЧЕНИЕМ
        // СТАРОЕ ОТПАДАЕТ !!!
        String name = "Archil";
        // ПЕРЕСОЗДАЕТСЯ НОВЫЙ ОБЪЕКТ С НОВЫМ ЗНАЧЕНИЕМ
        name = "Vasya";

        // String name = "Archil" == char[] name = {'A', 'r', 'c', 'h', 'i', 'l'};
        System.out.println(name.charAt(1));

        char[] letters = name.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (char letter : "Welcome to JAVA!".toCharArray()){
            System.out.print(letter + "\t");
        }
        System.out.println("\n");

        // НЕЛЬЗЯ СОЗДАВАТЬ СТРОЧКУ ЧЕРЕЗ КЛЮЧЕВОЕ СЛОВО new
        // Если только, не вы не ХОТИТЕ НАРУШИТЬ ОПТИМИЗАЦИЮ КЛАССА STRING
        // И целенаправленно, СОЗДАТЬ ЕГО ОТДЕЛЬНО ОТ STRING POOL
        String myName = "Archil"; // ПОПАДАЕТ В СТРИНГ ПУЛ и идет оптимизация!

        // new он поскольку вы ему прямо задали задачу ВЫДЕЛИТЬ ОТДЕЛЬНО ПАМЯТЬ
        // ОН ОТДЕЛЬНО ОТ СТРИНГ ПУЛА СОЗДАСТ ПАМЯТЬ ТОЛЬКО ПОД ЭТУ СТРОЧКУ !!!
        String johnny = new String("Johnny");

        // split() - делит строчку по определенному СИМВОЛУ
        String expression = "12+5*6";
        String[] splitExpression = expression.split("[+*]");

        System.out.println(Arrays.toString(splitExpression));

        StringBuilder dynamicString = new StringBuilder("Archil Sikharulidze!");
        dynamicString.append('A');
        System.out.println(dynamicString);
        dynamicString.deleteCharAt(dynamicString.length() - 1);
        System.out.println(dynamicString);
        dynamicString.insert(5, '@');
        System.out.println(dynamicString);
    }
}
