package lesson_7_oop.inheritance;

public class Tester extends StaffMB{
    // Если я хочу, чтобы дочерний класс мог изменить поведение определенных методов из супер-класса
    // Я должен прибегнут к ПОЛИМОРФИЗМУ
    public Tester(String name, String surname, int age, String position) {
        super(name, surname, age, position);
    }

    @Override
    public String getSchedule() {
        return super.getName() + " " + super.getSurname() + " is a " + this.getClass().getSimpleName() + ".\n" +
                "Her/his schedule is from Thursday to Sunday, 17:00 - 23.00";
    }

    @Override
    public String getTask() {
        return super.getName() + " " + super.getSurname() + " is a " + this.getClass().getSimpleName() + ".\n" +
                "Her/his task is to test new software or modules provided by DEVELOPERS.";
    }
}
