package pl.altkom.springboot.lab02.injection.service;

import org.springframework.stereotype.Service;

@Service
public class AnotherTest2Service implements AnotherBaseService {

    public String test() {
        return "OK!";
    }
}
