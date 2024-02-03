package notifiers;

public class FacebookSlackNotifier implements Notifier {
    private final FacebookNotifier facebookNotifier;
    private final SlackNotifier slackNotifier;
    public FacebookSlackNotifier(){
        this.facebookNotifier = new FacebookNotifier();
        this.slackNotifier = new SlackNotifier();
    }
    @Override
    public void send() {
        this.facebookNotifier.send();
        this.slackNotifier.send();
    }
}
