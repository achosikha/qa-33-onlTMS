package lesson_12_set_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        // Stream - это НИТЬ, но как технология подразумевает несколько вещей
        // Поэтому, чтобы подчеркнуть что мы имеем виду надо обязательно дополнить API
        // Stream API специальная библиотека для функционального программирования
        // Для быстрой обработки большого количества данных и получения обратных результатов
        // Например, мне нужно получить НИТЬ/ПОТОК данных, отфильтровать ненужные, задать определенные условия
        // и вернуть уже например коллекцию типа List с новыми данными

        // Arrays.stream()
        // stream()

        // stream().filter(ЧТО МЫ ИЩЕМ???) -> после задаем условия - и собираем данные

        // Два типа методов: конвейерные - те, что получает данные, их обрабатывает и пробрасывают, filter()
        // Терминальные - конечные, это методы, которые закрывают НИТЬ, после них дальше ничего не идет, count()
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Archil", "Dasha", "Teona", "Darya", "Johnny", "Michael",
                "Abdulla", "Michelle", "George", "Anastasya", "Aleksandr", "Anna", "Dima"));

        // Один поток на один результат
        names.stream().sorted().forEach(System.out::println); // e -> System.out.println(e)
        System.out.println(names);

        // stream() -> фильтр (туда пробрось каждый элемент из коллекции, и каждую из них по очереди сохрани
        // в переменной name, потом посмотри переменная name начинается с большой буквы или нет и выведи мне любое
        // совпадение
        System.out.println(names.stream().filter(name -> name.startsWith("D")).findAny());
        System.out.println(names.stream().filter(name -> name.startsWith("D")).count());

        System.out.println(names.stream().filter(name -> name.startsWith("A")).
                filter(name -> name.length() > 4).toList());

        ArrayList<String> namesNew = new ArrayList<>(names.stream().filter(name -> name.startsWith("A")).
                filter(name -> name.length() > 4).toList());
        System.out.println(namesNew);
    }
}
