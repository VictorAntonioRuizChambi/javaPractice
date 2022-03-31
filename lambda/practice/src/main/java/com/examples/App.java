package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    private App() {
    }

    public void ordenar(){
        List<String> lista = new ArrayList<>();
        lista.add("Electropets");
        lista.add("Pets");
        lista.add("Electro");

        /* forma imperativa tradicional
        Collections.sort(lista, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
            
        });
        */

        //Primera forma de aplicar lambda
        Collections.sort(lista, (String s1, String s2 ) -> s1.compareTo(s2));
        for(String elemento: lista){
            System.out.println(elemento);
        }
    }
    
    public void calcular(){

        // FORMA IMPERATIVA
        /*
        Operacion operacion = new Operacion(){

            @Override
            public double calcularPromedio(double d1, double d2) {
                return (d1+d2)/2;
            }

        };
        System.out.println(operacion.calcularPromedio(2, 3));
        */

        //Lo mismo pero usando lambda
        Operacion operacion = (x,y) -> (x+y)/2;
        System.out.println(operacion.calcularPromedio(2, 3));
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App example = new App();
        example.ordenar();
        example.calcular();
    }
}
