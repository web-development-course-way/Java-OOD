package notifiers;

public class SMSNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Sending notification using SMS!");
    }
}
