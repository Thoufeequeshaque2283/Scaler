package AdapterV1Loose;

public class FastTagRecharge {
    int recharge(BankAPI yb, int amount){
        if(yb.checkBanlance() >= 100){
            System.out.println("RechargeSuccessful");
            return 1;
        }
        return -1;
    }
}
