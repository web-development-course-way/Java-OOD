package notifiers;

public class SlackNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Sending notification using Slack!");
    }
}
