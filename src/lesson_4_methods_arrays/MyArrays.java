package lesson_4_methods_arrays;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        // Первая часть: массивы
        // Вторая алгоритмы сортировки: РАЗОБРАТЬСЯ САМИМ, НАПРИМЕР, ПУЗЫРЬКОВЫЙ АЛГОРИТМ
        char[] letters = initializeArrayChar(); // char[] letters = new char[26];
                                                // letters[0] -> a, b, c, d, e, f...

        readArray(letters);
    }

    public static char[] returnArrayChar(){
        return new char[26];
    }

    public static char[] initializeArrayChar(){
        char[] letters = returnArrayChar(); // char[] letters = new char[26];

        // from a to z
        for (int index = 0, letter = 97; index < letters.length; index++, letter++){
            letters[index] = (char) letter; // преврати например 97 в значение из таблицы ASCII - это бука - а
        }

        return letters;
    }

    public static void readArray(char[] letters){
        for(int index = 0; index < letters.length; index++){
            // (index + 1) != index++
            // (index + 1) возвращает сумму значения индекса + 1, но не меняет само значение индекса
            // а вот index++ - поменяет и значение индекса и у вас просто грохнется программа
            System.out.println("letters[" + (index + 1) + "]: " + letters[index]);
        }
    }

    public static void createArray(){
        // Массив (одномерный) - это коллекция одного типа данных, которую можно представить, как ЦЕПОЧКУ или РЯД
        // Если вы объявили массив определенного типа, все данные должны ему соответствовать
        // !!! ДЛИНА МАССИВА, ЗАДАЕТСЯ ВО ВРЕМЯ ВЫДЕЛЕНИЯ ПАМЯТИ. НЕЛЬЗЯ РАСШИРИТЬ МАССИВ
        // Т.е. если вы создали Массив, где хранится 7 элементов, его больше никак нельзя увеличить
        // C-style array declaration
        int decimalValues[]; // Дозволено, но нежелательно - такая форма написания называется также ОБЪЯВЛЕНИЕ МАССИВА
        // Массив - это ссылочный тип данных, т.е. это надо ОБЪЯВИТЬ, ВЫДЕЛИТЬ ПАМЯТЬ И ИНИЦИАЛИЗИРОВАТЬ (ЗАДАТЬ ЗНАЧЕНИЯ)
        decimalValues = new int[5]; // ВОТ ТЕПЕРЬ, мы сделали второй ШАГ: выделили память, но свои значения не задали
        System.out.println(decimalValues[0]);

        boolean logicalValues[] = new boolean[5];
        System.out.println(logicalValues[0]);

        // array = [4][-1][0][10][-1]
        // array равняется array[0] - название массива указывает на его первый индекс, т.е. первый элемент

        String[] names = new String[5]; // ДЛИНА МАССИВА, ПЕРВЫЙ ИНДЕКС [0], а последний [ДЛИНА - 1]
        names[0] = "Archil";
        names[1] = "Katya";
        names[2] = "David";
        names[3] = "Yulia";
        names[4] = "Vasya";

        System.out.println("names[0]: " + names[0]);
        System.out.println("names[0]: " + names[4]);

        System.out.println("-".repeat(50));

        char[] letters = new char[]{'E', 'g', ')', '$', '#', 'p'};

        // Arrays - class in Java
        System.out.println(Arrays.toString(letters));

        // length = 5, то последний элемент прочитанный будет 4
        for(int index = 0; index < letters.length; index++){
            System.out.println("letters[" + index + "]: " + letters[index]);
        }
    }
}
