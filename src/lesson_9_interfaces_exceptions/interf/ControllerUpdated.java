package lesson_9_interfaces_exceptions.interf;

public abstract class ControllerUpdated implements RemoteTV, RemoteInternet{
    private final String name;

    public ControllerUpdated(String name){
        this.name = name;
    }

    // ABSTRACT METHOD FROM CLASS CONTROLLER UPDATED with PARAMETER STRING NAME
    public abstract void pushAdditionalMethod(String name);

    @Override
    public String toString() {
        return "Controller updated: \n\t" +
                "Name: " + this.name;
    }
}