
public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int addSum = 5000;
        int bonus;
        if (addSum > 1000) {
            bonus = addSum / 100;
        } else {
            bonus = 0;
        }
        int addBalance = currentBalance + addSum + bonus;
        System.out.printf("Бонус = " + bonus);
        System.out.printf(" Итоговый счет = " + addBalance);
    }
}