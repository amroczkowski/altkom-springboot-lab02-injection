package pl.altkom.springboot.lab02.injection.controller.model;

public interface Product {

    int getPrice();

    default String getName() {
        return this.getClass().getName();
    }
}
