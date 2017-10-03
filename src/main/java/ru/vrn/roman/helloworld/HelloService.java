package ru.vrn.roman.helloworld;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Random;

/**
 * Created by Roman on 03.10.2017.
 */
@Service
public class HelloService {

    public String getString() {
        return "Hello, " + Instant.now().toString();
    }
}
