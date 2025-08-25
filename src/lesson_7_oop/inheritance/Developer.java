package lesson_7_oop.inheritance;

public class Developer extends StaffMB{
    public Developer(String name, String surname, int age, String position) {
        // super - обратись к моему супер-классу, ВСЕГДА ПЕРВАЯ СТРОЧКА, потом остальное
        super(name, surname, age, position);
    }

    // Ключевое слово extends - ТОЛЬКО ДЛЯ НАСЛЕДОВАНИЯ
    // ОДИН ИНТЕРФЕЙС - МНОЖЕСТВЕНОЕ РЕАЛИЗАЦИЯ
    @Override
    public String getSchedule() {
        return super.getName() + " " + super.getSurname() + " is a " + this.getClass().getSimpleName() + ".\n" +
                "Her/his schedule is from Monday to Friday, 09:00 - 18.00";
    }

    @Override
    public String getTask() {
        return super.getName() + " " + super.getSurname() + " is a " + this.getClass().getSimpleName() + ".\n" +
                "Her/his task is to create and develop new software.";
    }
}