package org.example.Ex5.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemConfig {
    @Value("Le Duc")
    private String name;

    public void displayConfig() {
        System.out.println("Name : " + name);
    }
}
