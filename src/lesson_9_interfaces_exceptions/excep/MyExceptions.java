package lesson_9_interfaces_exceptions.excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyExceptions {
    public static void main(String[] args) {
        // ИСПОЛЬЗОВАТЬ ИСКЛЮЧЕНИЯ
        // Исключение - это механизм отлавливания ОШИБОК - ДОСТАТЬ ИЗ БАЗЫ ДАННЫХ ОПРЕДЕЛЕННЫЙ ОБЪЕКТ
        // ЕСЛИ ОБЪЕКТ УСПЕШНО БЫЛ ОБРАБОТАН - НИЧЕГО, ЕСЛИ ЖЕ БЫЛИ ОШИБКИ - СОЗДАЙ ДОКУМЕНТ ЛОГИНФО и укажи
        // когда, что, и почему
        // 2025.09.01_LOG.TXT - 19.56 - FAILURE to ....

        // ЧТО также важно, это и механизм удерживания вашей программы от ТОТАЛЬНОГО ОТКЛЮЧЕНИЯ
        // НАПРИМЕР, ПОДКЛЮЧИТЬСЯ К БАЗЕ ДАННЫХ
        // Если программа в обыходе - ВЫ ОБЯЗАНЫ ВЫВЕСТИ СООБЩЕНИЕ и СКАЗАТЬ, ЧТО ВСЕ БУДЕТ ХОРОШО!

        // try-catch
        // try-catch-finally
        // try-with-resources

        // EXCEPTIONS -> UNCHECKED, CHECKED
        // UNCHECKED - компилятор не подскажет, поскольку думает, что вы достаточно умны,
        // Тут логические и математические ошибки, связанные с незнанием работы самого языка
        checkedExceptions();
    }

    public static void checkedExceptions(){
        // Scanner -> это ресурс
        // Если мне нужно что-то ИЗВНЕ ДОСТАТЬ, ОТКРЫТЬ ФАЙЛ, ПРОЧИТАТЬ ФАЙЛ, ВКЛЮЧИТЬ ДОКУМЕНТ,
        // ПОДКЛЮЧИТЬ БАЗУ - ВСЕ ЭТО ВНЕШНЕЕ ОБЫКНОВЕННО ТРЕБУЕТ ОТ ВАС ОБЯЗАТЕЛЬНО ПРОВЕРИТЬ и ОБРАБОТАТЬ
        // ВОЗМОЖНЫЙ ПРОВАЛ
        try
        {
            FileInputStream document =
                    new FileInputStream(new File("src/lesson_9_interfaces_exceptions/excep/dataA.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("You have tried to read a document. We handled an exception: " + e.getMessage());;
        }
    }

    public static void useMultipleCatch(){
        // LOGICAL DIVISION MUST BE
        try{
            System.out.println(0 / 122);
            System.out.println(122 / 0); // Тут будет не ошибка компиляции, а RUNTIME-ERROR
            System.out.println("Message after division by ZERO!");

            int[] values = {1, 19, -1};

            for(int index = 0; index <= values.length; index++){
                System.out.println(values[index]);
            }
        } catch (ArithmeticException e){
            System.out.println("We handled an exception. The message is: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You have made a mistake in indexes. Check your array indexing...");
        } catch (Exception e) {
            System.out.println("!!");
        }

        System.out.println("After two UNCHECKED EXCEPTIONS HANDLED");
    }

    public static void pushUncheckedException(){
        // ДЕЛЕНИЕ на НОЛЬ недопустимо, НОЛЬ делить на что-то можно, например, 0 / 10
        // НАОБОРОТ НЕТ
        try{
            System.out.println(0 / 122);
            System.out.println(122 / 0); // Тут будет не ошибка компиляции, а RUNTIME-ERROR
            System.out.println("Message after division by ZERO!");
        } catch (ArithmeticException e){
            System.out.println("We handled an exception. The message is: " + e.getMessage());
        }

        int[] values = {1, 19, -1};

        try{
            for(int index = 0; index <= values.length; index++){
                System.out.println(values[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You have made a mistake in indexes. Check your array indexing...");
        }

        System.out.println("After two UNCHECKED EXCEPTIONS HANDLED");
    }
}
