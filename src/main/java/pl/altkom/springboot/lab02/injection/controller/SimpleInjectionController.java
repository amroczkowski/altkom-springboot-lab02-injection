package pl.altkom.springboot.lab02.injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pl.altkom.springboot.lab02.injection.service.TestService;

@RequiredArgsConstructor
@RequestMapping("/injection")
@RestController
public class SimpleInjectionController {

    @Autowired
    private TestService propertyService;

    private TestService setterService;

    private final TestService constructorService;

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
    public void setSetterService(final TestService setterService) {
        this.setterService = setterService;
    }
}
