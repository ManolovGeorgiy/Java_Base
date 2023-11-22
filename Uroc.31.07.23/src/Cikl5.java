import java.util.Scanner;

public class Cikl5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pravilinii
        String corretAnswer = "Georgiy";
        // polisovateliskii
        String userAnswer ="";


        do {
            System.out.println("Введите имя:");
            userAnswer = scanner.next();
        } while(!userAnswer.equals(corretAnswer));

        System.out.println("uraaa!!!");

        while (!userAnswer.equals(corretAnswer));
    }

    }