 package Bank.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
public class TransactionUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private int userId;
    private String fullName;
    private double amount;
    private double balance;
    private String destinationName;
    private int destinationId;
    private boolean transactionStatus;
    private LocalDate date;

    public TransactionUser(int id,int userId, String fullName, double amount,
                           double balance, String destinationName, int destinationId,
                           boolean transactionStatus, LocalDate date) {
        this.id = id;
        this.userId = userId;
        this.fullName = fullName;
        this.amount = amount;
        this.balance = balance;
        this.destinationName = destinationName;
        this.destinationId = destinationId;
        this.transactionStatus = transactionStatus;
        this.date = date;
    }

    public TransactionUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public boolean isTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(boolean transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionUser that = (TransactionUser) o;
        return id == that.id && userId == that.userId && destinationId == that.destinationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, destinationId);
    }

    @Override
    public String toString() {
        return "TransactionUser{" +
                "id=" + id +
                ", userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", amount=" + amount +
                ", balance=" + balance +
                ", destinationName='" + destinationName + '\'' +
                ", destinationId=" + destinationId +
                ", transactionStatus=" + transactionStatus +
                ", date=" + date +
                '}';
    }
}
