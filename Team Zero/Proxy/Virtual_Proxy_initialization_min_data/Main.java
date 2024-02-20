public class Main {
    public static void main(String[] args) {

        Order withoutProxy = new RealOrder();
        System.out.println("Process finished.");   // in this case will load the data direct
                                                   // at the same time the user not need this data now
        System.out.println("----------");

        Order order1 = new ProxyOrder() ;
        System.out.println("Process finished.");   // in this case the system not load the data
                                                  // because the user not need this data now
        System.out.println("----------");


        Order order2 = new ProxyOrder();
        order2.processOrder();              // it's going to load data because the user need it
        System.out.println("-----------");


    }
}
