package lesson_7_oop.inheritance;

public class StaffMB {
    // Второй принцип ООП - НАСЛЕДОВАНИЕ, INHERITANCE
    // В ДЖАВА НЕ СУЩЕСТВУЕТ МНОЖЕСТВЕННОГО НАСЛЕДОВАНИЯ, у одного класса может быть только один прямой СУПЕР-КЛАСС
    // Наследование - это ИЕРАРХИЯ ВАШИХ КЛАССОВ, КОГДА СУПЕР КЛАСС ПЕРЕДАЕТ СВОЙ ХАРАКТЕРИСТИКИ ДОЧЕРНЕМУ
    // НАСЛЕДОВАНИЕ - это отношения типа -is a, является
    // Например, StaffMember -> Developers, Testers
    private String name;
    private String surname;
    private int age;
    private String position;

    public StaffMB(String name, String surname, int age, String position){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    public String getSchedule(){
        return this.getClass().getSimpleName() + " class uses general method getSchedule from StaffMB super class.";
    }

    public String getTask(){
        return this.getClass().getSimpleName() + " class uses general method getTask from StaffMB super class.";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Staff member:\n\t" +
                "Name: " + this.name + ".\n\t" +
                "Surname: " + this.surname + ".\n\t" +
                "Age: " + this.age + ".\n\t" +
                "Position: " + this.position + ".\n\t" +
                "Class returned: " + this.getClass().getSimpleName();
    }
}