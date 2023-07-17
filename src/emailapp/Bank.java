package emailapp;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    private String domain;

    public Bank(String bankName, String domain) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
        this.domain = domain;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
