package pl.altkom.springboot.lab02.injection.service;

import org.springframework.stereotype.Service;

@Service("test2Service")
public class Test2Service implements BaseService {

    public String test() {
        return "OK!";
    }
}
