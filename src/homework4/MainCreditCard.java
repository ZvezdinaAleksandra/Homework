package homework4;
public class MainCreditCard {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("123456", 1000);
        CreditCard creditCard1 = new CreditCard("654321", 10000);
        CreditCard creditCard2 = new CreditCard("321456", 100000);

        creditCard.addMoney(200);
        creditCard.showBalance();

        creditCard1.addMoney(500);
        creditCard1.showBalance();

        creditCard2.withdrawMoney(2000);
        creditCard2.showBalance();
    }

    }
