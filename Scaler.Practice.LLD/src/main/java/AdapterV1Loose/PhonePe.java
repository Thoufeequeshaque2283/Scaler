package AdapterV1Loose;

public class PhonePe {
    public boolean loanCheck(BankAPI yb){
        if(yb.checkBanlance() > 100){
            return true;
        }
        return false;
    }
}
