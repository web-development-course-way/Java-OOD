import java.util.List;

public interface NotificationBuilder {
    Notification setTitle(String title);
    Notification setMessageBody(String messageBody);
    Notification setFrom(String from);
    Notification setTo(List<String> to);
    Notification setCc(List<String> cc);
    Notification setBcc(List<String> bcc);
    Notification setAttachments(List<String> attachments);

    Notification build();
}
class EmailBuilder implements NotificationBuilder {
    Email email;
    public EmailBuilder(String from, String to) {
        email = new Email(from, to);
    }
    public Notification setTitle(String title) {
        //
        return email.setTitle(title);
        //
    }
    public Notification setMessageBody(String messageBody) {
        return email.setMessageBody(messageBody);
    }
    public Notification setFrom(String from) {
        return email.setFrom(from);
    }
    public Notification setTo(List<String> to) {
        return email.setTo(to);
    }
    public Notification setCc(List<String> cc) {
        return email.setCc(cc);
    }
    public Notification setBcc(List<String> bcc) {
        return email.setBcc(bcc);
    }
    public Notification setAttachments(List<String> attachments) {
        return email.setAttachments(attachments);
    }
    public Notification build() {
        return email;
    }
}
class SMSBuilder implements NotificationBuilder {
    SMS sms;
    public SMSBuilder(String from, String to) {
        sms = new SMS(from, to);
    }
    public Notification setTitle(String title) {
        return sms.setTitle(title);
    }
    public Notification setMessageBody(String messageBody) {
        return sms.setMessageBody(messageBody);
    }
    public Notification setFrom(String from) {
        return sms.setFrom(from);
    }
    public Notification setTo(List<String> to) {
        return sms.setTo(to);
    }
    public Notification setCc(List<String> cc) {
        return sms.setCc(cc);
    }
    public Notification setBcc(List<String> bcc) {
        return sms.setBcc(bcc);
    }
    public Notification setAttachments(List<String> attachments) {
        return sms.setAttachments(attachments);
    }
    public SMS build() {
        return sms;
    }
}
