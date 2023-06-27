package pl.altkom.springboot.lab02.injection.controller.model;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class Bread implements Product {
    @Override
    public int getPrice() {
        return 5;
    }
}
