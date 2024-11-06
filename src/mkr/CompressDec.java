package mkr;

public class CompressDec extends MessageDec {

    public CompressDec(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        return compress(message.getText());
    }

    private String compress(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
