package lesson_9_interfaces_exceptions.interf;

// OOP 5: encapsulation, polymorphism, inheritance + ABSTRACTION
public class Controller implements RemoteTV, RemoteInternet{
    private Controller(){
        System.out.println("This is a PRIVATE CONSTRUCTOR...");
    }

    public Controller(String name){
        this();
    }

    @Override
    public void turnOnInternet() {
        System.out.println("Your internet in TURNED ON.");
    }

    @Override
    public int getInternetSpeed(int speed) {
        return 5;
    }

    @Override
    public String getInternetDescription() {
        return "MAGTI TELECOM TBILISI, GEORGIA";
    }

    @Override
    public void turnOnTV(String msg) {
        System.out.println("Your TV is TURNED ON: " + msg);
    }

    @Override
    public void turnOffTV() {
        System.out.println("Your TV is TURNED OFF.");
    }

    @Override
    public String increaseVoice() {
        return "YOU HAVE INCREASED VOICE BY +1";
    }

    @Override
    public String decreaseVoice() {
        return "YOU HAVE DECREASED VOICE BY -1";
    }

    @Override
    public String channelUp() {
        return "YOU HAVE CHANNELED UP!";
    }

    @Override
    public String channelDown() {
        return "YOU HAVE CHANNELED DOWN!";
    }
}