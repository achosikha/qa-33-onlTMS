package more.streamapi;

import java.util.*;

public class MyStreamApi {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Archil", "Teona", "Darya", "Johnny", "Michael",
                "Abdulla", "Michelle", "George", "Anastasya", "Aleksandr", "Anna"));
        List<String> listNames = List.copyOf(Arrays.asList("Archil", "Temuka"));

        System.out.println(listNames);
        // listNames.add("Katya");
        useStreamAPI(names);
    }

    public static void useStreamAPI(ArrayList<String> names){
        // Функциональное программирование
        // Несколько технологий Stream - это API, встроенная библиотека
        // Обработка группы объектов
        // Принцип конвейера - идут данные, а мы их фильтруем
        // Удобная замена циклов

        // Stream -> filer -> sorted -> distinct -> map -> collect
        // Arrays.stream()

        // Методы: конвейерные, которые сами возвращают другой СТРИМ - filter().filter().filer()
        // Методы: терминальные, обычно, завершает поток и дает результат, стрим нельзя больше использовать .count()
        // После ничего нельзя выполнить
        names.stream().sorted().forEach(System.out::println);

        System.out.println(names.stream().filter(name -> name.startsWith("D")).findAny());
        System.out.println(names.stream().filter(name -> name.startsWith("D")).count());
        System.out.println(names.stream().filter(name -> name.startsWith("A")).
                filter(name -> name.length() > 4).toList());

        names.stream().filter(name -> name.startsWith("A")).
                filter(name -> name.length() > 4).forEach(System.out::println);

        // skip(n) first n elements
        // distinct() only unique values
        // map() превращает оригинальный объект в другой или модифицирует его (ЛОГИКА)
        // List<Optional<String>> .. если мы будем превращать объект в Optional, который сам хранит строчки
        // peek(name -> String.toUpperCase(name); (МЕТОД)
        // limit(n) - after this only maximum number will pass
        names.stream().filter(name -> name.startsWith("A")).
                filter(name -> name.length() > 4).map(String::toUpperCase).peek(System.out::println).
                forEach(System.out::println);

        // flatMap() разбить один объект на несколько
        // INPUT: "CD", flatMap() -> for example, split() - two objects "C", "D" -> is passed later on
        // Arrays.stream(name.split("a+"))

        // collect() - combine together to a collection
        // anyMatch(name -< name.equals()) - true or false
        // allMatch() - if all matches true
        // isPresent() - if there is any element

        // parallel
    }

    public static void getEmployees(){
        // private String names
        // private Integer salary
        // private String department
        // Only Security
        // Salary more >
        // employees.stream().filter(e -> "Security".).filer(e -> salary).toList()
    }
}