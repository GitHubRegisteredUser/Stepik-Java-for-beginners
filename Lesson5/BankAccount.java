package Lesson5;

public class BankAccount {

    public static void main(String[] args) {
        BankAccountTest MyAccount = new BankAccountTest();
        MyAccount.id = 1;
        MyAccount.name = "A";
        MyAccount.balance = 12.34;
        MyAccount.popolnenieScheta(30);
        MyAccount.snyatieSoScheta(5);
    }

}

class BankAccountTest {

    int id;
    String name;
    double balance;

    void popolnenieScheta(double popolnenie) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Пополнение на: " + popolnenie);
        balance += popolnenie;
        System.out.println("Баланс после пополнения: " + balance);
        System.out.println();
    }

    void snyatieSoScheta(double snyatie) {
        System.out.println("Баланс до снятия: " + balance);
        System.out.println("Снятие: " + snyatie);
        balance -= snyatie;
        System.out.println("Баланс после снятия: " + balance);
        System.out.println();
    }

}
