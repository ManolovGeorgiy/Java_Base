import java.util.Scanner;

public class MathQuiz {

    public static void start() {

        int number1 = 5;
        int number2 = 7;
         Calculator calculator = new Calculator();

        int addResult = calculator.add(number1, number2);
        int subtractResult = calculator.subtract(number1, number2);
        int multiplyResult = calculator.multiply(number1, number2);
        int divideResult = calculator.divide(number1, number2);

        int rightOrWrongAnswer = 0;
        //счёт
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        while (rightOrWrongAnswer != 13) {
            System.out.println("Skoliko budet? : " + (number1 + number2));
            rightOrWrongAnswer = scanner.nextInt();

            if (rightOrWrongAnswer == 4) {
                System.out.println("У вас вычли 5 очков");
                score = score - 5;
            }

            if (rightOrWrongAnswer == 7) {
                System.out.println("Вам зачли 5 очков");
                score = score + 5;



            }
        }

        System.out.println("Ваше количество очков равно: " + score);
    }
}