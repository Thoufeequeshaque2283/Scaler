package AdapterV0Tight;

public class PhonePe {
    YesBangkApi yb = new YesBangkApi();
    PhonePeLoan pl = new PhonePeLoan();
    FastTagRecharge ft = new FastTagRecharge();

    boolean checkLoanEligibility(){
        return  pl.LoanCheck(yb);
    }
    boolean FastTagRecharge(int amount){
        if(ft.recharge(yb,amount)>=0){
            System.out.println("Recharge SuccessFull");
            return true;
        }
        return false;
    }
}
