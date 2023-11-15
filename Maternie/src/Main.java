import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение:");
        String nameOfMessage = scanner.nextLine();
        String text =  ("fuck");
        String TextMessage = text.replace("fuck", "fk");
        System.out.println(TextMessage);
        System.out.println();


        System.out.print("Введите сообщение:");
        String nameOfMessage1 = scanner.nextLine();
        String text1 =  ("bullshit");
        String TextMessage1 = text1.replace("bullshit","b****t");
        System.out.println(TextMessage1);
        System.out.println();

        System.out.print("Введите сообщение:");
        String nameOfMessage2 = scanner.nextLine();
        String text2 =  ("asshole");
        String TextMessage2 = text2.replace("asshole","as***le");
        System.out.println(TextMessage2 + ".");
        System.out.println();
    }
}