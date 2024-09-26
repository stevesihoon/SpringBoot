package coms309;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController     // one of the controller that doesn't response with View.
                    // return result of the method with JSON.
                    // with this annotation, every methods in Controller
                    // can respond with Httpresponse.
class WelcomeController {

    @GetMapping("/")    // = RequestMethod.GET
    public String welcome() {
        return "Hello and welcome to COMS 309";
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return "Hello and welcome to COMS 309: " + name;
    }

//    @GetMapping("/{age}")
//    public String welcome(@PathVariable int age) {
//        if (age > 120){
//            return "Hello and welcome to COMS 309\nI am impressed that you are still alive";
//        }
//        return "Hello and welcome to COMS 309: " + age;
//    }
    // java.lang.IllegalStateException: Ambiguous handler methods mapped for '/12'
    // --> caused because it's not allowed to have mapping one URL with more than one Controller.

    @GetMapping("/{name}/{age}")
    public String welcome(@PathVariable String name, @PathVariable String age) {
        return "Hello and welcome to COMS 309: " + name +" " + age;
    }
    // it works because it is different URL
}
