public class Main {
    public static void main(String[] args) {
        int startAccount = 1500;
        int addedPayment = 1400;
        int bonus = 0;

        if  (addedPayment > 1000) {
            bonus = addedPayment / 100;
        }

        System.out.println("Итоговый баланс счета: " + (startAccount + addedPayment + bonus));
        System.out.println("Количество бонусов: " + bonus);
    }
}

