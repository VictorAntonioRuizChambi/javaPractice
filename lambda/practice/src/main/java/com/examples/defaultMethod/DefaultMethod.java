package com.examples.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{
    
    @Override
    public void caminar() {
        System.out.println("Hola colegas");
    }

    @Override
    public void hablar() {
        PersonaA.super.hablar();
        PersonaB.super.hablar();
        System.out.println("Implementación personal del método repetido");
    }

    public static void main(String args[]){
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.caminar();
        defaultMethod.hablar();
    }

    


}
