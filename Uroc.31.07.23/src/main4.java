import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corretAnswer = "Georgiy";
        String userAnswer ="";
        boolean isUserInputCorrect = false;
        //                              equals > сравнение
        isUserInputCorrect = userAnswer.equals(corretAnswer);

        while (!isUserInputCorrect){
            System.out.print("kak menia zovut?....");
            userAnswer = scanner.next();

            isUserInputCorrect =userAnswer.equals(corretAnswer);
        }

        System.out.println("ura!!! vi nazvali pravilino imia!!!");
    }
}