package Bank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {


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

}
