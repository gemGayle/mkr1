package mkr;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeAddDec extends MessageDec {

    public TimeAddDec(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        return addTimestamp(message.getText());
    }

    private String addTimestamp(String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);
        return "[" + timestamp + "] " + text;
    }
}
