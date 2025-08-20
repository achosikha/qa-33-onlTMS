package lesson_6_methods_oop.homework;

import java.util.Arrays;
import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {
        // Homework
        // 1. Создать массив простых одномерный + простых чисел
        // 2. Удалить вхождения одного числа - ПОЛЬЗОВАТЕЛЬ ВВОДИТ ЧИСЛО
        // 3. После этого, вывести уже новый массив
        // 4. СОВСЕМ НОВЫЙ????
        // System.out.println(Arrays.toString(deleteValuesArray()));
        testProgram();
    }

    public static int[] deleteValuesArray(){
        // Просто провести линейный пойск - МАССИВ маленький
        // Или, сортировать массив, а после с использование бинарного поиска посмотреть есть ли число
        // Если есть, сколько раз??? И потом эти индексы не перенести в новый массив

        int[] simpleDecimalsArray = {-1, -1, 9, -1, 9, 10, 0, -9, 11, 9, 9, 0, 0};

        System.out.println("We have an array. The array is: " + Arrays.toString(simpleDecimalsArray));
        System.out.print("Please, enter a decimal value to check whether there is such number in the array: ");
        int value = Integer.parseInt(getInput().nextLine());

        int counter = 0;

        // МОЖНО ПОДУМАТЬ И ОПТИМИЗИРОВАТЬ, как минимум можно это заменить на enhanced-for
        for (int index = 0; index < simpleDecimalsArray.length; index++){
            // Пройтись по массиву и посмотреть есть ли число
            // Если нет, тогда ТАКОГО ЧИСЛА НЕТ
            // Если да, то СКОЛЬКО???
            // Убрать из массива все ненужные числа
            if (simpleDecimalsArray[index] == value){
                counter++;
            }
        }

        int[] updatedDecimalValuesArray;

        if (counter > 0){
            updatedDecimalValuesArray = new int[simpleDecimalsArray.length - counter];

            // ОПТИМИЗИРОВАТЬ ??? КАК???
            for (int index = 0, inner = 0; index < simpleDecimalsArray.length; index++){
                if (simpleDecimalsArray[index] != value){
                    updatedDecimalValuesArray[inner] = simpleDecimalsArray[index];
                    inner++;
                }
            }
        } else {
            System.out.println("There is no SUCH VALUE " + value + " in the array.");
            return simpleDecimalsArray;
        }

        return updatedDecimalValuesArray;
    }

    // Scanner in method
    public static Scanner getInput(){
        return new Scanner(System.in);
    }

    public static void testProgram() {
        int[] numbers = {-1, -1, 9, -1, 9, 10, 0, -9, 11, 9, 9, 0, 0};

        int target = 9;

        boolean found = false;

        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
    }
}
