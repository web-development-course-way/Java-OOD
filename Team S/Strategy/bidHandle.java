public class bidHandle{
    bidTypeContext bidTypeContextRun= new bidTypeContext();
    bidWayContext bidWayContextRun= new bidWayContext();
    public String bidNow(String bidWay,String bidType){
        String finalValue="";
        if(bidWay=="automatic"){
             
            switch(bidType){
                case "open":
                    finalValue=bidWayContextRun.execBidWay(new automaticBid()) + bidTypeContextRun.execBidType(new openBid());
                    break;

                case "closed":
                    finalValue=bidWayContextRun.execBidWay(new automaticBid()) + bidTypeContextRun.execBidType(new closedBid());
                    break;

                case "time based":
                    finalValue=bidWayContextRun.execBidWay(new automaticBid()) + bidTypeContextRun.execBidType(new time_basedBid());
                    break;

                case "reserve price":
                    finalValue=bidWayContextRun.execBidWay(new automaticBid()) + bidTypeContextRun.execBidType(new reserve_priceBid());
                    break;

                
            }
        }else if (bidWay=="manual"){
            switch(bidType){
                case "open":
                    finalValue=bidWayContextRun.execBidWay(new manualBid()) + bidTypeContextRun.execBidType(new openBid());
                    break;
                case "closed":
                    finalValue=bidWayContextRun.execBidWay(new manualBid()) + bidTypeContextRun.execBidType(new closedBid());
                    break;
 
                case "time based":
                    finalValue=bidWayContextRun.execBidWay(new manualBid()) + bidTypeContextRun.execBidType(new time_basedBid());
                    break;

                case "reserve price":
                    finalValue=bidWayContextRun.execBidWay(new manualBid()) + bidTypeContextRun.execBidType(new reserve_priceBid());
                    break;

                
            }
        }
        return finalValue;
    }
}