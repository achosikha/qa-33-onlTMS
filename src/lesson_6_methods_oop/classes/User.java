package lesson_6_methods_oop.classes;

// Object - HUMAN
// Class - blueprint of the Human
// Когда вы создаете Класс - вы должны хорошо подумать о том, что в него следует вложить
// Класс - это общий чертеж/шаблон идеи ЧЕЛОВЕКА
// Следовательно, в него надо вставить то, ЧТО МОЖЕТ ОБЪЕДИНЯТЬ ВСЕХ ЛЮДЕЙ
public class User {
    // В Джаве нет глобальных переменных
    // Но, если переменные УРОВНЯ КЛАСС - полями класса
    // В Джаве нет функций, поскольку они за пределами объектов
    // Но есть методы - это свойства объекты/его глаголы, действия
    // ВСЕ ПОЛЯ КЛАССА, не имеет значения примитивные или же ссылочные, получат автоматом
    // ДЕФОЛТНЫЕ ЗНАЧЕНИЯ !!!
    public String name; // null
    public String surname; // null
    public long id; // 0L
    public String sex; // null
    public String dateOfBirth; // null
    public int age; // 0
    public long contactNumber; // 0L

    public String checkAgeStatus(int myAge){
        if (age > myAge){
            return "Passed age value is lower then " + name + "'s age.";
        } else if (age == myAge){
            return name + "'s age and your passed age value are equal.";
        } else if (age < myAge){
            return name + "'s age is lower then age value passed by you.";
        }

        return "You have entered a WRONG VALUE!";
    }

    public String getFullData(){
        return "User data:\n\t" +
                "User name: " + name + "\n\t" +
                "User surname: " + surname + "\n\t" +
                "User id: " + id + "\n\t" +
                "User sex: " + sex  + "\n\t" +
                "User date of birth: " + dateOfBirth  + "\n\t" +
                "User age: " + age  + "\n\t" +
                "User contact number: " + contactNumber;
    }
}