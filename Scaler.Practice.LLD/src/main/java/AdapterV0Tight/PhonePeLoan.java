package AdapterV0Tight;

public class PhonePeLoan {
    public boolean LoanCheck(YesBangkApi yb){
        if(yb.getBalance() >100){
            return true;
        }
        return false;
    }
}
