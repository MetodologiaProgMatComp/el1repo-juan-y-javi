/**
package es.uah.matcomp.ed.listas.listaSimple; /**
 * Programa principal de prueba

import es.uah.matcomp.ed.lineales.lista.simple.*;
import es.uah.matcomp.ed.listas.listaSimple.clases.ElementoLS;
import es.uah.matcomp.ed.listas.listaSimple.clases.ListaSimple;

public class main {
    public static void main(String[] s){
        ListaSimple l = new ListaSimple();

        l.add("Primer elemento");
        l.add("Segundo elemento");
        ElementoLS elemento = l.getElemento(1);
        System.out.println(elemento.getData());
        System.out.println("Datos detallados");
        System.out.println(elemento);
        l.add("entre el primero y el segundo",1);

    }
}
*/