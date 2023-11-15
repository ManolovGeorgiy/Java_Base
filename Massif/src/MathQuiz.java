import java.util.Random;
import java.util.Scanner;

class MathQuiz {
    public static final int  = 6;
    public static final int MAX_POINTS = 5;
    public Random random = new Random();
    public Scanner scanner = new Scanner(System.in);

    public MathQuiz() {

    }
    public void start() {
        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        int[] scores = new int[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            scores[i] = playGame(i + 1);
        }

        for (int i = 0; i < numPlayers; i++) {
            printFinalScore(i + 1, scores[i]);
        }
    }

    public int playGame(int playerNumber) {
        System.out.println("\n Игрок " + playerNumber);
        int score = 0;

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            score += askQuestion();
        }

        return score;
    }

    private int askQuestion() {
        int num1, num2, correctAnswer, userAnswer, operator;
        int attempts = 1;
        int questionScore = 0;

        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        operator = random.nextInt(4);

        switch (operator) {
            case 0:
                correctAnswer = num1 - num2;
                break;
            case 1:
                correctAnswer = num1 + num2;
                break;
            case 2:
                correctAnswer = num1 / num2;
                break;
            case 3:
                correctAnswer = num1 * num2;
                break;
            case 4:
                correctAnswer = num1 - num2;
                break;
            case 5:
                correctAnswer = num1 + num2;
                break;
            default:
                throw new IllegalStateException("Некорректный оператор");
        }

        for (int i = 0; i < attempts; i++) {
            System.out.println("Первое число: " + num1);
            System.out.println("Второе число: " + num2);

            if (operator == 0) {
                System.out.print("Введите результат вычитания этих чисел: ");
            } else if (operator == 1) {
                System.out.print("Введите сумму из этих чисел: ");
            } else if (operator == 2) {
                System.out.print("Введите результат деления этих чисел: ");
            } else if (operator == 3) {
                System.out.print("Введите произведение этих чисел: ");
            }   else if (operator == 4) {
                System.out.print("Введите результат вычитания этих чисел: ");
            } else if (operator == 5) {
                System.out.print("Введите сумму из этих чисел: ");
            }
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Вы дали правильный ответ и заработали " + MAX_POINTS + " баллов");
                questionScore += MAX_POINTS;
                break;
            } else {
                System.out.println("Вы дали неправильный ответ и заработали " + (-MAX_POINTS) + " баллов");
                questionScore -= MAX_POINTS;
            }
        }

        return questionScore;
    }

    public void printFinalScore(int playerNumber, int score) {
        System.out.println("Игрок " + playerNumber + ", ваш финальный счет: " + score);
    }


}