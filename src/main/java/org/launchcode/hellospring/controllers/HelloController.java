package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody //By add response body up here all the methods inherit response
// body below, so I deleted response body from the methods
@RequestMapping("index") // By adding this all things now start at /hello
// so the goodbye method actually lives at /hello/goodbye
public class HelloController {

    //Now using a post form
    // Lives at hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" + //submits a
                // request
                // to
                // /hello
                "<input type = 'text'  name = 'name' value = 'Enter your " +
                "name'>" +
                "<select name = 'language'>" +
                "<option value = 'english'>English</option>" +
                "<option value = 'french'>French</option>" +
                "<option value = 'german'>German</option>" +
                "<option value = 'spanish'>Spanish</option>" +
                "<option value = 'chinese'>Chinese</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value =
            "hello")
    public String userNameAndLanguage(@RequestParam String name,
                                      @RequestParam String language) {
        String result;
        if (language.equals("english")) {
            return "Hello " + name + "!";
        } else if (language.equals("french")) {
            return "Bonjour " + name + "!";
        } else if (language.equals("german")) {
            return "Guten tag " + name + "!";
        } else if (language.equals("spanish")) {
            return "Hola " + name + "!";
        } else {
            return "Ni hao " + name + "!";
        }
    }
}
