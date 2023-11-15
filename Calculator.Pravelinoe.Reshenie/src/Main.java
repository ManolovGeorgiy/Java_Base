import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Здраствуйте!Случайно ви участвуете в quiz'е по операции сложения");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // ответПользователя
        int userAnswer = 0;
        // правельнийОтвет
        int correctAnswer = 1;

        while (userAnswer != correctAnswer) {
            //случайноеЧисло1
            int randomNumber1 = random.nextInt(100)+1;
            //случайноеЧисло2
            int randomNumber2 = random.nextInt(100)+1;

            correctAnswer = Calculator.add(randomNumber1, randomNumber2);
            System.out.print("polzovatel,pojaluista,daite otvet na virajenie" + randomNumber1 + "+" + randomNumber2 + ":");
            userAnswer = scanner.nextInt();
            System.out.println("Ваш ответ:" + userAnswer + "Правельний ответ:" + correctAnswer);

        }
        System.out.println("ura!Vi molodec! pravilino otvetili na vopros i teperi mojete perestati otvechati na nih!");
    }

}