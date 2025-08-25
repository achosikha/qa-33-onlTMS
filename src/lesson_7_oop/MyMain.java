package lesson_7_oop;

import lesson_7_oop.incapsulation.StaffMember;
import lesson_7_oop.inheritance.Developer;
import lesson_7_oop.inheritance.StaffMB;
import lesson_7_oop.inheritance.Tester;

public class MyMain {
    public static void main(String[] args) {
        //
        createStaffList();
    }

    public static void createStaffList(){
        StaffMB[] swissSoft = new StaffMB[]{
                new Tester("Natalia", "Matus", 28, "Manual Tester"),
                new Developer("Anatoliy", "Ivanov", 30, "Java Developer"),
                new Developer("Vladimir", "Usikov", 31, "Python Developer"),
                new Developer("Sergey", "Smirnov", 35, "JS Developer"),
                new Tester("Oksana", "Novikova", 23, "C++ Embedded Tester")
        };

        for (StaffMB staffMember : swissSoft){
            System.out.println(staffMember);
            System.out.println(staffMember.getSchedule());
            System.out.println(staffMember.getTask());
            System.out.println("-".repeat(80));
        }
    }

    public static void createStaffMember(){
        StaffMember ksenya = new StaffMember("Ksenya", "Kaleichuk", 20, "Manual QA");

        // public String toString() -> return this; ПРЕВРАТИТ АДРЕС В СТРОЧКУ
        System.out.println(ksenya); // ADDRESS - this, return this;
        ksenya.setAge(26);
        System.out.println("-".repeat(50));
        System.out.println(ksenya);
        ksenya.setPosition("Q/A Automatization");
        System.out.println("-".repeat(50));
        System.out.println(ksenya);
        System.out.println("-".repeat(50));
        System.out.println("Object Ksenya, name is: " + ksenya.getName());
        System.out.println("Object Ksenya, surname is: " + ksenya.getSurname());
    }

    public static void createConstructorOverloadPerson(){
        Person natalya = new Person();
        Person archil = new Person("Archil");
        Person vasily = new Person("Vasily", "Ivanov");
        Person darya = new Person("Darya", "Maksimova", 26);
        Person james = new Person("James", "Webb", 30, "Teacher");

        System.out.println(natalya.getFullData());
        System.out.println("-".repeat(50));
        System.out.println(archil.getFullData());
        System.out.println("-".repeat(50));
        System.out.println(vasily.getFullData());
        System.out.println("-".repeat(50));
        System.out.println(darya.getFullData());
        System.out.println("-".repeat(50));
        System.out.println(james.getFullData());
        System.out.println("-".repeat(50));
    }

    public static void createPerson(){
        Person archil = new Person();
        archil.getSetData();
        archil.getSetData("Archil", "Sikharulidze");
        archil.getSetData("Archil", 36, "Sikharulidze");
    }
}
