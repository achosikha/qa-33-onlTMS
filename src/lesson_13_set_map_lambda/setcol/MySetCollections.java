package lesson_13_set_map_lambda.setcol;

import java.util.*;

public class MySetCollections {
    public static void main(String[] args) {
        // Set
        // HashSet
        // LinkedHashSet

        // Sorted
        // TreeSet
        // List - Set
        useTreeMap();
    }

    public static void useTreeSet(){
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(14);
        numbers.add(-1);
        numbers.add(9);
        numbers.add(101);
        numbers.add(9);
        numbers.add(-100);
        numbers.add(0);
        numbers.add(99);

        System.out.println(numbers);
        numbers.pollLast();
        System.out.println(numbers);
        numbers.pollFirst();
        System.out.println(numbers);
    }

    public static void useLinkedHashSet(){
        LinkedHashSet<String> names = new LinkedHashSet<>();
        // Linked
        // ОЧЕРЕДНОСТЬ ЭЛЕМЕНТОВ СОХРАНИЛАСЬ
        names.add("Archil");
        names.add("Vasya");
        names.add("Yulia");
        names.add("Viktor");
        names.add("Katya");
        names.add("Lena");
        names.add("Anastasya");
        names.add("James");
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
    }

    public static void useHashSet(){
        // List - Set - УНИКАЛЬНЫЕ ЗНАЧЕНИЯ
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(-1);
        numbers.add(9);
        numbers.add(101);
        numbers.add(9);
        // Упорядоченность, и хранение идет таким образом, что мы можем получать ИНДЕКСЫ
        System.out.println(numbers);

        HashSet<Integer> numbersSet = new HashSet<>();
        numbersSet.add(14);
        numbersSet.add(-1);
        numbersSet.add(9);
        numbersSet.add(101);
        numbersSet.add(9);

        // Set - УНИКАЛЬНОСТЬ
        // HashSet - создает под каждый элемент специальный уникальный ХЭШ КОД - какое-то число
        // Значения под своими уникальными числами хранятся в таблицах
        // Поскольку уникальное значение не совпадает с тем, как вы вставили элементы в контейнер
        // Поэтому, предугадать расстановку элементов будет тяжело
        // Следовательно, у вас порядок элементов будет зависеть от их ХЭШ КОДА В ТАБЛИЦЕ
        System.out.println(numbersSet);
        numbersSet.add(-5);
        numbersSet.add(-8);
        System.out.println(numbersSet);

        for (int counter = -5; counter <= 10; counter++){
            System.out.println("Was element " + counter + " added to the HashSet container? " +
                    numbersSet.add(counter)); // add - true если элемент был добавлен и false если нет
        }

        System.out.println(numbersSet);

        for(Integer element : numbersSet){
            System.out.println("Element: " + element);
        }

        System.out.println("-".repeat(50));

        // numbersSet.stream().forEach(System.out::println);
        numbersSet.forEach(System.out::println);
        System.out.println(numbersSet.contains(9));

        System.out.println("-".repeat(50));
        System.out.println("Get hash codes: ");
        for(Integer element : numbersSet){
            System.out.println("Element: " + element + " hashCode is: " + element.hashCode());
        }
    }

    public static void useHashMap(){
        // Map<KEY, VALUES>
        // String, String
        // Integer, String
        HashMap<Integer, String> data = new HashMap<>();
        data.put(1, "House");
        data.put(2, "Dog");
        data.put(3, "Horse");
        data.put(4, "Mouse");
        data.put(5, "Scorpion");

        System.out.println(data);
        System.out.println(data.get(2));
        // keySet - все ключи
        // values - все значения
        // entrySet - позволяет взять и ключи и значения
    }

    public static void useTreeMap(){
        TreeMap<String, String> vocabulary = new TreeMap<>();
        vocabulary.put("House", "Дом");
        vocabulary.put("Dog", "Собака");
        vocabulary.put("Horse", "Лошадь");
        vocabulary.put("Mouse", "Мышь");
        vocabulary.put("Scorpion", "Скорпион");

        System.out.println(vocabulary);

        // Iterator возможность пройтись по коллекции, как по массиву
        Iterator<String> iterator = vocabulary.keySet().iterator();

        // iterator.hasNext() - он смотрит есть ли в Итераторе следующий ключ
        // iterator.next() - достает этот ключ
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-".repeat(50));
        // Как достать ключи и значения вместе
        // Map.Entry<String, String>
        for (Map.Entry<String, String> entry : vocabulary.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("Under the KEY: %s - is a VALUE: %s.\n", key, value);
        }

        Collection<String> values = new PriorityQueue<>();
    }
}