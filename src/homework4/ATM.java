package homework4;
/* Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала*/

public class ATM {
    int banknote20;
    int banknote50;
    int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public boolean addBanknote20(int amount) {
        if (amount <= 0) {
            return false;
        }

        banknote20 += amount;
        return true;
    }

    public boolean addBanknote50(int amount) {
        if (amount <= 0) {
            return false;
        }

        banknote50 += amount;
        return true;
    }

    public boolean addBanknote100(int amount) {
        if (amount <= 0) {
            return false;
        }

        banknote100 += amount;
        return true;
    }

    public void withdraw(int amount) {
        if (amount <= 0 || amount % 10 != 0) {
            System.out.println("Неверная сумма для выдачи.");
            return;
        }

        int remaining = amount;

        int used100 = Math.min(remaining / 100, banknote100);
        remaining -= used100 * 100;

        int used50 = Math.min(remaining / 50, banknote50);
        remaining -= used50 * 50;

        int used20 = Math.min(remaining / 20, banknote20);
        remaining -= used20 * 20;

        if (remaining == 0) {
            // списываем купюры из банкомата
            banknote100 -= used100;
            banknote50 -= used50;
            banknote20 -= used20;

            System.out.print("Выдано купюр: ");
            if (used100 > 0) System.out.print("100-" + used100 + " ");
            if (used50 > 0) System.out.print("50-" + used50 + " ");
            if (used20 > 0) System.out.print("20-" + used20 + " ");
            System.out.println();
        } else {
            System.out.println("Невозможно выдать точную сумму.");
        }
    }
}