package notifiers;

public class SMSFacebookNotifier implements Notifier {
    private final FacebookNotifier facebookNotifier;
    private final SMSNotifier smsNotifier;
    public SMSFacebookNotifier(){
        this.facebookNotifier = new FacebookNotifier();
        this.smsNotifier = new SMSNotifier();
    }
    @Override
    public void send() {
        this.smsNotifier.send();
        this.facebookNotifier.send();
    }
}
