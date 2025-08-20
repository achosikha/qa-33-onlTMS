package lesson_6_methods_oop.classes;

public class ZooAnimal {
    public String name;
    public String type;
    public String color;
    public int weight;

    // Constructor - конструктор
    // Это специальный метод, который позволяет при создании экземпляра класса задавать значения
    public ZooAnimal(String animalName, String animalType, String animalColor, int animalWeight){
        name = animalName;
        type = animalType;
        color = animalColor;
        weight = animalWeight;
    }

    public String getAnimalData(){
        return "Animal data:\n\t" +
                "Animal name: " + name + "\n\t" +
                "Animal type: " + type + "\n\t" +
                "Animal color: " + color + "\n\t" +
                "Animal weight: " + weight;
    }
}