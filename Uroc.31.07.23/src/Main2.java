import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corretAnswer = "Georgiy";
        String userAnswer ="";

        while (!userAnswer.equals(corretAnswer)) {
            System.out.println("Kak menia zovut?...");
            userAnswer = scanner.next();
        }
        System.out.println(("ura!!! vi nazvali pravilino imia!!!"));
    }
}