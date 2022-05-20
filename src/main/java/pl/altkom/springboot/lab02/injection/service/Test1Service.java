package pl.altkom.springboot.lab02.injection.service;

import org.springframework.stereotype.Service;

@Service("test1Service")
public class Test1Service implements BaseService {

    public String test() {
        return "OK!";
    }
}
