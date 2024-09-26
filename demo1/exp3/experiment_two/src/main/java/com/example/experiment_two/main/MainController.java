package com.example.experiment_two.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller     // return VIEW, it means also return Data
public class MainController {
    @RequestMapping(value = "/main")
    public String main(){
        return "index.html";
    }

//    @RequestMapping("/Samplethymeleaf")
//    public String sampleThymeleaf(Model model){
//        String str = "thymeleaftest hello";
//        model.addAttribute("str",str);
//        return "thymeleaf/Samplethymeleaf";
//    }



@ResponseBody   // for Java object, requestmapping http to body
    @RequestMapping("/body")
    public String body() {
        String data = "----------- test @ResponseBody -----------";
        return data;
    }

@RestController
    public class restController {
        @RequestMapping(value ="/rest", method = RequestMethod.GET)
    public String getRestControllerValue(){
            String restControllerValue = "----------- test @RestController -----------";
            return restControllerValue;
        }
    }


}
