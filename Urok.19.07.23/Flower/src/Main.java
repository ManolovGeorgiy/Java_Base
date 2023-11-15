public class Main {
    public static void main(String...args) {

        Flower rose = new Flower("rose", "red", 70);
        Flower violet = new Flower("violet","violet", 185);
        Flower pione = new Flower( "pione", "yellow", 100);

        System.out.println("Rose name is: " + rose.name);
        System.out.println("Rose color is: " + rose.color);
        System.out.println("Rose length is: " + rose.length);
        System.out.println();

        System.out.println("Violet name is: " + violet.name);
        System.out.println("Violet color is: " + violet.color);
        System.out.println("Violet length is: " + violet.length);
        System.out.println();

        System.out.println("Pione name is: " + pione.name);
        System.out.println("Pione color is: " + pione.color);
        System.out.println("Pione length is: " + pione.length);
        System.out.println();

    }
}