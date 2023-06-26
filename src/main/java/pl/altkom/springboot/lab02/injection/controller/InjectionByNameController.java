package pl.altkom.springboot.lab02.injection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.altkom.springboot.lab02.injection.service.BaseService;

@RequestMapping("/injection/byName")
@RestController
public class InjectionByNameController {

    private final BaseService constructorService;

    public InjectionByNameController(final BaseService test1Service) {
        this.constructorService = test1Service;
    }

    @GetMapping("/constructor")
    public String constructorInjectionTest() {
        return "Inject through constructor: " + constructorService.test();
    }
}
