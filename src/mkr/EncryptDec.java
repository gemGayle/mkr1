package mkr;

public class EncryptDec extends MessageDec {

    public EncryptDec(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        return reverseText(message.getText());
    }

    private String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

