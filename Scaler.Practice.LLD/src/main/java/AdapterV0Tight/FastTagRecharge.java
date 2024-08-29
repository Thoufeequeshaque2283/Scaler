package AdapterV0Tight;

public class FastTagRecharge {
    int recharge(YesBangkApi yb,int amount){
        if(yb.getBalance() >= amount){
            System.out.println("Recharger Successfully");
            return 1;
        }
        return 0;
    }
}
