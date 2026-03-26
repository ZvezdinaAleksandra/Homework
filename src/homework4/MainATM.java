package homework4;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM(20000, 4000, 10000);
        ATM atm1 = new ATM(30000, 50000, 9000);
        ATM atm2 = new ATM(900, 100, 8000);

        atm.addBanknote20(1000);
        if (atm.addBanknote20(1000)) {
            System.out.println("Успех");
        } else {
            System.out.println("Ошибка");
        }
        atm.addBanknote50(10000);
        if (atm.addBanknote50(10000)) {
            System.out.println("Успех");
        } else {
            System.out.println("Ошибка");
        }

        atm.addBanknote100(10000);
        if (atm.addBanknote100(10000)) {
            System.out.println("Успех");
        } else {
            System.out.println("Ошибка");
        }

        atm.withdraw(90089000);
    }
}