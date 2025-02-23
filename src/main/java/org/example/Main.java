package org.example;

import org.example.configuration.HibernateConfig;

public class Main {
    public static void main(String[] args) {
        HibernateConfig.getSessionFactory();
        System.out.println("Hello World!");
    }
}