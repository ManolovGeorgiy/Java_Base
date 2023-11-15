public class TextMessage {
    public String word1 = "";
    public String word2 = "";
    public String word3 = "";





    public TextMessage(String message) {

        word1 = message.replace("fuck", "fk ").replace("bullshit", "bu***t ").replace("asshole", "as***le ");
        System.out.println(word1);




    }

}