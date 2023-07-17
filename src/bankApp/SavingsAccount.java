package bankApp;

import java.util.Scanner;

public class SavingsAccount implements  Transactions{
    private String accountNumber;
    private String valuteType;
    private double suma;
    private Customer customer;

    private double monthlyInterest;

    public SavingsAccount(String accountNumber, double suma, Customer customer,double monthlyInterest) {
        this.accountNumber = accountNumber;
        this.valuteType = makeValuteType();
        this.suma = suma;
        this.customer = customer;
        this.monthlyInterest = monthlyInterest;
    }

    public String makeValuteType(){
        System.out.println("Alegeti valuta contului de economii: " + this.accountNumber + "\n1. Lei\n2. Euro\n3. Dolari");

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

    public void aMonthPassed (){
        this.suma += this.suma * monthlyInterest/100;
        System.out.println("Luna aceasta vi s-au adaugat " +
                this.suma * monthlyInterest/100 +
                " " +
                this.valuteType
        );
    }

    @Override
    public void deposit(double suma) {
        this.suma += suma;
    }

    @Override
    public void withdraw(double suma) {
        if(this.suma - suma < 0){
            System.out.println("Nu aveti suficiente fonduri in contul dumneavoastra de economii");
        } else {
            this.suma -= suma;
        }
    }



    @Override
    public String toString() {
        return "SavingsAccount  " +
                "accountNumber='" + accountNumber + '\'' +
                ", suma curenta=" + suma +" valuteType'"+
                ", dobanda=" + monthlyInterest + "%";
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
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
