import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Скажи что нибудь:");
        String G1 = scanner.next();
        TextMessage textMessage1 = new TextMessage(G1);

        System.out.print("Скажи что нибудь:");
        String G2 = scanner.next();
        TextMessage textMessage2 = new TextMessage(G2);

        System.out.print("Скажи что нибудь:");
        String G3 = scanner.next();
        TextMessage textMessage3 = new TextMessage(G3);




    }
}