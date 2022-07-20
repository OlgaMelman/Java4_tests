public class BonusService {
    public int calculate(int amount, boolean registered) {
        int percent = registered ? 3 : 1;
        int bonus = amount * percent / 100;
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        if (amount < 0) {
            bonus = 0;
        }
        return bonus;
    }
}
