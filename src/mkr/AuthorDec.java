package mkr;
public class AuthorDec extends MessageDec {

    public AuthorDec(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        return addAuthor(message.getText());
    }

    private String addAuthor(String text) {
        String author = "Автор: Андреєв Олександр";
        return text + " (" + author + ")";
    }
}