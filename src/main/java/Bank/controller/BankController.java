package Bank.controller;


import Bank.UserBank.UserClientBank;
import Bank.model.CardUser;
import Bank.model.TransactionUser;
import Bank.model.UserClient;
import Bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {


    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService){
        this.bankService = bankService;
    }


    @GetMapping("/")
    public String getHome(){
        return "index";
    }
    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }
    @GetMapping("/how")
    public String getHow(){
        return "how";
    }

    @GetMapping("/bank/user")
    @ResponseBody
    public List<UserClient> getUser(){
        return bankService.getAllUsers();
    }

    @PostMapping("/bank/user")
    public ResponseEntity<UserClient> addUser(@RequestBody UserClient userClient){
        bankService.saveUser(userClient);
        return ResponseEntity.ok().body(userClient);
    }

    @GetMapping("/bank/user/{id}")
    @ResponseBody
    public UserClientBank getUserBank(@PathVariable("id") int userId){

        UserClient userClient1 = bankService.getUserById(userId);
        ArrayList<CardUser> cardUser =
                new ArrayList<>(bankService.getAllUserCard(userId));
        ArrayList<TransactionUser> transactionUsers =
                new ArrayList<>(bankService.getAllUserTransaction(userId));

        return new UserClientBank(userClient1,transactionUsers,cardUser);

    }

}
