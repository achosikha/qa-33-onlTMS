package lesson_4_methods_arrays;

import java.util.Arrays;

public class MyArraysCorrect {
    public static void main(String[] args) {
        // Start Game
        extendArray();
    }

    public static void startGame(){
        getInstructions();

        System.out.println("Let's initialize an array.");
        String[] names = initializeArray();
        System.out.println("Let's read array values...");
        readArray(names);
    }

    public static void getInstructions(){
        System.out.println("Welcome to GUESS WORD GAME...");
        System.out.println("You should guess a HIDDEN WORD EITHER BY LETTERS or a WHOLE WORD...");
    }

    public static String[] initializeArray(){
        return new String[]{
                "Archil",
                "Olesya",
                "Vasily",
                "Katya",
                "Evgeny",
                "Alina",
                "Dasha",
                "Masha",
                "Anton"
        };
    }

    public static void readArray(String[] names){
        for (int index = 0; index < names.length; index++){
            System.out.println("names[" + (index + 1) + "]: " + names[index]);
        }
    }

    public static void extendArray(){
        int[] originalArray = {14, -1, 0, 19, 100, -6, 197}; // = {} - за вас компилятор допишет new int[]

        // Новый массив получит длину старого 7 и увеличит его еще на 10 = 17
        int[] copiedArray = new int[originalArray.length + 10];

        for (int index = 0; index < originalArray.length; index++){
            copiedArray[index] = originalArray[index];
        }

        System.out.println("THE ORIGINAL ARRAY IS: " + Arrays.toString(originalArray));
        System.out.println("THE COPIED ARRAY IS: " + Arrays.toString(copiedArray));
    }
}
