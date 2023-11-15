import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = "I dont give a fuck";
        String text1 = "bullshit";
        String text2 = "you are asshole";

        String Textmessage = text.replace("fuck", "fk");
        String Textmessage1 = text1.replace("bullshit","b****t");
        String Textmessage2 = text2.replace("asshole","as***le");

        System.out.println(Textmessage);
        System.out.println();
        System.out.println(Textmessage1);
        System.out.println();
        System.out.println(Textmessage2 + "." + Textmessage);
        System.out.println();
    }
}