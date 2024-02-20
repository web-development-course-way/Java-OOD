public class Concerete_SMS_Server implements  SMS_Server {
    public String sendSMS( String CustomerID , String mobile , String sms ) {

        return " This message send from "+ CustomerID + "To Mobile : " + mobile +
                 "The message : " + sms ;
    }

}
