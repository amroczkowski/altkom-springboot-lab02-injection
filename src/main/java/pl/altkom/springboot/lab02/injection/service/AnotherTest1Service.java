package pl.altkom.springboot.lab02.injection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class AnotherTest1Service implements AnotherBaseService {

    public String test() {
        return "OK!";
    }
}
