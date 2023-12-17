public class Account {
    private int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public void putAmount(int refillSum) {
        // Проверка на отрицательное число
        if (refillSum < 0) {
            System.out.println("Нельзя пополнять баланс отрицательными числами!");
        } else {
            amount += refillSum;
            System.out.println("Ваш баланс был пополнен на" + " : " + refillSum);
        }
    }
    public void takeAmount(int refillSum) {
    // Проверка на отрицательное число
    if (refillSum < 0){
        System.out.println("Нельзя снимать с баланса отрицательные числа!");
        // Проверка больше-ли дельта баланса
    } else if(refillSum > this.amount){
            System.out.println("Недостаточно средств для снятия");
        }else {
            amount -= refillSum;
            System.out.println("С вашего баланса было снято" + " : " + refillSum);
        }
    }
    public double getAmount(){
        return amount;
    }
}

