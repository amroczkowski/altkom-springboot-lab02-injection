package pl.altkom.springboot.lab02.injection.controller.model;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(Ordered.LOWEST_PRECEDENCE)
@Component
public class CocaCola implements Product {
    @Override
    public int getPrice() {
        return 8;
    }
}
