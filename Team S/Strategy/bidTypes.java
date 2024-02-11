public interface bidTypes{
    String bidExecute();
}
class openBid implements bidTypes{
    public String bidExecute(){
        //write execution of service here
        return "Execution of open bidding";
    }
}
class closedBid implements bidTypes{
    public String bidExecute(){
        //write execution of service here
        return "Execution of closed bidding";
    }
}
class time_basedBid implements bidTypes{
    public String bidExecute(){
        //write execution of service here
        return "Execution of time based bidding";
    }
}
class reserve_priceBid implements bidTypes{
    public String bidExecute(){
        //write execution of service here
        return "Execution of reserve price bidding";
    }
}
