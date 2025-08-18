package lesson_5_multidimensional_array;

import java.util.Arrays;
import java.util.Random;

// enum
// record - специальный класс, который ПРОСТО ХРАНИТ СЛОЖНЫЕ ДАННЫЕ
// MyMain CLASS
// enum - хранит КОНСТАНТЫ
// record - это тот же класс, но в котором не должно быть методов

public class MyMain {
    public static void main(String[] args) {
        // Если я не уверен, какое количество элементов я передам в массив
        // То могу использовать в параметрах метода переменную неопределенной длины - var-args
        getVarArgs();
        getVarArgs("Archil", "Yulia", "Vadim", "Dmitriy");
    }

    // NOT ALLOWED!
    // public static void getData (String... names, int x, double y){}

    // NOR ALLOWED!
    // public static void getData(int x, String... names, double y){}

    // IN THE END
    public static void getData(int x, double y, String... names){}

    public static void getVarArgs(String... data){
        // variable-argument
        // Это одномерный массив, который можно передать в параметрах метода
        // var-args

        for (String element : data){
            System.out.println("Your data: " + element);
        }
    }

    public static void getRandomNumber(){
        // Получение случайного числа - ПСЕДО-СЛУЧАЙНЫЕ ЧИСЛА
        // Они привязаны с вашей времени на ПС
        Random random = new Random();

        // 1 - 20 (мин. 1, макс. 19)
        int[] values = new int[random.nextInt(1, 21)];

        for (int index = 0; index < values.length; index++){
            values[index] = random.nextInt(-100, 101);
        }

        for (int element : values){
            System.out.println(element);
        }

        // 0.0 - 1.0
        // 0.0 - 0.9999

        for (int counter = 0; counter < 10; counter++){
            // Math.floor() - лучший метод для справедливого округления
            // Math.round() - не всегда равномерно округляет
            // Как в Math.random() задать минимальные и максимальные значения
            System.out.println(Math.floor(Math.random() * 10));
        }
    }

    public static void passByValueReference(){
        int x = 19;
        int[] values = {0, 1, 2, 3, 4, 5, 6};

        getValuesRead(x, values);

        System.out.println("ORIGINAL, int x: " + x + " and array: " + Arrays.toString(values));

        System.out.println("---------------------------------------------------------------------");

        changeValues(x, values);

        System.out.println("ORIGINAL, int x: " + x + " and array: " + Arrays.toString(values));

        String name = "Vasily Utkin";
        changeString(name);
        System.out.println(name);
    }

    public static void makeGeneralCall(){
        int[] numbers = new int[]{13, -1, 56, -0};

        // 0 (+0) - 127, -0 (не существует) автоматом превращается в +0, -128 (1 прибавляется из-за отсутствия -0)
        for (int index = 0; index < numbers.length; index++){
            System.out.println(numbers[index]);
        }

        // Ссылка на МАССИВ, это первый элемента массива: numbers == numbers[0]
        System.out.println(numbers);

        // Arrays - toString(), copy(), binarySearch()
        // бинарный пойск - Arrays - binarySearch(), 9, 1. 10, | -1. 10, 56, 1 (если справа)
        // Они опять делит массив -1. 10 | 56, 1
        // 9, 1. 10, | -1. 10, 56, 1 - НЕ РАБОТАЕТ БЕЗ СОРТИРОВКИ
        // МАССИВА - он неизменяем в размере, но у него есть и минус - его неизменяемость

        // Линейный пойск - индекс 0 - 1, в врем. больше...
        // Для нахождения соответствия проходим по всему массиву;
        int[] copyOfNumbers = new int[numbers.length + 20];

        numbers[numbers.length - 1] = -7;

        // [0, 0, 0, .... 13, -1, 56, 0]
        System.arraycopy(numbers, 0, copyOfNumbers, (copyOfNumbers.length - numbers.length), numbers.length);

        readArray(copyOfNumbers);

        readArrayConst();
    }

    public static void readArray(int[] array){
        // Если мы ТОЛЬКО ЧИТАЕМ МАССИВ
        // Т.Е. МЫ НЕ ДОЛЖНЫ МЕНЯТЬ ЕГО ЗНАЧЕНИЯ и НАМ НЕ НУЖНО ИМЕТЬ ДОСТУП К ОТДЕЛЬНЫМ ЕГО ИНДЕКСАМ
        // Усиленный-for, enhanced-for (JS, for, for in, for off...)
        // Java: for, enhanced-for

        // Classical - получаю доступ к каждому элементу через индекс
        // Поэтому у меня тотальный контроль
        /*
        for (int index = 0; index < array.length; index++){
            System.out.println("array[" + index + "]: " + array[index]);
        }
         */

        // enhanced-for он БЕРЕТ МАССИВ, СОЗДАЕМ ИЗ НЕГО КОЛЛЕКЦИЮ ЭЛЕМЕНТОВ
        // И каждый элемент - т.е. значение, поочередно сохраняет в element
        // Прочитал, заменил, прочитал, заменил... сам знаем где остановиться
        // Нет индексов

        int index = 1;

        for (int element : array){
            System.out.println("array[" + index + "]:" + element);
            index++;
        }
    }

    public static void readArrayConst(){
        String[] names = {"Archil", "Yulia", "Denis", "Dmitriy", "Ksenya"};

        // for (var name : names) -  сам разберется с типом

        for (String name : names){
            // name локальная переменная, она просто хранит что-то из массива, но массив сам тут не задействовать
            name = "Joshua";
            System.out.println("The name is: " + name);
        }

        for (String name : names){
            System.out.println("The name is: " + name);
        }
    }

    public static void getValuesRead (int x, int[] array){
        System.out.println("FROM METHOD getValues, int x: " + x + " and array: " + Arrays.toString(array));
    }

    // x - просто значение 19, т.е. я передаю переменную по значению Pass-by-COPY/Value
    // Я не просто массив передаю со значениями, я ПЕРЕДАЮ ОРИГИНАЛЬНЫЙ АДРЕС МАССИВА на который указывает мой основой
    // массив - Pass-by-Reference
    public static void changeValues(int x, int[] array){
        x += 101;

        array[0] = -8;
        array[1] = 8;
        array[array.length - 1] = 888;

        System.out.println("FROM METHOD getValues, int x: " + x + " and array: " + Arrays.toString(array));
    }

    // String is immutable, оригинал нельзя поменять
    // Потому, что каждый раз когда мы меняем Стринг, не создаем новый стринг
    public static void changeString(String name){
        name = "Archil Sikharulidze";
    }
}