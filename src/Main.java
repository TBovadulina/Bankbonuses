public class Main {
    public static void main(String[] args) {

        int basic = 100; //начальный счет клиента
        int replenishmentAmount = 5000; //сумма пополнения

        int bonuses;
        if (replenishmentAmount > 1000) {
            bonuses = ((replenishmentAmount / 100) * 1);
        } else {
            bonuses = 0;
        }
        int amount = basic + replenishmentAmount + bonuses; //  итоговая сумма на чету клиента

        System.out.println("бонус равен " + bonuses + " рублям");
        System.out.println("итоговая сумма на счету клиента - " + amount + " рублей");

    }
}