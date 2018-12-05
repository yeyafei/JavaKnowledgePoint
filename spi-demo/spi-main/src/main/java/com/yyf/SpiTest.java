package com.yyf;

import java.util.ServiceLoader;

public class SpiTest {
    public static void main(String[] args) {
        ServiceLoader<Print> printerLoader = ServiceLoader.load(Print.class);
        for (Print print : printerLoader) {
            print.doSomething();
        }
    }
}
