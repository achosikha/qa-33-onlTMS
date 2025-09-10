package lesson_12_set_stream_api.practice;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice {
    public static void main(String[] args) {
        //
    }

    public static void useSplitOrRegEx(){
        // Достаньте все числовые значения из строки
        String str = "010-yxd-456-er-8564-173565-TTX--1";
        // ...... - ..... - ....
        String[] splitStr = str.split("-");
        System.out.println(Arrays.toString(splitStr));

        // - - - -
        Pattern pattern = Pattern.compile("--"); // "-" - пойщи мне знак -, "--" - пойщи
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

        // d - DIGIT, \\d == [0-9]
        // s - SPACE, \\s == SPACE
        // [0-9]+ || [A-z]+
        // || OR, && AND, SHORT OR |, SHORT AND &
        // [0-9]+|[A-z]+ == \\w+ ПРИ УСЛОВИИ, ЧТО В ФОРМАТЕ НЕ БУДЕТ ЗАПЯТОЙ
        pattern = Pattern.compile("\\w+"); // [0-9]+ == [0-9]{1,} == \\d+ == \d == \d{1,}
        matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void getStringSpaces(){
        String str = "  Welcome to TMS   QA  COURSE.   Lecturer:    Archil  Sikharulidze   ";
        str = str.replaceAll("\\s+", " ").trim();
        System.out.println(str);
    }

    public static void getEmailAddressHosts(){
        // Array String - ....@mail.ru, ...@gmail.com, ...@yahoo.com
        String[] emails = new String[]{
                "archil.sikharulidze@tsu.ge",
                "archil.sikharulidze@mail.ru",
                "achosikha@gmail.com",
                "masha88@yahoo.com"
        };

        Pattern pattern = Pattern.compile("@[A-z]+\\.[A-z]+$");
        // ЕСЛИ ВЫ ЗНАЕТЕ, ЧТО ДАЛЬШЕ НИЧЕГО НЕ ДОЛЖНО БЫТЬ $

        Matcher matcher;

        for(int index = 0; index < emails.length; index++) {
            matcher = pattern.matcher(emails[index]);

            while(matcher.find()){ // БЕЗ find() никакие данные не даст и попытка использовать метод group()
                // провалиться, даже если есть совпадения
                System.out.println(matcher.group());
            }
        }
    }
}
