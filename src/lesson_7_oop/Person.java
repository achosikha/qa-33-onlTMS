package lesson_7_oop;

public class Person {
    String name;
    String surname;
    int age;
    String position;

    // Java Constructor - если вы свой конструктор не указали
    // Во время компиляции ваша машина сама добавить КОНСТРУКТОР !!!
    // default constructor

    // Если вы сами создали любой конструктор, не имеет значения какой
    // Компилятор уже ничего не добавит

    // Constructor delegate - делегирующий конструктор
    public Person(){
        // ключевое слово this - ВОЗЬМИ АДРЕС В ПАМЯТИ НА ЭТОТ ОБЪЕКТ
        // Дайка мне ссылку на твой объект - а потом я добавляю () - ты вызываешь этот же объект, но его конструктор
        this("Unknown", "Unknown", 0, "Unknown");
    }

    public Person(String name){
        this(name, "Unknown", 0, "Unknown");
    }

    public Person(String name, String surname){
        this(name, surname, 0, "Unknown");
    }

    public Person(String name, String surname, int age){
        this(name, surname, age, "Unknown");
    }

    // Конструктор, который ПОКРЫВАЕТ ВСЕ ВОЗМОЖНЫЕ СЦЕНАРИИ
    public Person(String name, String surname, int age, String position){
        // Person archil = new Person();
        // archil.name = name;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    /*
    public Person(){
        // FIELDS
        // ПАРАМЕТРЫ ДАННЫЕ ОБЪЕКТА
    }

    public Person(String nameP, String surnameP){
        name = nameP;
        surname = surnameP;
    }

    public Person(String nameP, String surnameP, int ageP){
        name = nameP;
        surname = surnameP;
        age = ageP;
    }

    public Person(String nameP, String surnameP, int ageP, String positionP){
        name = nameP;
        surname = surnameP;
        age = ageP;
        position = positionP;
    }

     */

    public String getFullData(){
        return "Person:\n\t" +
                "Name: " + name + ".\n\t" +
                "Surname: " + surname + ".\n\t" +
                "Age: " + age + ".\n\t" +
                "Position: " + position + ".\n\t" +
                "Address of the object is: " + this; // АДРЕС ОБЪЕКТ В ПАМЯТИ, ОТКУДА Я ВЫЗЫВАЮ
    }

    // OVERLOADING - ПЕРЕГРУЗКА
    // РАЗНЫЙ СПИСОК АРГУМЕНТОВ и ОЧЕРЕДНОСТЬ
    //
    public void getSetData(){
        System.out.println(name + " " + surname + ".");
    }

    // void getSetData() -> СИГНАТУРА
    public void getSetData(String personName, String personSurname){
        name = personName;
        surname = personSurname;

        System.out.println(name + " " + surname + ".");
    }

    public void getSetData(String personName, int age, String personSurname){
        name = personName;
        surname = personSurname;

        System.out.println(name + " " + surname + ". And your age is: " + age + ".");
    }

    public void calculate(double y, double x){}
    public void calculate(int y, int x){}
    public void calculate(double e, double y, double z){}
}