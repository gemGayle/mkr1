package mkr;

public abstract class MessageDec implements Message {
    protected Message message;

    public MessageDec(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return message.getText();
    }
}
