public interface bidWay{
    String bidWayExecute();
}
 class automaticBid implements bidWay{
    public String bidWayExecute(){
        //write execution of service here
        return "Execution of automatic bidding ";
    }
}
 class manualBid implements bidWay{
    public String bidWayExecute(){
        //write execution of service here
        return "Execution of manual bidding ";
    }
}