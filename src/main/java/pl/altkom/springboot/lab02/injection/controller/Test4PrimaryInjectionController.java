package pl.altkom.springboot.lab02.injection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.altkom.springboot.lab02.injection.service.AnotherBaseService;
import pl.altkom.springboot.lab02.injection.service.BaseService;

@RequestMapping("/injection/primary")
@RestController
public class Test4PrimaryInjectionController {

    private final AnotherBaseService constructorService;

    public Test4PrimaryInjectionController(final AnotherBaseService test1Service) {
        this.constructorService = test1Service;
    }

    @GetMapping("/constructor")
    public String constructorInjectionTest() {
        return "Inject through constructor: " + constructorService.test();
    }
}
