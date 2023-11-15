import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Converter tempC = new Converter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        tempC.convert(scanner.nextFloat());


    }
}
