
import jdk.jshell.execution.LocalExecutionControl;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Calculator calculator = new Calculator();


        int number1 = 45;
        int number2 = 12;
        int number3 = 14;
        int number4 = 18;
        int multiplyResult = calculator.multiply(number1, number2);
        {

        }


        String correctNumber = "540";
        String corretNumber1 = "";

        System.out.println();

        do {
            System.out.println("Сколько будет?: " + number4 + " * " + number2);
            System.out.println("Введите ответ:");
            String multiply = scanner.nextLine();


             System.out.println("Сколько будет?: " + number3 + " - " + number2);
             System.out.println("Введите ответ:");
            String divide = scanner.nextLine();


            corretNumber1 = scanner.next();
        } while(!corretNumber1.equals(correctNumber));

        System.out.println("uraaa!!!");

        while (!corretNumber1.equals(correctNumber));
    }

}