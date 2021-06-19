package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(method = RequestMethod.GET, path="/helloWorld")
    public String helloWorld()
    {
        return "Hello from spring basics";
    }
}
