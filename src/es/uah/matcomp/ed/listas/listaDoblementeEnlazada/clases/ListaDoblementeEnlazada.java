package es.uah.matcomp.ed.listas.listaDoblementeEnlazada.clases;

public class ListaDoblementeEnlazada {
    private ElementoLDE primero;
    private ElementoLDE ultimo;

    public ListaDoblementeEnlazada() {
        this.primero = null;
        this.ultimo = null;
    }

    public Boolean isVacia() {
        return this.primero == null;
    }

    public void vaciar() {
        this.primero = null;
        this.ultimo = null;
    }

    protected int add(ElementoLDE el) {
        int pos = 1;
        if (isVacia()) {
            this.primero = el;
            this.ultimo = el;
            return 0;
        } else {
            ElementoLDE actual = this.primero;
            while (actual != this.ultimo) {
                actual = actual.getSiguiente();
                pos += 1;
            }
            el.insertarmeEn(this.ultimo);
            this.ultimo = el;
            return pos;
        }
    }

    public void add(String s) {
        ElementoLDE e = new ElementoLDE();
        e.setData(s);
        add(e);
    }

    public void add(Object o) {
        ElementoLDE e = new ElementoLDE();
        e.setData(o);
        add(e);
    }

    public void insert(Object o, int posicion) {
        ElementoLDE objeto = new ElementoLDE();
        objeto.setData(o);
        objeto.insertarmeEn(getElemento(posicion - 1));
    }

    public void insert(String s, int posicion) {
        ElementoLDE objeto = new ElementoLDE();
        objeto.setData(s);
        objeto.insertarmeEn(getElemento(posicion - 1));
    }

    public int del(int posicion) {
        if (posicion == 0) {
            this.primero = this.primero.getSiguiente();
            this.primero.setAnterior(null);
        } else {
            ElementoLDE actual = this.primero;
            for (int i = 0; i != posicion ; i++) {
                actual = actual.getSiguiente();
                if (actual == this.ultimo) {
                    this.ultimo = actual.getAnterior();
                    return this.getNumeroElementos();
                }
            }
            actual.getSiguiente().setAnterior(actual.getAnterior());
            actual.getAnterior().setSiguiente(actual.getSiguiente());
        }
        return this.getNumeroElementos();
    }

    public int getNumeroElementos() {
        if (isVacia()) {
            return 0;
        } else {
            int elms = 1;
            ElementoLDE actual = this.primero;
            while (actual != this.ultimo) {
                elms += 1;
                actual = actual.getSiguiente();
            }
            return elms;
        }
    }

    public int getPosicion (ElementoLDE e){
        int pos = 0;
        ElementoLDE actual = this.primero;
        while (actual != e) {
            if (actual == null){
                System.out.println("El elemento no pertenece a la lista");
                return -1;
            }
            actual = actual.getSiguiente();
            pos += 1;
        }
        return pos;
    }

    public ElementoLDE getPrimero() {
        if (isVacia()){
            return null;
        } else {
            return this.primero;
        }
    }

    public ElementoLDE getUltimo () {
        if (isVacia()){
            return null;
        } else {
            return this.ultimo;
        }
    }

    public ElementoLDE getSiguiente (ElementoLDE el){
        return el.getSiguiente();
    }

    public ElementoLDE getElemento ( int posicion){
        if (isVacia()){
            System.out.println("La lista esta vacia, no contiene elementos");
            return null;
        } else {
            ElementoLDE actual = this.primero;
            for (int i = 0; i != posicion; i++) {
                actual = actual.getSiguiente();
            }
            return actual;
        }
    }
}