package pl.altkom.springboot.lab02.injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.altkom.springboot.lab02.injection.service.BaseService;

@RequestMapping("/injection/qualifier")
@RestController
public class Test2QualifierInjectionController {

    @Autowired
    @Qualifier("test1Service")
    private BaseService propertyService;

    private BaseService setterService;

    private final BaseService constructorService;

    public Test2QualifierInjectionController(@Qualifier("test1Service") final BaseService constructorService) {
        this.constructorService = constructorService;
    }

    @GetMapping("/property")
    public String propertyInjectionTest() {
        return "Inject through property: " + propertyService.test();
    }

    @GetMapping("/setter")
    public String setterInjectionTest() {
        return "Inject through setter: " + setterService.test();
    }

    @GetMapping("/constructor")
    public String constructorInjectionTest() {
        return "Inject through constructor: " + constructorService.test();
    }

    @Autowired
    @Qualifier("test1Service")
    public void setSetterService(final BaseService setterService) {
        this.setterService = setterService;
    }
}
