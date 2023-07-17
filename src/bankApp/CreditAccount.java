package bankApp;

import java.util.Scanner;

public class CreditAccount implements Transactions{
    private String accountNumber;
    private String valuteType;
    private double suma;
    private Customer customer;

    private double fee;

    public CreditAccount(String accountNumber, double suma, Customer customer, double fee) {
        this.accountNumber = accountNumber;
        this.valuteType = makeValuteType();
        this.suma = suma;
        this.customer = customer;
        this.fee = fee;
    }

    public String makeValuteType(){
        System.out.println("Alegeti valuta contului de credit: " + this.accountNumber + "\n1. Lei\n2. Euro\n3. Dolari");

        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        switch (in) {
            case 1 -> {
                return "Lei";
            }
            case 2 -> {
                return "Eur";
            }
            case 3 -> {
                return "$";
            }
            default -> {
                System.out.println("S-a ales un cod gresit. Pentru a evita eventualele erori valuta a fost setata in Lei");
                return "Lei";
            }
        }
    }
    @Override
    public void deposit(double depozit) {
        this.suma = this.suma + depozit;
    }

    @Override
    public void withdraw(double withdraw) {
        if(this.suma - withdraw < 0){
            System.out.println("Intrucat soldul curent nu acopera valoarea acestei operatiuni,taxa este de " +
                    (this.suma - withdraw) * fee/100 * (-1) +
                    " " +
                    this.valuteType);
            this.suma = (this.suma - withdraw) - ((this.suma - withdraw) * fee/100);
        }else {
            this.suma -= suma;
        }
    }

    public double getFee() {
        return fee;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getValuteType() {
        return valuteType;
    }

    public double getSuma() {
        return suma;
    }

    public Customer getCustomer() {
        return customer;
    }
}
