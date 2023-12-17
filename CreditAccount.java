public class CreditAccount extends Account{
    public CreditAccount(int amount) {
        super(amount);
    }

    public void takeCreditAmount(int refillSum) {
        refillSum += refillSum * 0.001;
        super.putAmount(refillSum);
    }
    public void putCreditAmount(int refillSum){
        super.putAmount(refillSum);
    }
}
