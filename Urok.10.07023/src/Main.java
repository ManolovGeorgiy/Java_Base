public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // переменая типа название "String"
        String stringBox = "Hello";
        // переменая типа число "int";
        int intBox = 10;
        System.out.println(intBox + 10);

        Toy toyBox = new Toy();

        System.out.println(toyBox.nameOfTheToy);
        System.out.println("Количество рук:" + toyBox.numberOfHands);
        System.out.println("Количество ног:" + toyBox.numberOfLegs);
        System.out.println("Цена:" + toyBox.price);

        Toy toyBox2 = new Toy();

        toyBox2.nameOfTheToy = "Lighter Bzz";
        toyBox2.price = 2000;

        System.out.println(toyBox2.nameOfTheToy);
        System.out.println("Количество рук:" + toyBox2.numberOfHands);
        System.out.println("Количество ног:" + toyBox2.numberOfLegs);
        System.out.println("Цена:" + toyBox2.price);

    }
}