package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody //By add response body up here all the methods inherit response
// body below, so I deleted response body from the methods
@RequestMapping("hello") // By adding this all things now start at /hello
// so the goodbye method actually lives at /hello/goodbye
public class HelloController {

    // Handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring";
//    }

//    // Responds to get and post requests at /hello?coder=LaunchCoder
//    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public String hello(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }
//
//    @GetMapping
//    @ResponseBody
//    public String helloForm() {
//        String html =
//                "<html>" +
//                        "<body>" +
//                        "<form method = 'post' action = '/hello'>" +
//                        "<input type = 'text' name = 'coder' />" +
//                        "<input type = 'submit' value = 'Greet Me!' />" +
//                        "</form>" +
//                        "</body>" +
//                        "</html>";
//        return html;
//
//    }

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring";
//    }

    //lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring";
    }

//    // Handles request of the form /hello?name = adjflsj
//    @GetMapping("hello")
//    @ResponseBody
//    public String helloWithQueryParameter(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

    // Newer and better handles both get and post params
    // Handles request of the form /hello?name = adjflsj
    //Removing value = "hello" from  @RequestMapping(method = {RequestMethod
    // .GET, RequestMethod.POST}, value = "hello")
    //With request mapping hello above this lives at localhost:8080/hello
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value =
            "hello")
    public String helloWithQueryParameter(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
    //removed "hello/" from @GetMapping("hello/{name})
    // it Lives at localhost:8080/hello/{name}
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

//    @GetMapping("form")
//    @ResponseBody
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form action = 'hello'>" + //submits a request to /hello
//                "<input type = 'text'  name = 'name'>" +
//                "<input type = 'submit' value = 'Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    //Now using a post form
    // Lives at hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" + //submits a request
                // to
                // /hello
                "<input type = 'text'  name = 'name'>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
