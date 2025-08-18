package lesson_5_multidimensional_array;

import java.util.Random;
import java.util.Scanner;

public class GuessWordGame {
    public static void main(String[] args) {
        // АЛГОРИМТ - ОПРЕДЕЛЕННЕ КОЛИЧЕСТВО ДЕЙСТВИЙ В ОПРЕДЕЛЕННОМ ПОРЯДКЕ

        // Угадай Слово
        // Сыграем в угадай букву или целое слово

        // 1. Дать инструкцию по применению - ЧТО, ГДЕ и КАК
        // 2. Создать одномерный массив со скрытыми словами
        // 3. Используя РЭНДОМ выбрать из массива ОДНО СЛОВО и сохранить ЕГО
        // 4. Позволить пользователю: 1) угадать слово по буквам, 2) полностью слово
        // 5. Проверить, если пользователь ввел одну букву - проверяем существование этой буквы в СЛОВЕ
        // 6. Если оно есть - выводим сообщение и расположение в слове: ЯБЛОКО - о - ***о*о
        // 7. Если буквы нет - выдаем сообщение и продолжаем;
        // 8. Если он ввел больше одной буквы, угадывает слово и проверяем верность
        // 9. Если слово неверное - выдаем сообщение и просим вновь ввести значение
        // 10. Если все буквы отгаданы - ВЫ ПОБЕДИЛИ. ХОТИТЕ ВНОВСЬ СЫГРАТЬ?
        // 11. Если да - начинается заново, если нет - ПРОЩАЙТЕ! - программа заканчивается
        // 12. Тоже самое с угадыванием слова
        startGame();
    }

    public static void startGame(){
        // Основная логика, метод контроля
        showInitialInstruction();

        System.out.print("Would you like to START THE GAME (y - yes, n - no)? ");

        if ((getInput().nextLine().equalsIgnoreCase("y"))){
            System.out.println("-".repeat(100));
            while(true){
                String hiddenWord = getHiddenWord(hiddenWords());
                System.out.println("Your hidden WORD IS: " + hiddenWord);
                break;
            }
        } else {
            System.out.println("-".repeat(100));
            System.out.println("You have decided not to EVEN START GAME TO TRY. BUY! BUY!");
        }
    }

    public static void showInitialInstruction(){
        System.out.println("-".repeat(100));
        System.out.println("Welcome to GUESS WORD game by Archil Sikharulidze.");
        System.out.println("Your job is to GUESS hidden word by either LETTERS or you can guess a whole WORD.");
        System.out.println("Game will be played until you guess all letters or the whole word.");
        System.out.println("If you guess LETTER it will appear on the screen. If you missed, message will be too.");
        System.out.println("Once you guess the word you will be asked to play again or leave.");
        System.out.println("-".repeat(100));
    }

    public static String[] hiddenWords(){
        return new String[]{
                "apple",
                "house",
                "kingdom",
                "country",
                "housekeeper",
                "earth",
                "jeep",
                "banana",
                "cat",
                "moon",
                "valley"
        };
    }

    public static String getHiddenWord(String[] hiddenWords){
        return hiddenWords[getRandom().nextInt(0, hiddenWords.length)];
    }

    public static Random getRandom(){
        return new Random();
    }

    // Возвращает экземпляр класса Scanner и я могу каждый
    // раз использовать его в разных направлениях
    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}
