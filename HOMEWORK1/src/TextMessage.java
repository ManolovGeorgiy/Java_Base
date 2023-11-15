public class TextMessage {

    public String censoredTextMessage ="";


    public TextMessage(String textMessage) {
        this.censoredTextMessage = textMessage.replace("fuck","fk").replace("bullshit" , "b****t");

    }
}
