package lesson_9_interfaces_exceptions.interf;

public class SamsungController extends ControllerUpdated{
    public SamsungController(String name) {
        super(name);
    }

    @Override
    public void pushAdditionalMethod(String name) {
        System.out.println("Inherited from SUPER CLASS ControllerUpdated: " + name);
    }

    @Override
    public void turnOnInternet() {

    }

    @Override
    public int getInternetSpeed(int speed) {
        return 0;
    }

    @Override
    public String getInternetDescription() {
        return "";
    }

    @Override
    public void turnOnTV(String message) {

    }

    @Override
    public void turnOffTV() {

    }

    @Override
    public String increaseVoice() {
        return "";
    }

    @Override
    public String decreaseVoice() {
        return "";
    }

    @Override
    public String channelUp() {
        return "";
    }

    @Override
    public String channelDown() {
        return "";
    }
}
