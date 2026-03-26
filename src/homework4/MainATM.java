package homework4;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM(20000, 4000, 10000);
        atm.addBanknote20(1000);
        atm.addBanknote50(600);
        atm.addBanknote100(500);
    }

}