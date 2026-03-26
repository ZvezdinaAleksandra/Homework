package homework4;

public class ATM {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addBanknote20(int amount) {
        banknote20 += amount;
    }

    public void addBanknote50(int amount) {
        banknote50 += amount;
    }

    public void addBanknote100(int amount) {
        banknote100 += amount;
    }
    public void withdrawBBanknote20(int amount) {
        banknote20 += amount;
    }
    public void withdrawBBanknote50(int amount) {
        banknote50 += amount;
    }
    public void withdrawBBanknote100(int amount) {
        banknote100 += amount;
    }

}
