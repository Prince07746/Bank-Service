package Bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class CardUser {

    @Id
    private int id;
    private String cardNumber;
    private String cardHolderName;
    private int cvv;
    private LocalDate expiryDate;

    // Constructor

    public CardUser(int id, String cardNumber, String cardHolderName, int cvv, LocalDate expiryDate) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public CardUser() {
    }

    // Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardUser cardUser = (CardUser) o;
        return cvv == cardUser.cvv && Objects.equals(cardNumber, cardUser.cardNumber) && Objects.equals(cardHolderName, cardUser.cardHolderName) && Objects.equals(expiryDate, cardUser.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cardHolderName, cvv, expiryDate);
    }

}
