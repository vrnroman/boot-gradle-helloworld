package ru.vrn.roman.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Roman on 03.10.2017.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @RequestMapping(value = "/string", method = RequestMethod.GET)
    public String getString() {
        return service.getString();
    }
}
