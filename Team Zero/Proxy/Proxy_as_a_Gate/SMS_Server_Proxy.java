import java.util.HashMap;
import java.util.Map;
import  java.lang.String ;

public class SMS_Server_Proxy {

    SMS_Server _smsServer;
    Map<String, Integer> countMessage = new HashMap<>();

    public String sendSMS( String customerID , String mobile , String sms ) {

        if( _smsServer == null )
            _smsServer = new Concerete_SMS_Server() ;

        if( ! countMessage.containsKey(customerID) )  // this is a new customer
            countMessage.put(customerID , 0 ) ;

        else if ( countMessage.get(customerID) >= 2  )  // not there more free message
            return "Not send !";


        System.out.println("The line ") ;
        int current_value = countMessage.get(customerID) ;
        current_value = current_value + 1 ;
        countMessage.put(customerID , current_value ) ;

        return _smsServer.sendSMS(customerID , mobile , sms ) ;
    }


}
