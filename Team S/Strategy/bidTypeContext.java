public class bidTypeContext{
    private bidTypes bidFinalType;
    public String execBidType(bidTypes bidFinalTypeArg){
        bidFinalType=bidFinalTypeArg;
        return bidFinalType.bidExecute();
    }
   
}