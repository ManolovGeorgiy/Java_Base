public class Flower {
    public String color = "";
    public int length;
    public String name = "";

    //конструктор по умолчанию.
    Flower() {

    }

    //конструктор с одним аргументом.
    public Flower(String flowerColor) {
        color = flowerColor;
    }

    //конструктор с двумя аргументами.
    public Flower(String flowerColor, int flowerLength) {
        color = flowerColor;
        length = flowerLength;
    }

    //конструктор с тремя аргументами.
    public Flower(String flowerName, String flowerColor, int flowerLength) {
        name = flowerName;
        color = flowerColor;
        length = flowerLength;
    }
}