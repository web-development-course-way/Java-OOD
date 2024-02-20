import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailNotification emailNotification =
                new EmailNotification.EmailNotificationBuilder("sender", "receiver")
                        .setTitle("Important Email - using builder")
                        .setMessageBody("Please read this important email")
                        .setCc(List.of("cc1@horus.com"))
                        .setBcc(List.of("bcc1@horus.com"))
                        .setAttachments(List.of("attachment1.pdf", "attachment2.docx"))
                        .build();
        System.out.println(emailNotification.toString());
    }
}

