package Bank.service;

import Bank.model.CardUser;
import Bank.model.TransactionUser;
import Bank.model.UserClient;
import Bank.repository.CardRepository;
import Bank.repository.TransactionRepository;
import Bank.repository.UserClientRepository;
import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankService {

    private final CardRepository cardRepository;
    private final TransactionRepository transactionRepository;
    private final UserClientRepository userClientRepository;

    @Autowired
    public BankService(CardRepository cardRepository,
                       TransactionRepository transactionRepository,
                       UserClientRepository userClientRepository) {
        this.cardRepository = cardRepository;
        this.transactionRepository = transactionRepository;
        this.userClientRepository = userClientRepository;
    }


    // CRUD for CardUser
    public List<CardUser> getAllCards() {
        return cardRepository.findAll();
    }

    public CardUser getByCardNumber(String cardNumber){
        return getAllCards().stream().
                filter(card -> card.getCardNumber().equals(cardNumber)).
                findFirst().orElse(null);
    }

    public CardUser getCardById(int id) {
        return cardRepository.findById(id).orElse(null);
    }

    public List<CardUser> getAllUserCard(int id){
        return getAllCards().stream().filter(cards -> cards.getId() == id).
                collect(Collectors.toList());
    }

    public CardUser saveCard(CardUser cardUser) {
        return cardRepository.save(cardUser);
    }

    public void deleteCard(int id) {
        cardRepository.deleteById(id);
    }





    // CRUD for TransactionUser
    public List<TransactionUser> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public TransactionUser getTransactionById(int id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public List<TransactionUser> getAllUserTransaction(int userId){
        return getAllTransactions().stream().
                filter(transaction -> transaction.getUserId() == userId)
                .collect(Collectors.toList());
    }


    public TransactionUser saveTransaction(TransactionUser transactionUser) {
        return transactionRepository.save(transactionUser);
    }

    public void deleteTransaction(int id) {
        transactionRepository.deleteById(id);
    }





    // CRUD for UserClient
    public List<UserClient> getAllUsers() {
        return userClientRepository.findAll();
    }

    public UserClient getUserById(int id) {
        return userClientRepository.findById(id).orElse(null);
    }

    public UserClient saveUser(UserClient userClient) {

        UserClient userClient1 = getAllUsers().stream().
                filter(user -> user.getName().equals(userClient.getName()) &&
                        user.getLastName().equals(userClient.getLastName())
                ).findFirst().orElse(null);
        if(userClient1 != null){
            return userClientRepository.save(userClient);
        }else {
            return userClientRepository.save(userClient);
        }
    }


    public void deleteUser(int id) {
        userClientRepository.deleteById(id);
    }


}
