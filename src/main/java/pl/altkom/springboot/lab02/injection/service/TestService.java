package pl.altkom.springboot.lab02.injection.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String test() {
        return "OK!";
    }
}
