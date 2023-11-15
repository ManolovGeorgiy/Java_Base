import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        int number1 = (20) + 1;
        int number2 = (2) + 1;





            System.out.println("Сколь будет?: " + number1 + "-" + number2);
            System.out.println("Введите ответ:");
            number1 = scanner.nextInt();


            String guess; //сравнение введеного ответа
        if (number1 == number1 + number2) {
                guess = "Отлично! Вы заработали 5 очко." + (number1 + number2);
            System.out.println(guess);
            } else {
            guess = "Вы ошиблись! Правильный ответ: " + (number1 - number2);}
                {
                    System.out.println(guess);
                    int sc = 0;
                    if (number1 == number1 + number2) {
                        sc = sc + 5;
                    } else {
                        sc = sc - 5;}
                    {

                        System.out.println("Ваш счёт " + sc + ".");

                    }
                }
            }
        }


