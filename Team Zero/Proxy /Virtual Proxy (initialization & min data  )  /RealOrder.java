public class RealOrder implements Order {

    RealOrder(){
        intilization();
    }

    private void intilization(){
        System.out.println("We will Load all data , please give me sometime ") ;
    }

    public  void processOrder(){
        System.out.println("Order processed successfully");
    }
}
