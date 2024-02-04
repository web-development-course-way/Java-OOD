
public class Main {
    public static void main(String[] args) {
        SMS_Server_Proxy  Message = new SMS_Server_Proxy() ;

        System.out.println(Message.sendSMS("123453" , "01006332994 " ,
                             "Hello Mostafa There is a meeting...")  ) ;


        System.out.println(Message.sendSMS("123453" , "01004332994 " ,
                           "Hello Androw There is a meeting...")  ) ;

        System.out.println(Message.sendSMS("123453" , "01004332994 " ,
                           "Hello AHMED There is a meeting...")  ) ;

        System.out.println(Message.sendSMS("123453" , "01004332994 " ,
                           "Hello AHMED There is a meeting...")  ) ;




    }
}
