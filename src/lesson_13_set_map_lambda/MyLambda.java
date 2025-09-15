package lesson_13_set_map_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyLambda{
    public static void main(String[] args) {
        // Stream API
        // конвейерные - пропускают и фильтруют
        // терминальные - на котором все заканчивается
        String[] namesArray = new String[]{"Archil", "Vasily", "Vladimir", "Sergey"};
        ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList("Archil", "Vasily", "Vladimir", "Sergey",
                "Vlad", "Viktor", "Veronika"));
        String name = "Archil";

        // Stream - arrays, Arrays.stream(ARRAY)
        // toList() - терминальный,
        // System.out.println();
        Arrays.sort(namesArray, (s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0)));
        System.out.println(Arrays.toString(namesArray));
        System.out.println(Arrays.stream(namesArray).filter(s -> s.startsWith("V")).toList());

        System.out.println(listOfNames.stream().filter(nameTemp -> nameTemp.startsWith("V")).
                                                filter(nameTemp -> nameTemp.length() > 4).count());
        System.out.println(listOfNames.stream().filter(nameTemp -> nameTemp.startsWith("V")).
                filter(nameTemp -> nameTemp.length() > 4).limit(3).count());
        System.out.println(listOfNames.stream().filter(nameTemp -> nameTemp.startsWith("V")).
                filter(nameTemp -> nameTemp.length() > 4).limit(3).
                peek(MyLambda::giveMeElement)); // e transform to STRING, repeat some action

        System.out.println("-".repeat(50));

        // map() - преобразовывает ваши элементы в какие-то другие
        // flatMap() -> ДЕЛИТ один ОБЪЕКТ на хотя ДВА
        listOfNames.stream().
                filter(e -> e.startsWith("V")).
                map(String::toUpperCase).
                forEach(System.out::println); // forEach (for -> выводит каждый элемент),
                // e -> System.out.println(e) == System.out::println
        System.out.println(listOfNames.stream().
                                        filter(e -> e.startsWith("V")).
                                        flatMap(e -> Stream.of(e.split("a"))).
                                        count());
        System.out.println(listOfNames.stream().
                filter(e -> e.startsWith("V")).
                flatMap(e -> Stream.of(e.split("a"))).
                toList());
    }

    public static void getEmployeesBySalary(){
        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee("Archil", 1300),
                new Employee("Vasily", 1134),
                new Employee("Katerina", 2011),
                new Employee("Natalya", 2000),
                new Employee("Genady", 2123),
                new Employee("Johnny", 1945),
                new Employee("Jennifer", 2391)));

        System.out.println(employees.stream().filter(empl -> empl.getSalary() >= 2000).toList());

        // LIST
        List<Employee> highSalaryEmployees =
                employees.stream().filter(empl -> empl.getSalary() >= 2000).toList();
        System.out.println(highSalaryEmployees);
        System.out.println("-".repeat(50));

        // ArrayList
        ArrayList<Employee> highSalaryEmployeesNew =
                new ArrayList<>(employees.stream().filter(empl -> empl.getSalary() >= 2000).toList());
        System.out.println(highSalaryEmployeesNew);

        // ERROR - cannot add to LIST
        highSalaryEmployees.add(new Employee("Fedor", 3742));
    }

    public static void giveMeElement(String e){
        System.out.println("I got this from peek stream: " + e);
    }

    public static void useLambda(){
        Calculate calculate;
        // ОБЪЯВЛЯЮ ПОВЕДЕНИЕ МЕТОДА calculateNumbers
        calculate = (x, y) -> {
            x = x / y;

            return String.format("%s", x);
        };

        String formattedDoubles = calculate.calculateNumbers(39, 7);
        System.out.println(formattedDoubles);
    }
}
