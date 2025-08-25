package lesson_7_oop.incapsulation;

public class StaffMember {
    // Три принципа ООП
    // 1. Инкапсуляция - или банально, скрытие данных класса
    // Никакой ОБЪЕКТ не должен иметь возможность получать прямой доступ к внутренностям другого класса
    // Т.е. извне мы не должны знать какие у меня поля в другом классе и мы не должны иметь возможность с ними
    // напрямую работать
    // ACCESS MODIFIERS - МОДИФИКАТОРЫ ДОСТУПА
    // 1. Публичный - доступно всем везде и откуда угодно - public
    // 2. Закрытый/частный - доступно ТОЛЬКО ВНУТРИ САМОГО КЛАССА - private - ВСЕ ПОЛЯ ДОЛЖНЫ БЫТЬ PRIVATE
    // 3. ИСКЛЮЧЕНИЕ ДЛЯ ПОЛЕЙ КЛАССА ЕСЛИ ЕСТЬ НАСЛЕДОВАНИЕ, тогда protected - это класс (package), и его дочерние классы
    // т.е. если у нас Животное и от него наследуется КОШКА, то protected позволить КОШКЕ иметь прямой доступ к полю
    // 4. Дефолтный модификатор доступа - package-private - уровень ПАКЕТ

    // 5. НАСЛЕДОВАНИЕ
    // Наследование - это ИЕРАРХИЯ ВАШИХ КЛАССОВ, КОГДА СУПЕР КЛАСС ПЕРЕДАЕТ СВОЙ ХАРАКТЕРИСТИКИ ДОЧЕРНЕМУ
    // НАСЛЕДОВАНИЕ - это отношения типа -is a, является
    // Например, StaffMember -> Developers, Testers
    private String name;
    private String surname;
    private int age;
    private String position;

    public StaffMember(){this("Unknown", "Unknown", 0, "Unknown");}
    public StaffMember(String name){this(name, "Unknown", 0, "Unknown");}
    public StaffMember(String name, String surname){this(name, surname, 0, "Unknown");}
    public StaffMember(String name, String surname, int age){this(name, surname, age, "Unknown");}
    public StaffMember(String name, String surname, int age, String position){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    // ПОСРЕДНИК МЕЖДУ ПЕРЕМЕННОЙ КЛАССА И ДРУГИМИ КЛАССАМИ ЭТО СЕТТЕРЫ И ГЕТТЕРЫ
    // SET - если у нас есть переменные которым надо что-то задать, мы создаем СЕТТЕР
    // Метод, который публичный и меняем значение поля
    public void setAge(int age){
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // GETTER - Берет значение из поля класса
    public String getName(){
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    // ПЕРЕОПРЕДЕЛЕНИЕ - ЭТО ПОЛИМОРФИЗМ
    // @Override - Аннотация - когда мы занимаемся полиморфизмом, всегда надо сказать компилятору
    // ПРОВЕРЬ, ВДРУГ Я ОШИБСЯ, И ТАКОГО МЕТОДА ВООБЩЕ НЕТУ.
    // Метод: public String toString() - ЕСТЬ У ВСЕХ КЛАССОВ
    // Мы используем принцип ПЕРЕОПРЕДЕЛЕНИЯ, ЧТОБЫ СКАЗАТЬ КОМПИЛЯТОРУ
    // ВОЗЬМИ НАШ СТАНДАРТНЫЙ toString() и ЗАМЕНИ ЕГО НА МОЮ ВЕРСИЮ
    @Override
    public String toString() {
        return "Staff member:\n\t" +
                "Name: " + this.name + ".\n\t" +
                "Surname: " + this.surname + ".\n\t" +
                "Age: " + this.age + ".\n\t" +
                "Position: " + this.position + ".";
    }
}
