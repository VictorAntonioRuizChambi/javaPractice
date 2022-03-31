package com.examples.defaultMethod;

public interface PersonaB {
    default public void hablar(){
        System.out.println("Buenas muchachos!!! --> PersonaB");
    }
}
