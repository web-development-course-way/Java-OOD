package notifiers;

public class FacebookNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Sending notification using Facebook!");
    }
}
