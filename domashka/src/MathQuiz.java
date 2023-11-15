import java.util.Random;
import java.util.Scanner;

class MathQuiz {

    private static final int NUM_QUESTIONS = 6;
    private static final int MAX_POINTS = 5;
    private int score;
    private Random random;
    private Scanner scanner;
    public MathQuiz() {



       Scanner scanner = new Scanner(System.in);
    }

    public void start() {
        score = 0;
        askQuestion1();
        askQuestion2();
        askQuestion3();
        askQuestion4();
        askQuestion5();
        askQuestion6();
        printFinalScore();


    }

    private void askQuestion1() {
        int num1, num2, correctAnswer, userAnswer;
        int attempts = 1; // Ограничение на количество попыток


        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        correctAnswer = num1 + num2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Первое число: " + num1);
            System.out.println("Второе число: " + num2);
            System.out.print("Введите сумму из этих чисел : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Вы дали правильный ответ и заработали " + MAX_POINTS + " баллов");
                score += MAX_POINTS;
                break; // Правильный ответ, выходим из цикла
            } else {
                System.out.println("Вы дали не правильный ответ и заработали " + (-MAX_POINTS) + " баллов");
                score -= MAX_POINTS;
            }
        }
    }

    private void askQuestion2() {
        int num1, num2, correctAnswer, userAnswer;
        int attempts = 1; // Ограничение на количество попыток

        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        correctAnswer = num1 * num2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Первое число: " + num1);
            System.out.println("Второе число: " + num2);
            System.out.print("Введите результат умножения этих чисел : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Вы дали правильный ответ и заработали " + MAX_POINTS + " баллов");
                score += MAX_POINTS;
                break; // Правильный ответ, выходим из цикла
            } else {
                System.out.println("Вы дали не правильный ответи заработали " + (-MAX_POINTS) + " баллов");
                score -= MAX_POINTS;
            }
        }
    }
    private void askQuestion3() {
        int num1, num2, correctAnswer, userAnswer;
        int attempts = 1; // Ограничение на количество попыток

        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        correctAnswer = num1 - num2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Первое число: " + num1);
            System.out.println("Второе число: " + num2);
            System.out.print("Введите результат вычитания этих чисел : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Вы дали правильный ответ и заработали " + MAX_POINTS + " баллов");
                score += MAX_POINTS;
                break; // Правильный ответ, выходим из цикла
            } else {
                System.out.println("Вы дали не правильный ответи заработали " + (-MAX_POINTS) + " баллов");
                score -= MAX_POINTS;
            }
        }

    }

    private void askQuestion4() {
        int num1, num2, correctAnswer, userAnswer;
        int attempts = 1; // Ограничение на количество попыток

        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        correctAnswer = num1 / num2;
        for (int i = 0; i < attempts; i++) {
            System.out.println("Первое число: " + num1);
            System.out.println("Второе число: " + num2);
            System.out.print("Введите результат деления этих чисел : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Вы дали правильный ответ и заработали " + MAX_POINTS + " баллов");
                score += MAX_POINTS;
                break; // Правильный ответ, выходим из цикла
            } else {
                System.out.println("Вы дали не правильный ответ и заработали " + (-MAX_POINTS) + " баллов");
                score -= MAX_POINTS;
            }
        }

    }
    private void askQuestion5() {
        int num1, num2, correctAnswer, userAnswer;
        int attempts = 1; // Ограничение на количество попыток

        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        correctAnswer = num1 + num2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Первое число: " + num1);
            System.out.println("Второе число: " + num2);
            System.out.print("Введите сумму из этих чисел : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Вы дали правильный ответ и заработали " + MAX_POINTS + " баллов");
                score += MAX_POINTS;
                break; // Правильный ответ, выходим из цикла
            } else {
                System.out.println("Вы дали не правильный ответ и заработали " + (-MAX_POINTS) + " баллов");
                score -= MAX_POINTS;
            }
        }
    }
    private void askQuestion6() {
        int num1, num2, correctAnswer, userAnswer;
        int attempts = 1; // Ограничение на количество попыток

        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        correctAnswer = num1 * num2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Первое число: " + num1);
            System.out.println("Второе число: " + num2);
            System.out.print("Введите произведение этих чисел : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Вы дали правильный ответ и заработали " + MAX_POINTS + " баллов");
                score += MAX_POINTS;
                break; // Правильный ответ, выходим из цикла
            } else {
                System.out.println("Вы дали не правильный ответ и заработали " + (-MAX_POINTS) + " баллов");
                score -= MAX_POINTS;
            }
        }
    }

    public void printFinalScore() {
        System.out.println("Ура! Опросник завершён! Вы победили! Ваш финальный счёт: " + score);
        System.exit(0); // Добавляем эту строку для завершения программы
    }
}