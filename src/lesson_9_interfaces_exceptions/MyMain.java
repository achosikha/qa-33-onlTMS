package lesson_9_interfaces_exceptions;

import lesson_9_interfaces_exceptions.interf.Controller;
import lesson_9_interfaces_exceptions.interf.*;
import lesson_9_interfaces_exceptions.interver.ControllerNew;
import lesson_9_interfaces_exceptions.interver.TV;

public class MyMain {
    public static void main(String[] args) {
        // CODE
        createDifferentTypeInterfaces();
    }

    public static void createDifferentTypeInterfaces(){
        ControllerNew controller = new ControllerNew("Samsung");
        controller.turnOnTV();
        controller.getMSG();
        controller.getDefaultSpeed();
        System.out.println(TV.MESSAGE);
        System.out.println(TV.NAME);
        System.out.println(TV.SPEED);

        ControllerNew newController = controller.createClass("LG");
        newController.getMSG();
    }

    public static void createSamsungController(){
        ControllerUpdated samsungController = new SamsungController("Samsung");
        samsungController.pushAdditionalMethod("This is a Samsung Controller.");
    }

    public static void createInterfaceBasedInstance(){
        // ONLY METHODS FROM REMOTE TV
        RemoteTV remoteTV = new Controller("Archil");
        remoteTV.increaseVoice();

        // ONLY METHODS FROM REMOTE INTERNET
        RemoteInternet remoteInternet = new Controller("Vasily");
        remoteInternet.getInternetDescription();
    }

    public static void createController(){
        Controller controller = new Controller("Archil");

        // Controller extends RemoteTV, RemoteInternet where the same method turnOn();
        // Override turnOn() - is working
        // Controller controller = new Controller();
        // controller.turnOn() -> FAILURE
        // C++: controller.RemoteTV.turnOn() || controller.RemoteInternet.turnOn()
        controller.turnOnTV("Welcome");
        controller.turnOnInternet();
        System.out.println(controller.getInternetDescription());
        System.out.println("Your internet SPEED is:" + controller.getInternetSpeed(10));
    }
}