package com.examples;

public class Sintaxis {
    
    public double probarSintaxis(){

        // 1ra Forma Lambda
        // Operacion operacion = (double x, double y) -> (x+y)/2;
        // return operacion2.calcularPromedio(3, 6);

        // 2da Forma Lambda
        // Operacion operacion = (double x, double y) -> {return (x+y)/2;};
        // return operacion2.calcularPromedio(3, 6);

        // 3ra Forma de Lambda
        /*
        Operacion operacion = (double x, double y) -> {
            double a =  2.0;
            System.out.println(a);
            return (x+y)/2;
        };
        return operacion2.calcularPromedio(3, 6);
        */

        //4ta Forma de Lambda
        //Operacion operacion = (x,y) -> (x+y)/2;
        // return operacion2.calcularPromedio(3, 6);
        
        //5ta Forma de Lambda
        // Operacion2 operacion2 = () ->2;
        // return operacion2.calcularPromedio();

        //6ta Forma de Lambda
        Operacion2 operacion2 = () -> {
            double x =3.4;
            double y = 4.5;
            return (x+y)/2;
        };
        return operacion2.calcularPromedio();

        // 7ma Forma de Lambda
        /*
        Operacion operacion = (x, y) -> {
            double a =  2.0;
            System.out.println(a);
            return (x+y)/2;
        };
        return operacion2.calcularPromedio(3, 6);
        */
    }

    public static void main(String args[]){
        Sintaxis sintaxis = new Sintaxis();
        System.out.println(sintaxis.probarSintaxis());
    }
}
