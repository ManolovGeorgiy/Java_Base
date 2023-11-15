public class Main {
    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 10;

        //1
        //false 0
        //true 1
        boolean isOneNumberHigherThanTheOther = number1 > number2;
        System.out.println(isOneNumberHigherThanTheOther);

        boolean isNumEqualToAnotherNum = number1 == number2;
        System.out.println(isNumEqualToAnotherNum);

        boolean isLessThan = number1 < number2;
        System.out.println(isLessThan);

        boolean notEquals = number1 != number2;
        System.out.println(notEquals);

        boolean isLessOrEquals = number1 <= number2;
        System.out.println(isLessOrEquals);

        boolean isGreaterOrEquals = number1 >= number2;
        System.out.println(isGreaterOrEquals);
    }
}