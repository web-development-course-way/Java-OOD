
public class bidWayContext{
    private bidWay bidFinalWay;
    public String execBidWay(bidWay bidFinalWayArg){
        bidFinalWay=bidFinalWayArg;
        return bidFinalWay.bidWayExecute();
    }
    
}