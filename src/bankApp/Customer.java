package bankApp;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String cnp;
    private Email email;
    private double salariu;
    private Bank bank;
    private ArrayList<CreditAccount> credidAccounts;
    private ArrayList<SavingsAccount> savingsAccounts;


    public Customer(String firstName, String lastName, String cnp, Bank bank, double salariu) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.bank = bank;
        this.email = new Email(firstName, lastName, bank.getDomain());
        this.salariu = salariu;
        this.credidAccounts = new ArrayList<>();
        this.savingsAccounts = new ArrayList<>();
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp='" + cnp + '\'' +
                ", salariu=" + salariu +
                " " + email + " "+
                '}';
    }
}