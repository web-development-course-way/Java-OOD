import notifiers.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = null;
        boolean facebookEnabled = false;
        boolean slackEnabled;
        boolean smsEnabled;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to enable facebook notification?(true/false)");
        facebookEnabled = scanner.nextBoolean();
        System.out.println(facebookEnabled + " is here");
        System.out.println("Do you want to enable slack notification?(true/false)");
        scanner = new Scanner(System.in);
        slackEnabled = scanner.nextBoolean();
        System.out.println("Do you want to enable sms notification?(true/false)");
        scanner = new Scanner(System.in);
        smsEnabled = scanner.nextBoolean();

        if(facebookEnabled) {
            if(slackEnabled) {
                if(smsEnabled)
                    notifier = new FacebookSMSSlackNotifier();
                else
                    notifier = new FacebookSlackNotifier();
            }
            else if(smsEnabled){
                notifier = new SMSFacebookNotifier();
            }
            else
                notifier = new FacebookNotifier();
        }
        //add all the other combinations
        notifier.send();
    }
}
