package bankApp;

public class Main {

public static void main(String[] args) {
    Bank BT = new Bank("Transilvania","bt.ro");
    Customer customer1 = new Customer("Madalin","Grecescu","1000000000000",BT,7000);
    CreditAccount creditAccount1 = new CreditAccount("00001",100,customer1,9);
    SavingsAccount savingsAccount1 = new SavingsAccount("00002",300,customer1,4);

    System.out.println(customer1);

    System.out.println("suma initiala : " + creditAccount1.getSuma() + " " + creditAccount1.getValuteType());
    creditAccount1.deposit(200);
    System.out.println("dupa depozit: " +creditAccount1.getSuma() + " " +creditAccount1.getValuteType());
    creditAccount1.withdraw(500);
    System.out.println("dupa retragere: " + creditAccount1.getSuma() + " " +creditAccount1.getValuteType());


    System.out.println("suma initiala cont de economii " + savingsAccount1.getSuma() + " " + savingsAccount1.getValuteType());
    savingsAccount1.deposit(200);
    System.out.println("suma dupa depozit " + savingsAccount1.getSuma() + " " + savingsAccount1.getValuteType());
    savingsAccount1.withdraw(1000);
    System.out.println("suma dupa incercarea de a retrage mai multi bani decat avem " + savingsAccount1.getSuma() + " " + savingsAccount1.getValuteType());
    savingsAccount1.withdraw(250.2);
    System.out.println("suma dupa retragere " + savingsAccount1.getSuma() + " " + savingsAccount1.getValuteType());
    savingsAccount1.aMonthPassed();
    System.out.println("suma dupa ce am primit dobanda pe o luna " + savingsAccount1.getSuma() + " " + savingsAccount1.getValuteType());



}



}