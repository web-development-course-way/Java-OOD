import java.util.ArrayList;
import java.util.List;

public class EmailNotification {
    private String title;
    private String messageBody;
    private String from;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private List<String> attachments;

    private EmailNotification(String title, String messageBody, String from, List<String> to, List<String> cc, List<String> bcc, List<String> attachments) {
        this.title = title;
        this.messageBody = messageBody;
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.attachments = attachments;
    }


    public String toString() {
        return String.format("Email sent from: %s, to: %s, with title: %s", from, to, title);
    }

    public static class EmailNotificationBuilder {
        private String title;
        private String messageBody;
        private String from;
        private List<String> to;
        private List<String> cc;
        private List<String> bcc;
        private List<String> attachments;

        public EmailNotificationBuilder(String from, String to) {
            this.from = from;
            this.to = new ArrayList<String>();
            this.to.add(to);
        }

        public EmailNotificationBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public EmailNotificationBuilder setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public EmailNotificationBuilder setFrom(String from) {
            this.from = from;
            return this;
        }

        public EmailNotificationBuilder setTo(List<String> to) {
            this.to = to;
            return this;
        }

        public EmailNotificationBuilder setCc(List<String> cc) {
            this.cc = cc;
            return this;
        }

        public EmailNotificationBuilder setBcc(List<String> bcc) {
            this.bcc = bcc;
            return this;
        }

        public EmailNotificationBuilder setAttachments(List<String> attachments) {
            this.attachments = attachments;
            return this;
        }
        public EmailNotification build() {
            return new EmailNotification(title, messageBody, from, to, cc, bcc, attachments);
        }
    }
}
