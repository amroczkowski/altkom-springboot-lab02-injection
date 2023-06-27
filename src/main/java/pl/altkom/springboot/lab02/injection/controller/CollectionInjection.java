package pl.altkom.springboot.lab02.injection.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pl.altkom.springboot.lab02.injection.controller.model.Product;

@RequiredArgsConstructor
@RequestMapping("/injection/collection")
@RestController
public class CollectionInjection {

    private final Collection<Product> products;

    @GetMapping
    public void test() {
        products.forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
    }
}
