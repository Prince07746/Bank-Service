package MyApp.model;

import java.util.ArrayList;
import java.util.Objects;

public class UserClientBank {
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private double balance;
    private ArrayList<TransactionUser> transactionUsers;

    public UserClientBank(String name, String lastName, String address, String phone, double balance, ArrayList<TransactionUser> transactionUsers) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.balance = balance;
        this.transactionUsers = transactionUsers;
    }

    public UserClientBank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<TransactionUser> getTransactionUsers() {
        return transactionUsers;
    }

    public void setTransactionUsers(ArrayList<TransactionUser> transactionUsers) {
        this.transactionUsers = transactionUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserClientBank that = (UserClientBank) o;
        return Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return "UserClientBank{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                ", transactionUsers=" + getTransactionUsers().toString() +
                '}';
    }
}
