package com.example.electropets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    
    public void listadoProductos(){
        List<String> listaProductos = new ArrayList<>();
        listaProductos.add("shampoo Ricocan");
        listaProductos.add("pechera lona #3");
        listaProductos.add("galón de limpiatodo");
        listaProductos.add("yee de 2");

        Collections.sort(listaProductos, (p1,p2) -> p1.compareTo(p2));

        for(String producto : listaProductos)
            System.out.println(producto);
    }

        
    public static void main(String args[]){
        Principal principal = new Principal();
        principal.listadoProductos();
    }
}
