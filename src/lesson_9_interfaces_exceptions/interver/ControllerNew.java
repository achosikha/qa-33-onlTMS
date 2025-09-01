package lesson_9_interfaces_exceptions.interver;

public class ControllerNew implements TV, CreateClass, Cloneable, MarkFinal{
    // Cloneable говорит компилятору, что заблокированный функционал клонирования объекта ОТКРОЙ
    private final String name;

    public ControllerNew(String name){
        this.name = name;
    }

    @Override
    public void turnOnTV() {
        System.out.println("YOUR TV IS WORKING!");
    }

    @Override
    public void getDefaultSpeed() {
        System.out.println("THIS IS AN UPDATED DEFAULT SPEED METHOD REALIZATION!");
    }

    @Override
    public String toString() {
        return "Controller: \n\t" +
                "Name: " + this.name;
    }

    @Override
    public ControllerNew createClass(String className) {
        return new ControllerNew(className);
    }
}