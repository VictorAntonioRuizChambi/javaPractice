package com.examples.defaultMethod;

public interface PersonaA {
    public void caminar();

    default public void hablar(){
        System.out.println("Buenas muchachos!!! --> PersonaA");
    }
}
