import java.util.ArrayList;

/**
 * @author Archil Sikharulidze
 * JavaDoc был создан спциально для разных оформлений, чтобы другие программисты и пользователи, могли разобраться
 * в вашем коде. Тут можно отдельно выделить автора кода и все нужные поля.
 */

/*
Multiple-line comments
We can write any amount of comments, some ideas and even documentation.
 */

// One-line comment

// В Джаве все ЯВЛЯЕТСЯ ОБЪЕКТОМ - это значит, что КОД НЕ МОЖЕТ РАБОТАТЬ БЕЗ СОЗДАНИЯ ОБЪЕКТА
// Слово class - создает объект под названием MyMain
// Название вашего главного ПУБЛИЧНОГО КЛАССА должно совпадать с названием вашего документа

// 1. Класс всегда пишется с большой буквы и всегда существительное - Upper Camel Case
// 2. PasswordLogging, Main, MyMain, HumanStaff
// 3. В Джаве нет функций, а есть только МЕТОДЫ - принадлежность к КЛАССУ
// 4. get, set, put, take - setName, getName, setHeight, getSum, sum, run, jump, getHumanHeight - Lower Camel Case
// 5. humanHeight, weight, PI - LOWER CAMEL CASE

public class MyMain{
    // Точка входа ENTRY-point
    // Точка входа - это сигнал вашему КОМПИЛЯТОРУ, что программу следует СЧИТЫВАТЬ ОТСЮДА, ЗДЕСЬ ОНА НАЧИНАЕТСЯ

    // 1. SandBox - "песочница", это специальное пространство, где обрабатывается ваш код, он существует отдельно от
    // вашего остального софта и других вещей;
    // 2. Ваш код не зависит от вашей системы и машины - WORA, WRITE ONCE RUN ANYWHERE
    // Byte CODE - байт-код это специальный набор директив, который создается исходя из вашего программного кода
    // Программный код - это код написанный программистом или по-другому, source code (src)
    // Байт-код содержит зачастую ЯЗЫК АССЕМБЛЕР
    // Машина понимает только бинарный язык - 00001001
    // АССЕМБЛЕР - дал определенные аббревиатуры
    // На каждом компе уже стоит маленькая программа называющаяся JVM - Java Virtual Machine, она понимает байт-код
    // И переводит его на понятный для вашей машины и системы язык
    // Поэтому, где бы вы не написали, и где бы вы не пускали - если у вас стоит Java Virtual Machine, то код будет
    // работать
    // JDK Java Development Kit минимальный набор разработки программиста - JVM Java Virtual Machine -
    // JRE Java Run-Time Environment

    // Любой рабочий код всегда лежит в документе с расширением .java
    // Любой откомпилированный код, т.е. байт-код лежит в документах с расширением .class
    // Компилятор - проверяет базовые грамматические конструкции языка, а также, подсказывает на возможные
    // логические ошибки - если у вас компилятор указывает на ОШИБКУ - попытка ее загрузить приведет
    // к ОЩИБКЕ КОМПЛЯТОРА - Compile-Time ERROR
    // Компилятор - читает весь код, если ошибок нет, загружает, если хотя бы одна ошибка есть - провал
    // Скриптовые языки на фронта/дизайна - читают каждую строчку отдельно и сразу же ее выполняют
    // Поэтому, ошибка никак не влияет на целостность проекта

    // Java Version 8 - КЛАССИКА ЖАНРА, самая распространенная версия в мире (Java 1.8)
    // Java 24 ??? - Это все крутое из Java 8 + новые штучки, var, yield... максимальное упрощение разработки
    // ОБЯЗАТЕЛЬНО ЗНАТЬ JAVA 8 + и желательно некоторые крутые штучки из 14, 17, 21, 24
    // Лямбда, record... строчками + потоками
    // То, что не приживается или считается большинством МУСОРОМ, может стать DEPRECATE
    // Если вы видите перед чем-то такую надпись, значит использование запрещено!
    public static void main(String[] args){
        // sout - shortcut for System.out.println()
        // Языки программирования делятся на две категории:
        // 1. Статические/строгой типизации - ДЖАВА
        // 2. Динамической типизации

        // Bitwise operators - возможность манипулировать значения на уровне БИНАРНОМ, т.е. на языке МАШИНЫ >>>, <<<
        // =, +=, -=, /=, *=, %=
        int number = 10;

        number += 1; // number = number + 1;
        number /= 5; // number = number / 5;
    }

    public static void getGeneralDataTypesInformation(){
        // +, -, /, *, %
        System.out.println(10/5);
        System.out.println(29-30);
        System.out.println(8*8);

        int days = 366;

        // 10%5 = 0
        // 10 - 5 = 5;
        // 5 - 5 = 0;
        // 11%5 = 1
        // 11 - 5 = 6;
        // 6 - 5 = 1;
        // 1 - 5 = 1 < 5 = остаток 1
        System.out.println(10 % 5);

        // Приоритет выполнения
        // +, - - одинаковый
        // *, / - одинаковый приоритет, но выше +,-
        // () - ПОКА ЧТО ВНУТРИ, ПОТОМ результат: 10 / (1 + 1), 10 / 2
        //  2 * 5 / (10 % (1 + 1)) -> 10 / 0
        System.out.println("Если остаток 0 - четное, если остаток 1 - нечетное: " + (days % 2));

        int myHeight = 170;
        int myHighHeight = 200;
        double sum;

        // Автоматическое расширение ТИПА
        // Приведение типа - принудительное сужение типа
        byte byteVal = -128;
        int valInt = byteVal;

        System.out.println(valInt);

        double bigDouble = 0; // 8 bytes
        int bigInt = -2_000_000_000; // 4 bytes
        bigDouble = bigInt;

        bigDouble = 164_456.567;

        // (int), (double), (byte)
        // Когда приводим целочисленное значение в целочисленное - все что после точки убирается - ОТБРАСЫВАНИЕ
        bigInt = (int) bigDouble;

        System.out.println(bigInt);

        char letter = 'R'; // char под капотом целое
        int charValue = letter; // Возьмет значение целочисленное из таблицы и присвоит
        System.out.println(charValue);

        charValue = 100;
        letter = (char) charValue;

        System.out.println(letter);

        long myLong = -2_000_000_000_988_888L;
        int longCasted = (int) myLong; // ПЕРЕПОЛНЕНИЕ INT

        System.out.println(longCasted);
    }

    public static void getInfoLocalData(){
        // Примитив не из-за СТЭКА, а из-за того, что под переменной адрес, который прямо указывает на его значение
        int myValue = 100;
        myValue = 9;

        System.out.println(myValue);

        // Ссылочный тип - ТОЛЬКО ОБЪЕКТЫ И ВСЕГДА ХРАНЯТСЯ В КУЧЕ
        // В Джаве отдельная философия связана с УБОРЩИКОМ МУСОРА (Garbage Collector)
        String name = "Archil";

        // ПЕРЕМЕННЫЕ, КОТОРЫЕ ОБЪЯВЛЕНЫ В МЕТОДАХ, а не на УРОВНЕ КЛАССА, называются ЛОКАЛЬНЫМИ
        // ЛОКАЛЬНЫЕ ПРИМИТИВНЫЕ ПЕРЕМЕННЫЕ НЕ МОГУТ АВТОМАТИЧЕСКИ ПОЛУЧАТЬ ДФОЛТНЫЕ ЗНАЧЕНИЯ
        // Т.е. перед использованием вы обязаны им задать значения
        int x;

        // System.out.println(x); // ERROR

        String value = null; // null - это специальное ключевое слово, которое говорит - НЕТ ЗНАЧЕНИЯ, НЕ ССЫЛКИ

        System.out.println(value);
    }

    public static void getBasicVariableInformation(){
        // ТИП предопределяет ЗНАЧЕНИЕ

        // ЦЕЛОЧИСЛЕННЫЕ ЗНАЧЕНИЯ INTEGER (-7..... 7....)
        // byte, short, int, long
        byte myByte = 34;
        short myShort = -31_345; // _ для вас, чтобы понять сколько символов, но компилятор не читает
        int myInt = 2_000_000_001; // DEFAULT ТИП в ДЖАВЕ - это INT

        // Если даже вы укажите тип long но значение можно будет уложить в int компилятор попытается это сделать
        // Все дело в оптимизации памяти
        long myLong = -3_000_000_000_000_123L; // Чтобы заставить компилятор создать переменную типа long НАДО ДОБАВИТЬ
        // L, l

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println("My byte value is: " + myByte + ". And my long value is: " + myLong);

        // ПЕРЕМЕННЫЕ с плавящей ЗАПЯТОЙ
        // float, double - 14.5, -20.1
        float myFloat = -4.3578458F; // F, f

        // sizeof() - проверяет сколько у вас на системе вести та или иная переменная
        // Поскольку в ДЖАВЕ все переменные на всех машинах весят одинаково, int 4 byte то такого ключевого слова НЕТ
        double myDouble = 15.3938489944; // double is DEFAULT type

        System.out.println("My double: " + myDouble);

        // ПЕРЕМЕННАЯ ТИПА СИМВОЛ - char
        // char БУКВА ОДНА или ОДИН СИМВОЛ
        char letter = '+'; // char - ASCII Table - Default: HIGH ASCII TABLE
        System.out.println("My letter is: " + letter);
        letter = 33; // Можно как символ, так и числовое значение этого символа
        System.out.println("My letter is: " + letter);

        // СТРОЧКА - String
        String fullName = "Archil Sikharulidze";
        String name = "Archil";
        String surname = "Sikharulidze";
        String fullNameConcatenated = name + " " + surname;

        System.out.println(fullName);
        System.out.println(fullNameConcatenated);

        // ЛОГИЧЕСКАЯ ПЕРЕМЕННАЯ - boolean
        // true - false
        boolean isMarried = false;
        boolean turnOn = false;
        boolean isEmployed = true;
        boolean isPlayable = true;

        // boolean - 0 ложь (false), !0 - true (истина) НЕ В ДЖАВЕ!!!!
        // В ДЖАВЕ - ТОЛЬКО ЛОЖЬ ИЛИ ИСТИНА

        // ВСЕ ВЛОЖЕННЫЕ В ДЖАВУ ТИПЫ КРОМЕ STRING называются ПРИМИТИВНЫМИ!!!!
        // String является ССЫЛОЧНЫМ ТИПОМ

        System.out.println("Are you married: " + isEmployed);

        System.out.println("Welcome to Java Mr. Archil.");
    }

    // Как называется пространство, где выполняется код ДЖАВА
    // JVM - ByteCode
    public static void getBasicInformation(){
        // Теперь ваш документ готов к работе

        // Standard I/O (input, output)
        // System.out.
        // make() - method, на языке С++ функция, т.е. действие, метод что-то делает
        // В Джаве строчка может писаться лишь в двойных кавычках, нет исключений
        // 'ВWelcome to JAVA', `Welcome to Java`, "Welcome to Java" in JavaScript
        // JAVA - "__" только так
        System.out.println("Welcome to JAVA..."); // Выведи сообщение данное в кавычках, а после добавь невидимый символ
        // следующей строчки - print + ln (new line)
        System.out.print("This message is without NEXT LINE!");
        System.out.print("This MESSAGE COMES after previous print without NEXT LINE!");
        System.out.println(); // empty line
        // println все равно передает кое-что, и это специальный знак перехода на новую строчку \n
        System.out.println(); // empty line
        // print() нет вообще ничего, даже скрытого знака перехода на следующую строчку
        // А это не позволяется, хоть что-то надо передать
        System.out.print(""); // "" EMPTY STRING, " " - Строчка ПРОБЕЛ, "\n" - переход на следующую строчку
        System.out.print("    ");
        System.out.print("Message!");
        System.out.print("\n"); // ESCAPE SEQUENCE есть определенные знаки, которые подсказывают компилятору что сделать
        System.out.print("After - next line special symbol!\n\n\n\n\n");
    }
}