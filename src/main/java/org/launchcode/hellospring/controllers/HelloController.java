package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value =
            "hello")
    public String helloWithQueryParameter(@RequestParam String name,
                                          Model model) {
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name, Model model) {
        model.addAttribute("greeting", "Hello, " + name + "?");
        return "hello";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("index")
    public String indexHello() {
        return "index";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>(Arrays.asList("Lancaster",
                "Kelly", "Archimedes", "Lilika", "Maximus", "Minimus"));
        model.addAttribute("names", names);
        return "hello-list";
    }
}
