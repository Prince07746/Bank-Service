package Bank.UserBank;

import Bank.model.CardUser;
import Bank.model.TransactionUser;
import Bank.model.UserClient;

import java.util.ArrayList;
import java.util.Objects;


public class UserClientBank {

    private UserClient userClient;
    private ArrayList<TransactionUser> transactionUsers;
    private ArrayList<CardUser> cards;

    public UserClientBank(UserClient userClient, ArrayList<TransactionUser> transactionUsers, ArrayList<CardUser> cards) {
        this.userClient = userClient;
        this.transactionUsers = transactionUsers;
        this.cards = cards;
    }

    public UserClient getUserClient() {
        return userClient;
    }

    public void setUserClient(UserClient userClient) {
        this.userClient = userClient;
    }

    public ArrayList<TransactionUser> getTransactionUsers() {
        return transactionUsers;
    }

    public void setTransactionUsers(ArrayList<TransactionUser> transactionUsers) {
        this.transactionUsers = transactionUsers;
    }

    public ArrayList<CardUser> getCards() {
        return cards;
    }

    public void setCards(ArrayList<CardUser> cards) {
        this.cards = cards;
    }


}
