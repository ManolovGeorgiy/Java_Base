import java.util.Scanner;

// maternie

public class Main {
    public static void main(String[] args) {
        //metod
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a text message :");

        //     peremenaia
        String textMessage = scanner.nextLine();

        TextMessage censoredTextMessage = new TextMessage(textMessage);

        System.out.println(censoredTextMessage.censoredTextMessage);
    }
}