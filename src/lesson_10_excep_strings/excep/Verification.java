package lesson_10_excep_strings.excep;

// Нужно создать свое собственное исключение !!!
// В нашем случае, мы хотим сделать проверку ПАРОЛЯ
// Если пароль правильный - ВАША ВЕРИФИКАЦИЯ ПРОШЛА УСПЕШНА!
// Если пароль неправильный - ВАША ВЕРИФИКАЦИЯ НЕ ПОДТВЕРЖДЕНА!
public class Verification extends Exception{
    private final String password = "tr_3%1_&*!";

    public Verification(){
        super();
    }

    public Verification(String message){
        super(message);
    }

    public String getPassword() {
        return password;
    }
}