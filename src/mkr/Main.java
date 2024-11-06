import mkr.*;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("  Це   тестове         повідомлення  ");

        message = new CompressDec(message);
        System.out.println("Після стиснення: " + message.getText());

        message = new EncryptDec(message);
        System.out.println("Після шифрування: " + message.getText());

        message = new TimeAddDec(message);
        System.out.println("Після додавання дати і часу: " + message.getText());

        message = new AuthorDec(message);
        System.out.println("Після додавання автора: " + message.getText());
    }
}