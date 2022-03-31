package com.examples.scope;

import com.examples.Operacion;

public class Scope {
    
    private static double atributo1;
    private double atributo2; 


    public double probarLocalVariable(){
        final double n3 = 3;

        //Forma Tradicional
        /*
        Operacion operacion = new Operacion() {

            @Override
            public double calcularPromedio(double d1, double d2) {
                return d1 + d2 + n3;
            }
            
        };
        */

        Operacion operacion = (x, y) -> x + y + n3;

        return operacion.calcularPromedio(3, 8.7);
    }

    public double probarAtributosStaticVariables(){
        Operacion operacion = (x, y) -> {
            atributo1 = x + y;
            atributo2 = (x+y)/2;
            return atributo1 + atributo2;
        };

        return operacion.calcularPromedio(4, 6.7);
    }

    public static void main(String args[]) {
        Scope scope = new Scope();
        System.out.println(scope.probarLocalVariable());
        System.out.println(scope.probarAtributosStaticVariables());
    }
}
