import java.util.Random;
// calculator
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(100) +1;
        int number2 = random.nextInt(100) +1;

        System.out.println("Первое сгенерираваное число:" + number1);
        System.out.println("Второе сгенерированое число:" + number2);


        Calculator calculator = new Calculator();
        int addResult = calculator.add(number1, number2);
        int subtractResult = calculator.subtract(number1, number2);
        int multiplyResult = calculator.multiply(number1, number2);
        int divideResult = calculator.divide(number1, number2);

        System.out.println("+:" + addResult);
        System.out.println("-:" + subtractResult);
        System.out.println("/:" + divideResult);
        System.out.println("*:" + multiplyResult);






    }
}