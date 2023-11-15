import java.util.Scanner;

public class MathQuiz {
    public static void start(){

    }
    Scanner scanner = new Scanner(System.in);
    public String lessonMathQuiz = "Start";

    int number1 = 20;
    int number2 = 2;
    Calculator calculator = new Calculator();

    int addResult = calculator.add(number1, number2);
    int subtractResult = calculator.subtract(number1, number2);
    int multiplyResult = calculator.multiply(number1, number2);
    int divideResult = calculator.divide(number1, number2);


    int NumNumber1 = 0;
    int NumNumber2 = 0;

    int sc = 0;

    {


        System.out.println("Сколь будет?: " + addResult + "-" + divideResult);
        System.out.println("Введите ответ:");
        NumNumber2 = scanner.nextInt();

        String guess; //сравнение введеного ответа
        if (number1 == 12) {
            guess = ("Отлично! Вы заработали 5 очко.");
            System.out.println(guess);


        } else {
            guess = ("Вы ошиблись! Правильный ответ: ");

        }
        {
            System.out.println(guess);
            if (number1 == number1 + number2) {
                sc = sc + 5;
            } else {
                sc = sc - 5;
            }
            {

                System.out.println("Ваш счёт " + sc + ".");


            }
        }
    }
}