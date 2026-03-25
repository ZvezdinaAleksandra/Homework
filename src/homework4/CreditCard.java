package homework4;

public class CreditCard {

    int accountNumber; //номер счета
    int accountBalance; //текущая сумма на счету
    int debitCard; // снимает сумму с баланса
    int charge; //Добавляет сумму к балансу
    int cardDetails; //Показывает номер карты и баланс

    public CreditCard () {

    }
    public CreditCard(int accountBalance, int accountNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public CreditCard(int debitCard, int charge, int cardDetails) {
        this.debitCard = debitCard;
        this.charge = charge;
        this.cardDetails = cardDetails;
    }

    public void charge () {
    System.out.println(charge + " начисляет сумму на кредитную карту");
}
public void debitCard () {
    System.out.println(debitCard + " снимает сумму с карты");
}
    public void cardDetails () {
        System.out.println(cardDetails + " текущая информация о карточке");
    }
}
