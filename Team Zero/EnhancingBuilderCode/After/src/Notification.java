import java.util.ArrayList;
import java.util.List;
public abstract class Notification {
    protected String title;
    protected String messageBody;
    protected String from;
    protected List<String> to;
    protected List<String> cc;
    protected List<String> bcc;
    protected List<String> attachments;

    abstract Notification setTitle(String title);
    abstract Notification setMessageBody(String messageBody);
    abstract Notification setFrom(String from);
    abstract Notification setTo(List<String> to);
    abstract Notification setCc(List<String> cc);
    abstract Notification setBcc(List<String> bcc);
    abstract Notification setAttachments(List<String> attachments);

}

class Email extends Notification {
    public Email(String from, String to) {
        this.from = from;
        this.to = new ArrayList<String>();
        this.to.add(to);
    }

    public Notification setTitle(String title) {
        this.title = title;
        return this;
    }

    public Notification setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    public Notification setFrom(String from) {
        this.from = from;
        return this;
    }

    public Notification setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public Notification setCc(List<String> cc) {
        this.cc = cc;
        return this;
    }

    public Notification setBcc(List<String> bcc) {
        this.bcc = bcc;
        return this;
    }

    public Notification setAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
    }

    /////////// Add below unique methods to this concrete subclass ////////////////

    public String toString() {
        return String.format("Email sent from: %s, to: %s, with title: %s", from, to, title);
    }
}

class SMS extends Notification {
    public SMS(String from, String to) {
        this.from = from;
        this.to = new ArrayList<String>();
        this.to.add(to);
    }

    public Notification setTitle(String title) {
        this.title = title;
        return this;
    }

    public Notification setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    public Notification setFrom(String from) {
        this.from = from;
        return this;
    }

    public Notification setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public Notification setCc(List<String> cc) {
        this.cc = cc;
        return this;
    }

    public Notification setBcc(List<String> bcc) {
        this.bcc = bcc;
        return this;
    }

    public Notification setAttachments(List<String> attachments) {
        this.attachments = attachments;
        return this;
    }

    /////////// Add below unique methods to this concrete subclass ////////////////

    public String toString() {
        return String.format("SMS sent from: %s, to: %s, with title: %s", from, to, title);
    }
}

