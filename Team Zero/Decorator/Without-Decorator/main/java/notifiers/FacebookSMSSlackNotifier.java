package notifiers;

public class FacebookSMSSlackNotifier implements Notifier {
    private final FacebookNotifier facebookNotifier;
    private final SMSNotifier smsNotifier;
    private final SlackNotifier slackNotifier;

    public FacebookSMSSlackNotifier() {
        this.facebookNotifier = new FacebookNotifier();
        this.smsNotifier = new SMSNotifier();
        this.slackNotifier = new SlackNotifier();
    }

    @Override
    public void send() {
        this.facebookNotifier.send();
        this.smsNotifier.send();
        this.slackNotifier.send();
    }
}
