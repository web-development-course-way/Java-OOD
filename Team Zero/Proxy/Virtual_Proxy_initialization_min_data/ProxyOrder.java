public class ProxyOrder implements  Order{

    Order order ;
     public ProxyOrder(){

     }

    public void processOrder(){
         if( order == null )
             order = new RealOrder();

         order.processOrder();

    }

}
