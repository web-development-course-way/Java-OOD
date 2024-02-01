import java.util.List;

public class Main {
    public static void main(String[] args) {
        ////////// Custom Building without Director //////////
        EmailBuilder emailBuilder = new EmailBuilder("Sender", "Receiver");
        emailBuilder.setTitle("Important Email - using builder")
                    .setMessageBody("Please read this important email")
                    .setCc(List.of("cc1@horus.com"))
                    .setBcc(List.of("bcc1@horus.com"))
                    .setAttachments(List.of("attachment1.pdf", "attachment2.docx")).build()

//        System.out.println(emailBuilder.getEmail().toString());

//        SMSBuilder smsBuilder = new SMSBuilder("Sender", "Receiver");
//        smsBuilder.setTitle("Important SMS - using builder")
//                .setMessageBody("Please read this important SMS")
//                .setCc(List.of("cc1@horus.com"))
//                .setBcc(List.of("bcc1@horus.com"))
//                .setAttachments(List.of("attachment1.pdf", "attachment2.docx"));
//        System.out.println(smsBuilder.getSMS().toString());


        ////////// Template Building with Director //////////

    }
}

