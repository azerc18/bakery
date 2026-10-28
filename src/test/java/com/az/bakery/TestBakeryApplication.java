package com.az.bakery;

import org.springframework.boot.SpringApplication;

public class TestBakeryApplication {

    public static void main(String[] args) {
        SpringApplication.from(BakeryApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
