package lesson_9_interfaces_exceptions.interf;

// public interface - public class
public interface RemoteTV {
    // В КЛАССИЧЕСКОМ СТИЛЕ !!!
    // Все МЕТОДЫ интерфейса автоматически являются ПУБЛИЧНЫМИ и АБСТРАКТНЫМИ
    void turnOnTV(String message);
    void turnOffTV();
    String increaseVoice();
    String decreaseVoice();
    String channelUp();
    String channelDown();
}