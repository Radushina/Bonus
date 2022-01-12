public class Main {
    public static void main(String[] args) {

        // вход
        double score = 100; //начальная сумма на счету клиента
        double amount = 15.7; // сумма пополнения
        int bonus;
        // логика
        if (amount > 1000) {
            bonus = (int) amount / 100;

        } else {
            bonus = 0;

        }
        System.out.println("Итоговый счет - " + (score + amount + bonus) + " руб.");
        System.out.println("Бонус - " + bonus + " руб.");

    }
}
