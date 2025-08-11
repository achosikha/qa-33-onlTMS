// package - указывает на принадлежность файла к фолдеру/пакету
// Всегда стоит в начале документа
package lesson3.operators;

import java.util.Scanner;

public class MyOperators {
    // Если я здесь объявлю переменную - она называется переменной КЛАССА и живет на протяжении существования КЛАССА
    // ОБЛАСТЬ ВИДИМОСТИ и СРОК ЖИЗНИ

    // ПРОСТО ДЛЯ ПРОДВИНУТОГО ПРИМЕРА ИСПОЛЬЗОВАНИЯ ПЕРЕМЕННЫХ
    static {
        // ПОДГРУЖАЕМ ОПРЕДЕЛЕННЫЕ ПЕРЕМЕННЫЕ ЕЩЕ ДО СОЗДАНИЯ ЧЕГО-ЛИБО для РАБОТЫ С определенными вещами
    }

    // Свой СТЭК
    public static void main(String[] args) {
        // Entry-point
        killMethodReturn();
    }

    public static void killMethodReturn(){
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to continue? (y/n)");
        String answer = input.nextLine();

        // Сравни игнорируя регистр - n/N одно и тоже
        if (answer.equalsIgnoreCase("n")) return;

        System.out.print("Please, enter an integer value: ");
        int value = input.nextInt(); // Позволит пользователю ввести целочисленное значение

        System.out.println("You have entered the following decimal value: " + value);

        System.out.println("-".repeat(50));

        System.out.print("Please, enter a double value: ");
        double doubleValue = input.nextDouble();

        System.out.println("You have entered the following double value: " + doubleValue);

        System.out.println("-".repeat(50));

        input.nextLine(); // ОБЪЯСНЮ ПОПОЗЖЕ

        System.out.print("Please, enter a message: ");
        String message = input.nextLine();

        System.out.println("Your message is: " + message);
    }

    public static void useBreakContinueReturn(){
        // break - ломает конструкцию
        // return - ломает весь метод
        // continue - используется только в цикле для того, чтобы пропустить одну итерацию - повторение

        for (int counter = 1; counter <= 10; counter++){
            if (counter == 5){
                break;
            }
            System.out.println("Counter: " + counter);
        }

        System.out.println("-".repeat(20));

        for (int counter = 1; counter <= 10; counter++){
            if (counter == 5){
                continue;
            }
            System.out.println("Counter: " + counter);
        }

        for (int counter = 1; counter <= 10; counter++){
            if (counter == 6){
                return;
            }
            System.out.println("Counter: " + counter);
        }

        System.out.println("You CAN'T REACH THIS PLACE BECAUSE RETURN KILLS A WHOLE METHOD!!!");
    }

    public static void useFor(){
        // for самый распространенный цикл для работы с массивами и другими коллекциями
        // т.е. когда нужно значения достать из чего-то

        int counter = 0;
        for (; ; ){ // без переменной цикла, был логического условия - т.е. сам for никогда не сломается и без
            // изменения переменных - БЕСКОНЕЧНЫЙ ЦИКЛ, НИКОГДА ЦИКЛ НЕ ЗАКОНЧИТСЯ !!!
            System.out.println(counter);
        }
    }

    public static void useLoops(){
        // Count from 0 to 20 - ИСПОЛЬЗОВАТЬ ЦИКЛЫ
        // ЦИКЛ ПОЗОВЛЯЕТ ПОВТОРЯТЬ ОПРЕДЕЛЕННЫЙ БЛОК КОДА

        int counter = 0;

        // while () - начинается логической проверки
        // Этот цикл уникален тем, что уже вначале проверяет УСЛОВИЕ
        while(counter <= 20){
            System.out.println("Counter: " + counter);
            counter++; // постфиксный-инкремент обозначает counter += 1
        }

        // У каждого цикла есть свой СЧЕТКИ или же указатель на КОНЕЧНУЮ ОСТАНОВКУ
        // Т.е. то, что заставит цикл закончится
        counter = 0;

        System.out.println("-".repeat(100));

        // do while()
        // В этой конструкции проверка условия происходит в конце тела
        // Поэтому, этот цикл ВЫПОЛНИТ ТЕЛО КОДА ХОТЯ БЫ ОДИН РАЗ !!!
        do{
            System.out.println("Counter: " + counter);
            counter++; // постфиксный-инкремент обозначает counter += 1
        } while (counter <= 20);

        // цикл for (объявление переменной; проверка логического условия; изменение переменных)
        // backwardCount-- -> постфиксный-дикремент - тоже самое, что backwardCount -= 1;
        for (int count = 0, backwardCount = 20; count <= 20; count++, backwardCount--){
            System.out.println("Counter for: " + count);
            System.out.println("Backward counter for: " + backwardCount);
        }
    }

    public static void useLambdaSwitch(){
        String vegetable = "Cucumber";

        // classical switch
        switch(vegetable.toUpperCase()){ // ПРИВЕСТИ ЛЮБОЕ ЗНАЧЕНИЕ К ВЕРХНЕМУ РЕГИСТРУ
            case "CUCUMBER" -> System.out.println("Your product is a green cucumber.");
            case "TOMATO" -> System.out.println("Your product is a red tomato.");
            case "POTATO" -> System.out.println("Your product is a brown colored potato with dots...");
            case "GARLIC" -> System.out.println("Your product is a grey colored garlic.");
            default -> System.out.println("This is an UNKNOWN product for me.");
        }

        // если у меня томаты и огурцы - САЛАТ if (tomato && cucumber) {} else if () {}
        // если у меня картошка и батат - КАРТОШКА-ФРИ
        // если у меня чеснок и лук - ПРИПРАВА
        String newVegetable = "TOMATO";

        switch (newVegetable.toUpperCase()){
            case "CUCUMBER", "TOMATO" -> System.out.println("У вас САЛАТ!");
            case "POTATO", "BATAT" -> System.out.println("У вас КАРТОШКА ФРИ!");
            case "GARLIC", "ONION" -> System.out.println("У вас ПРИПРАВА!");
            default -> System.out.println("У вас неизвестный для нас продукт!");
        }
    }

    public static void useSwitchClassic(){
        // ЧТО ЕСЛИ У МЕНЯ МНОГО ВАРИАНТОВ и ОНИ КОНСТАНТЫ?
        // ДНИ НЕДЕЛИ?
        // СЕЗОНЫ?
        // ЧТО-ТО РЕДКО ИЗМЕНЯЮЩЕЕСЯ

        String vegetable = "Cucumber";

        // classical switch
        switch(vegetable.toUpperCase()){ // ПРИВЕСТИ ЛЮБОЕ ЗНАЧЕНИЕ К ВЕРХНЕМУ РЕГИСТРУ
            case "CUCUMBER": // if (vegetable.toUpperCase.equals("CUCUMBER")){}
                System.out.println("Your product is a green cucumber.");
                break; // ОБЯЗАТЕЛЬНО, поскольку оно ЛОМАЕТ switch и заставляет остановиться, когда найдено совпадение
            case "TOMATO":
                System.out.println("Your product is a red tomato.");
                break;
            case "POTATO":
                System.out.println("Your product is a brown colored potato with dots...");
                break;
            case "GARLIC":
                System.out.println("Your product is a grey colored garlic.");
                break;
            default: // else {...}
                System.out.println("This is an UNKNOWN product for me.");
                break;
        }

        // если у меня томаты и огурцы - САЛАТ if (tomato && cucumber) {} else if () {}
        // если у меня картошка и батат - КАРТОШКА-ФРИ
        // если у меня чеснок и лук - ПРИПРАВА
        String newVegetable = "TOMATO";

        switch (newVegetable.toUpperCase()){
            case "CUCUMBER":
            case "TOMATO":
                System.out.println("У вас САЛАТ!");
                break;
            case "POTATO":
            case "BATAT":
                System.out.println("У вас КАРТОШКА ФРИ!");
                break;
            case "GARLIC":
            case "ONION":
                System.out.println("У вас ПРИПРАВА!");
                break;
            default:
                System.out.println("У вас неизвестный для нас продукт!");
                break;
        }
    }

    public static void useTernaryOperator(){
        // Альтернатива else if
        int age = 0;
        boolean isEmployed = false;

        System.out.println("Are you an adult? " + (age >= 18));
        System.out.println("Are you employed? " + (isEmployed));

        // if (true) {} else {}
        // Можно заменить т.н. тернарным оператором
        // (логическое условие) ? если истина : если ложь
        boolean isAdult = (age >= 18) ? true : false;

        System.out.println("Are you an adult? " + isAdult);

        // Вставить значение ADULT если человеку уже 18 или старше
        // Вставить значение UNDERAGED если меньше
        // Вставить значение ОШИБКА ВОЗРАСТА если данные не соответствуют выше перечисленным параметрам
        String ageStatusIf;

        int ageNew = 65;

        if (ageNew > 0 && ageNew < 18){
            ageStatusIf = "UNDERAGED";
        } else if (ageNew >= 18) {
            ageStatusIf = "ADULT";
        } else {
            ageStatusIf = "DATA IS CORRUPTED";
        }

        System.out.println("What is your age status? " + ageStatusIf);

        // Вложенный тернарный оператор - БОЛЬШЕ НЕ НАДО!
        String ageStatus = (ageNew > 0 && ageNew < 18) ? "UNDERAGED" : (ageNew >= 18) ? "ADULT" : "DATA IS CORRUPTED!";
        System.out.println("What is your age status with ternary operator? " + ageStatus);
    }

    public static void getOptionalOperatorElseIf(){
        boolean checkRight = true;

        System.out.println("Would you like to find out whether you have a right to drive a car? ");

        int age = 0;

        if (checkRight){
            System.out.println("Yes, I would like to check...");

            // Логические оператор И выполнится ТОЛЬКО ТОГДА, КОГДА ОБА УСЛОВИЯ ВЕРНЫ
            if (age > 0 && age < 18){
                System.out.println("Your are underaged and you cannot drive a car!!!");
            } else if (age >= 18 && age < 65){
                System.out.println("You are an adult and you can drive a car!!!");
            } else if (age >= 65){
                System.out.println("You are an aged person and you need some documents from a DOCTOR!");
            } else {
                System.out.println("Your age is " + age + " and it is obviously corrupted!");
            }
        }

        System.out.println("Are you employed by TMS now or do have 10 years of Java development experience?");

        boolean isEmployed = true;
        int experience = 14;

        // логический оператор ИЛИ выполнится если хотя бы ОДНО УСЛОВИЕ ВЕРНО
        if (isEmployed == true || experience >= 10){
            System.out.println("You can have some additional benefits.");
        } else {
            System.out.println("Unfortunately, no additional benefits for you!");
        }
    }

    // Операторы - ветвления - if
    public static void getOptionalOperatorIf(){
        // Операторы ветвления
        // if, else if, switch - классический вариант, обновленный вариант, супер-новый вариант

        int age = 17;

        System.out.print("Please, enter a digital value that shows your age: ");
        System.out.println("Your age is " + age + " years old and it means...");

        // if - underaged you cannot drive a car
        // if - adult you can drive a car
        // if - aged you need still some additional documents from a DOCTOR

        // if используется лишь когда надо задать ОДИН ВОПРОС БЕЗ ДРУГИХ ВАРИАНТОВ ОТВЕТОВ!!!
        // НЕ НАДО ДЕЛАТЬ! БУДЕТ ПРОВЕРЯТЬ ВСЕ СЛУЧАЙ, ДАЖЕ ЕСЛИ УСЛОВИЕ УЖЕ УДОВЛЕТВОРЕНО! - ЭТО ЛОГИЧЕСКАЯ ОШИБКА!
        if (age <= 0){
            System.out.println("Your age is impossible, the data is corrupt!");
        }

        if (age < 18){
            System.out.println("Your are underaged and you cannot drive a car!!!");
        }

        if (age >= 18){
            System.out.println("You are an adult and you can drive a car!!!");
        }

        if (age >= 65){
            System.out.println("You are an aged person and you need some documents from a DOCTOR!");
        }

        System.out.println("-".repeat(100));

        System.out.println("Are you employed?");

        boolean isEmployed = true;

        // если ответ одстрочный и больше никакой КОД НЕ ДОЛЖЕН ВЫПОЛНЯТЬ ПРИ ОПРЕДЕЛЕННОМ УСЛОВИИ
        // КАВЫЧКИ МОЖНО ОПУСТИТЬ, поскольку после if строчка кода воспринимается компилятором, как ОТВЕТ НА ВОПРОС
        if (isEmployed == true)
            System.out.println("Yes, I am employed!");
        System.out.println("No, I am not Employed!");

        // if - >, <, >=, <=, ==, !, !=, ||, &&
        System.out.println("Are you working on TeachMeSkills?");

        boolean isTMSStaffMember = true;

        // if (ЗДЕСЬ АВТОМАТИЧЕСКИ ИДЕТ ПРОВЕРКА НА ИСТИНУ)
        // Если у вас логическая переменная она не нуждается в дополнительных вопросах
        // if (isTMSStaffMember == true) == if (isisTMSStaffMember)
        // if (isTMSStaffMember == false), if (isTMSStaffMember != true) == if (!isTMSStaffMember)
        if (isTMSStaffMember){
            System.out.println("Yes, I am.");
        }
    }

    // У этого метода свой СТЭК
    public static void getBasicVarInfo(){
        // Java 8 - classic
        int height = 171;
        boolean isWorking = true;

        // var - это нововведение в Джаве
        // Которе используется лишь в ЛОКАЛЬНЫХ ПЕРЕМЕННЫХ
        // Его нельзя использовать на уровне класса
        // В Джава var пришел из языка программирования JavaScript - динамического
        // Он специально добавлен, чтобы в кое-каких случаях, где возвращаемое значение НЕ ВСЕГДЯ ОЧЕВИДНО
        var weight = 17.2;
        var turnedOn = true; // Подставит значение boolean
        // Верни мне данные из базы, которые могут быть типа класса Человек - АйТи - Менеджер
        // var = Human || IT || Manager
        // if (var instanceof Human element)...

        {
            // Это отдельно стоящая область кода
            // все, что внутри создается принадлежит этому БЛОКУ КОДУ
            System.out.println("Your height value is: " + height);

            {
                // Тут доступны переменные и МЕТОДА, и внешнего БЛОКА
                // Но переменные этого блока НИКОМУ КРОМЕ БЛОКА НЕДОСТУПНЫ!
            }

            int internalValue = 100; // Сохраняет в СТЭКЕ
            System.out.println("Your internal value: " + internalValue);
        } // УДАЛЯЕТ ДАННЫЕ И ПЕРЕМЕННЫЕ ИЗ СТЭКА

        // System.out.println(internalValue); - нет доступа, поскольку переменная уровня БЛОК, была создана
        // Была использована и после закрытия КАВЫЧЕК и БЛОКА, переменная удалена из ПАМЯТИ!
    }
}