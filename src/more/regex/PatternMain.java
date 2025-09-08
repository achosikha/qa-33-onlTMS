package more.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMain {
    public static void main(String[] args) {
        Pattern arithmeticOperations = Pattern.compile("[/*+-]");
        String operation = "14/5*7-9+10+11/9";
        String[] splitOperation = operation.split(String.valueOf(arithmeticOperations));

        System.out.println(Arrays.toString(splitOperation));

        usePatternMatcher("Archil Sikharulidze is a NICE GUY!");
        System.out.println("-".repeat(50));
        splitRegEx();
        System.out.println("-".repeat(50));
        // usePatternMatcherSplit("19+5-20*5*5/19+1");
        useAppendReplacement();
    }

    public static void usePatternMatcher(String names){
        Pattern pattern = Pattern.compile("[A-z]{3}");

        // Created but not started
        Matcher matcher = pattern.matcher(names);
        System.out.println("Are there any matches? " + matcher.lookingAt());
        System.out.println("-".repeat(50));

        // matcher.region(start_index, end_index) if the STRING is pretty big and we don't need to check
        // the whole String

        while(matcher.find()){
            System.out.println("FROM: " + matcher.start());
            System.out.println(matcher.group());
            System.out.println("TO: " + matcher.end()); // NOT INCLUDED END
        }
    }

    public static void usePatternMatcherSplit(String names){
        Matcher arithmeticOperations = Pattern.compile("[^+/*-]").matcher(names);

        while(arithmeticOperations.find()){
            System.out.println(arithmeticOperations.group());
        }
    }

    public static void splitRegEx(){
        String text = "apple123banana456cherry789";
        String[] splitString = text.split("\\d+"); // [0-9]* , d [number] + any occurrences
        System.out.println(Arrays.toString(splitString));
    }

    public static void useAppendReplacement(){
        Matcher matcher = Pattern.compile("[A-z]{5}").matcher("Archil Vasya Dima Svetlana Lena");

        StringBuilder str = new StringBuilder();

        while(matcher.find()){
            matcher.appendReplacement(str, "TTTTT");
        }
        matcher.appendTail(str);

        System.out.println(str);
    }

    public static void regEx(){
        String input = "Hello world group c36!";
        Pattern pattern = Pattern.compile("[abc]"); // {1}
        Matcher matcher = pattern.matcher(input);

    while(matcher.find()){
        System.out.println(matcher.group());
    }
    }
}
