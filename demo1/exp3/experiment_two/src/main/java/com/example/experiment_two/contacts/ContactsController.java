package com.example.experiment_two.contacts;

import com.example.experiment_two.contacts.EmergencyContacts;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 *
 * @author Sihoon Lee
 */

@RestController
public class ContactsController {
    HashMap<String, EmergencyContacts> EcontactsList = new  HashMap<>();
//    HashMap<String, GeneralContacts> GcontactsList = new  HashMap<>();


    @GetMapping("/contacts")
    public  HashMap<String,EmergencyContacts> EgetAllUsers() {
        return EcontactsList;
    }
//    public  HashMap<String,GeneralContacts> GgetAllUsers() {
//        return GcontactsList;
//    }


    @PostMapping("/contacts")
//    public  String createContact(@RequestBody EmergencyContacts Euser, @RequestBody GeneralContacts Guser) {
    public  String createContact(@RequestBody EmergencyContacts user) {
        System.out.println(user);
//        System.out.println(Guser);
//        if((int)Euser.getname().charAt(0)<97){
        EcontactsList.put(user.getName(), user);
        return "************** New Contact "+ user.getName() + " Saved **************";
//        }
//        else{
//            GcontactsList.put(Guser.getname(), Guser);
//            return "************** New Contact "+ Guser.getname() + " Saved **************";
//        }

    }

    @GetMapping("/contacts/{id}")
    public Contacts getContact(@PathVariable String id) {
        Contacts u = EcontactsList.get(id);
        return u;
    }

    @PutMapping("/contacts/{id}")
    public Contacts updateContact(@PathVariable String id, @RequestBody EmergencyContacts p) {
        EcontactsList.replace(id, p);
        return EcontactsList.get(id);
    }

    @DeleteMapping("/contacts/{id}")
    public HashMap<String, EmergencyContacts> Contact(@PathVariable String id) {
        EcontactsList.remove(id);
        return EcontactsList;
    }
}

