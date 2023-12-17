import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends CreditAccount{
    private LocalDate today;
    private LocalDate now;
    public DepositAccount(int amount) {
        super(amount);
        today = LocalDate.now();
        now = LocalDate.now().plusDays(30);
    }
    public void putDepositAmount(int refillSum){
        super.putAmount(refillSum);
        today = LocalDate.now();
        now = LocalDate.now().plusDays(30);
    }

    public long takeDepositAmount(int refillSum) {
            // Получаем текущую дату
            LocalDate today = LocalDate.now();
            LocalDate now = LocalDate.now().plusDays(30);
            // Проверка, что между today и now прошло больше 1 месяца
            long monthBetweenTodayAndNow = ChronoUnit.MONTHS.between(today, now); // количество месяцев между today и now
            System.out.println(monthBetweenTodayAndNow + "месяц(ев) прошло");
            if (monthBetweenTodayAndNow > 0){
                super.takeAmount(refillSum);
                today = LocalDate.now();
                now = LocalDate.now().plusDays(30);
            } else{
                System.out.println("Ещё не прошёл месяц с последнего пополнения");
            }
            return monthBetweenTodayAndNow;
    }
}
