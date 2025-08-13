package lesson_4_methods_arrays;

// Java автоматически подключает главную библиотеку - java.lang
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        //
        System.out.println("Please, multiply 189 * 145. What is a result? " + returnStrongerValue());
        System.out.println("Please, tell me about yourself: " + returnFormattedMessage());

        // Прием данным и передача данных примитивных типов происходит по принципу - Копирования
        // (передача данных по значению) - контрастирует с ПЕРЕДАЧЕЙ ДАННЫХ ПО ССЫЛКЕ (ТОЛЬКО ДЛЯ ОБЪЕКТОВ)
        // Т.е. парадаются просто значения и создаются независимые переменные
        double bmiSum = useScanner();
        System.out.println("The result of the useScanner() method is your BMI indicator: " + bmiSum);

        // Не имеет смысла создавать перемены типы byte, short & float если мы будем проводить над ними
        // операции или же передавать их, как данные
        double calculatedSum = calculateSum(78.91, 567.98);
        System.out.println("Sum equals: " + calculatedSum);

        float weight = 81;
        float height = 172.0F;
        calculatedSum = calculateSum(weight, height);
    }

    public static double calculateSum(double value, double valueTwo){
        return value + valueTwo;
    }

    // ВОЗВРАЩАЕМОЕ ЗНАЧНИЕ
    // ПРИНИМАЕМЫЕ ПАРАМЕТРЫ
    // В данном случае - это void - оно означает НИЧЕГО
    // Т.е. когда у нас перед названием самого метода указано void метод ничего не должен возвращать
    // Если поменять это ключевое слово на любой ТИП - примитивный или ссылочный, то метод уже будет ВОЗВРАЩАТЬ
    // ЗНАЧЕНИЯ ДАННОГО ТИПА
    public static int returnStrongerValue(){
        int value = 145;
        int valueOne = 34;

        if (value > valueOne){
            return value;
        }

        return valueOne;
    }

    public static String returnFormattedMessage(){
        String fullName = "Archil" + " " + "Sikharulidze";
        int age = 36;
        String profession = "Java Developer";

        return fullName + " is " + age + " years old. And he is a " + profession + ".";
    }

    public static void useConsole(){
        System.out.print("Please enter some message: ");
        String message = System.console().readLine();
        System.out.println("Your message is: " + message);
    }

    public static void getSize(){
        int value = 100; // 4 bytes
        int valueTwo = 200;

        System.out.println(Integer.SIZE + " bits that equals / 8: " + (Integer.SIZE / 8));

        /*
        Все примитивные типы
        +
        Все ссылочные типы
        String name; -> получить ЗНАЧЕНИЕ и ВЫСЧИТАТЬ ЗНАЧЕНИЕ ИСХОДЯ ИЗ КОЛИЧЕСТВА СИМВОЛОВ * НА РАЗМЕР КАЖДОГО СИМВОЛА
         */
        // Archil Sikharulidze = 19 * 2 = 38 bytes
        System.out.println(Character.SIZE / 8);
    }

    public static double useScanner(){
        // Scanner - вы используете для чтения ввода данных в консоль
        // Сканнер также может и читать файлы
        // new динамичски выделяет память в Куче (Heap)
        // В Джаве - НЕТ ВОЗМОЖНОСТИ СОХРАНИТЬ ОБЪЕКТ ВНЕ КУЧИ
        // ВСЕ ОБЪЕКТЫ ВСЕГДА В ДЖАВЕ ХРАНЯТСЯ В КУЧЕ (HEAP)
        // А для того, чтобы создать объект в куче надо использовать ключевое слово - new
        Scanner input = new Scanner(System.in);

        // BMI - Body Mass Index - формула, которая высчитывает пропорции вашего роста и веса
        // Вес в кг / на ваш рост в квадрате, 80 / 1.8 * 1.8

        double weight;
        double height;
        double bmiSum;
        String commentary;

        System.out.println("This is a BMI calculator.");
        System.out.print("Please, enter your weight in kg: ");
        weight = input.nextDouble(); // 80 + /n (enter)

        System.out.print("Please, enter your height in cm: ");
        height = input.nextInt(); // отбрасывает сохранившийся в буфере ваш ENTER, и читает 176

        // ЧТО БУФЕР ЧИСТ перед использованием nextLine() - Как это можно сделать?
        // Два варианта, сложный - это найти метод очищающий вас БУФЕР
        // Перехватить в холостую оставшиеся данные
        input.nextLine(); // ОНО ГОВОРИТ КОМПИЛЯТОРУ, ЧТО ВОЗЬМИ ВСЕ ОСТАВШЕЕСЯ ИЗ БУФЕРА

        System.out.print("Please, add some additional commentary if needed: ");
        commentary = input.nextLine(); // nextInt() взял 176 - 176 + \n (ENTER) -> автоматом берет nextLine()

        System.out.println("Your weight is " + weight + " and your height is: " + height);
        System.out.println("You have entered additional commentary: \n\t " + commentary);

        height /= 100; // 171 into 1.71

        bmiSum = weight / (height * height);

        // Escape sequences: специальные знаки для компилятора пришли из языка С
        // \n - nextLine, \t - табуляция
        System.out.println("\t\tYour BMI index is: \n\t\t\t" + bmiSum);

        input.close();

        return bmiSum;
    }

    public static void checkYourKnowledge(){
        for (int counter = 1; counter < 10; counter++){ // Counter: 1 to 9
            if (counter == 3) break;
            System.out.println("Counter: " + counter);
        }

        // Counter: 1, 2

        System.out.println(); // Next Line

        for (int counter = 1; counter <= 5; counter++){ // Counter: 1 to 5
            if (counter == 5){
                return;
            }
            System.out.println("Counter: " + counter);
        }

        // Counter: 1, 2, 3, 4

        for (int counter = 1; counter < 4; counter++){ // Counter 1 to 3
            if (counter == 2) continue;
            System.out.println("Counter: " + counter);
        }

        // Counter: 1, 3
    }
}