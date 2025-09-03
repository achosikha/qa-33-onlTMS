package lesson_10_excep_strings.excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionFile {
    public static void main(String[] args) /*throws FileNotFoundException */ {
        // Object -> Throwable -> Exception, Errors
        // Exception -> Unchecked, Checked
        // Unchecked: исключения, которые компилятор может подсказать, может привести к определенным ошибках во время
        // выполнения программы, следовательно, Run-Time Errors: DIVISION by ZERO, ArrayOutOfBoundException

        // Checked: когда мы подключаем внешние ресурсы, ЧИТАТЬ, ЗАПИСЫВАТЬ В ФАЙЛ, ПОДКЛЮЧЕНИЕ БАЗЫ ДАННЫХ...
        // Компилятор заставит вас проверить успешно ли была налажена связь! Если вы не используете исключение,
        // У вас будет ОШИБКА КОМПИЛЯТОРА, т.е. код не будет собран.

        // Иерархия ИСКЛЮЧЕНИЙ
        // Первая, чтобы программа не ЛЕГЛА, могла продолжит как-то функционировать
        // Вторая, ДЛЯ ЛОГОВ - это специальный документ, который выдает нам сообщения и работе вашего БЭКА

        /*
        try{
            System.out.println(10/0);
        } catch (IndexOutOfBoundsException e){

        } catch (ArrayIndexOutOfBoundsException e){
            //
        } catch (StringIndexOutOfBoundsException e){
            //
        //} catch (IndexOutOfBoundsException e){
            //
        } catch (NullPointerException e){
            //
        } catch (Exception e){
            //
        }
         */
        try{
            System.out.print("Please, enter a password: ");

            // ПОДКЛЮЧЕНИЕ ИСКЛЮЧЕНИЯ для main
            getVerification(new Scanner(System.in).nextLine());
        } catch (Verification e) {
            System.out.println(e.getMessage());
        }

        /*
        // Если я пробросил исключение на УРОВНЕ МЕТОД, то и вызывающий его МЕТОД ДОЛЖЕН ОБРАБОТАТЬ ОТДЕЛЬНО ЭТО ЖЕ
        // ИСКЛЮЧЕНИЕ - и тут точно также, можно использовать блок try-catch или же тоже пробросить на уровне МЕТОД

        // Если нужно больше доступа к функционалу и тому, что и как должно быть при ошибке, то в try-catch
        // Если этого не надо - можно на уровень МЕТОД
        try {
            readScannerExceptionMethod();
        } catch (FileNotFoundException e) {
            System.out.println("You tried to read a document: " + e.getMessage());

            // throw используется только внутри блока или метода
            // оно говорит - ПРОБРОСЬ НОВОЕ ИСКЛЮЧЕНИЕ
            // Если у вашего экземпляра класса нет постоянной переменной, то такой класс называется АНОНИМНЫМ
            // Например:
            // Scanner read = new Scanner(new File("..."));
            // read (Scanner) - полноценный экземпляр класса, поскольку у него есть постоянный адрес - переменная,
            // которая на него указывает, а вот new File - это анонимный вызов, который создает временный одноразовый
            // экземпляр класса, выполняет задачу и захлопывается, у него нет постоянной ссылки - т.е. переменной
            throw new RuntimeException(e);
        }

         */
    }

    public static void getVerification(String password) throws Verification{
        if (new Verification().getPassword().equals(password)){
            throw new Verification("ВАША ВЕРИФИКАЦИЯ ПРОШЛА УСПЕШНА!");
        } else {
            throw new Verification("ВАША ВЕРИФИКАЦИЯ НЕ ПОДТВЕРЖДЕНА!");
        }
    }

    // ИСКЛЮЧЕНИЯ УРОВНЯ МЕТОД
    // ПРОБРАСЫВАНИЕ ИСКЛЮЧЕНИЯ В МЕТОД - здесь нам нужно ключевое слово - throws
    // Чтобы пробросить исключение в МЕТОД надо добавить в его СИГНАТУРУ, после () ключевое слово throws +
    // название исключения
    public static void readScannerExceptionMethod() throws FileNotFoundException{
        // Пробросить через сигнатуру метода ИСКЛЮЧЕНИЕ и поймать его в вызывающем методе
        Scanner read = new Scanner(new File("src/lesson_10_excep_strings/excep/dataAA.txt"));

        while (read.hasNext()){
            System.out.print(read.nextLine());
        }

        read.close();
    }

    public static void tryWithResources(){
        // try-with-resources ИСПОЛЬЗУЙ В ТЕХ СЛУЧАЯХ, КОГДА РАБОТА ИДЕТ С РЕСУРСАМИ
        // РЕСУРС - ЭТО ПОДКЛЮЧЕНИЕ ЧЕГО-ТО, ОТКРЫТИЕ
        // ЧТО РЕСУРС АВТОМАТИЧЕСКИ ЗАКРОЕТСЯ - без вашей помощи
        // Также работает и со СКАННЕРОМ, с другими реализациями
        try(FileInputStream readDocument = new FileInputStream("src/lesson_10_excep_strings/excep/data.txt")){
            int letter;

            while ((letter = readDocument.read()) != -1){
                System.out.print((char) letter);
            }
        } catch (FileNotFoundException e){
            System.out.println("You have tried to open a document: " + e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This code will be published by all means...");
        }
    }

    public static void tryFinally(){
        // Второй вариант исключений - это try-finally
        // Например, была ошибка или нет, мне нужно ЧТО-ТО ВСЕ РАВНО В ТЕЛЕ ИСКЛЮЧЕНИЯ СДЕЛАТЬ
        FileInputStream readDocument;

        try{
            readDocument = new FileInputStream(new File("src/lesson_10_excep_strings/excep/dataAAA.txt"));
            int letter;

            while ((letter = readDocument.read()) != -1){
                System.out.print((char) letter);
            }
            System.out.println("\n");

            readDocument.close();
        } catch (FileNotFoundException e) {
            System.out.println("You tried to open a document: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // ВСЕГДА ВЫПОЛНИТСЯ ЭТО ЧАСТЬ, НЕ ИМЕЕТ ЗНАЧЕНИЕ БУДЕТ ИСКЛЮЧЕНИЕ ИЛИ НЕТ
            System.out.println("This part of the code will be produced by all means...");
        }

        System.out.println("After try catch BLOCK!!!");
    }

    public static void readScanner(){
        try{
            Scanner read = new Scanner(new File("src/lesson_10_excep_strings/excep/data.txt"));
            // 1. Если не могу ВСЕ РАЗОМ
            // 2. ПО частям, это или СИМВОЛ или СТРОЧКА, а это значит ЦИКЛ
            // 3. Если цикл - ТОГДА КАК Я УЗНАЮ, есть ли что-то там дальше? Т.е. когда остановиться?
            // У некоторых объектов есть ВОЗМОЖНОСТЬ САМОМУ ПРОВЕРИТЬ - СУЩЕСТВУЕТ ЛИ СЛУДЕЮЩИЙ ЭЛЕМЕНТ?
            // В нашем случае СТРОКА, любой метод, который называется hasNext() это проверка на существование
            // дальнейшего элемента
            while(read.hasNext()){
                System.out.println(read.nextLine());
            }

            // ОБЯЗАТЕЛЬНО ЗАКРЫТЬ ЗА СОБОЙ ДВЕРИ!!! - РЕСУРС НАДО ЗАКРЫТЬ!!!
            read.close();
        } catch (FileNotFoundException e){
            System.out.println("You have tried to read a document: " + e.getMessage());
        }
    }

    public static void readFile(){
        // try-catch - это УРОВЕНЬ БЛОК
        // У нас есть исключения УРОВНЯ БЛОК и УРОВНЯ МЕТОД

        // Чтобы что-то прочитать:
        // 1. Создать объект, который укажет на ПУТЬ, НАЗВАНИЕ ФАЙЛА...
        // 2. Прикрепить этот ПУТЬ, ФАЙЛ к МЕХАНИЗМУ ЧТЕНИЯ, ЗАПИСИ ДОКУМЕНТА
        // 3. FileInputStream, FileReader, Scanner...

        // FILE - или указывает прямо на документ (его путь), или может быть использован для создания
        // ЦЕЛОЙ СТРУКРТУРЫ ДОКУМЕТОВ
        File document = new File("src/lesson_10_excep_strings/excep/data.txt");

        // ЗДЕСЬ ПРОИСХОДИТ ПОПЫТКА ПОДКЛЮЧЕНИЯ
        try{
            FileInputStream readDocument = new FileInputStream(document);
            int letter;

            // EOF - END OF FILE, Специальное значение, которое используется, чтобы понять документ полностью прочитан
            // или нет.
            // EOF == -1, если у вас на системе не работает слово EOF, тогда можете свободно заменить его числовым
            // значением - 1. ПОЧЕМУ: -1 ??? Потому, что в ТАБЛИЦАХ ASCII, Extended ASCII, HIGH ASCII -1 никакому
            // символу не присвоен

            // Stream - это поток байтов, символов, мы читаем каждый символ отдельно
            // System.out.println((char) readDocument.read()); -> вернет только первый символ
            while((letter = readDocument.read()) != -1){
                System.out.print((char) letter);
            }

            // ОБЯЗАТЕЛЬНО ЗАКРЫТЬ ЗА СОБОЙ ДВЕРИ!!! - РЕСУРС НАДО ЗАКРЫТЬ!!!
            readDocument.close();
        } catch (FileNotFoundException e) {
            System.out.println("You tried to read a document: " + e.getMessage());;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Let's try to do something else...");
    }
}
