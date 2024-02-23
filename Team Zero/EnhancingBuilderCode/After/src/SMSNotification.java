import java.util.ArrayList;
import java.util.List;
public class SMSNotification {
    private String title;
    private String messageBody;
    private String from;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private List<String> attachments;

    public SMSNotification(String from, String to) {
        this.from = from;
        this.to = new ArrayList<String>();
        this.to.add(to);
    }

    public SMSNotification setTitle(String title) {
        this.title = title;
        return this;
    }

    public SMSNotification setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    public SMSNotification setFrom(String from) {
        this.from = from;
        return this;
    }

    public SMSNotification setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public SMSNotification setCc(List<String> cc) {
        this.cc = cc;
        return this;
    }

    public SMSNotification setBcc(List<String> bcc) {
        this.bcc = bcc;
        return this;
    }

    public SMSNotification setAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
    }

    public String toString() {
        return String.format("SMS sent from: %s, to: %s, with title: %s", from, to, title);
    }
}