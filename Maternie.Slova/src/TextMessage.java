public class TextMessage {



    public String G1 = "";
    public String G2 = "";
    public String G3 = "";

    public TextMessage(String message) {


       G1 = message.replace("Fuck","fk").replace("bullshit","bu***t").replace("asshole","ass***le");
       System.out.println(G1);


    }

}
