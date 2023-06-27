package pl.altkom.springboot.lab02.injection.controller.model;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class Butter implements Product {
    @Override
    public int getPrice() {
        return 4;
    }
}
