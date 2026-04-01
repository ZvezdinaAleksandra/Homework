package homework4;
/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.

Напишите программу, которая создает три объекта класса CreditCard,
у которых заданы номер счета и начальная сумма.

Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.
*/

public class CreditCard {

    String accountNumber; // номер счета
    int accountBalance; // текущая сумма на счету

    public CreditCard(String accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void addMoney(int amount) { // начисляем
        accountBalance += amount;
    }

    public void withdrawMoney(int amount) {
        if (amount <= accountBalance) {
            accountBalance = accountBalance - amount;
        } else {
            System.out.println("Недостаточно средств на счете!");
        }
    }

    public void showBalance() {
        System.out.println("Account number: " + accountNumber + "  Balance: " + accountBalance);

    }
}