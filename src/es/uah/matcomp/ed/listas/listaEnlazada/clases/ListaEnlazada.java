package es.uah.matcomp.ed.listas.listaEnlazada.clases;

public class ListaEnlazada {
    private ElementoLE primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    public Boolean isVacia() {
        return this.primero == null;
    }

    public void vaciar() {
        this.primero = null;
    }

    protected int add(ElementoLE el) {
        int pos = 1;
        if (isVacia()) {
            this.primero = el;
            return 0;
        } else {
            ElementoLE actual = this.primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
                pos += 1;
            }
            el.insertarmeEn(actual);
            return pos;
        }
    }

    public void add(String s) {
        ElementoLE e = new ElementoLE();
        e.setData(s);
        add(e);
    }

    public void add(Object o) {
        ElementoLE e = new ElementoLE();
        e.setData(o);
        add(e);
    }

    public void insert(Object o, int posicion) {
        ElementoLE objeto = new ElementoLE();
        objeto.setData(o);
        objeto.insertarmeEn(getElemento(posicion-1));
    }

    public void insert(String s, int posicion) {
        ElementoLE objeto = new ElementoLE();
        objeto.setData(s);
        objeto.insertarmeEn(getElemento(posicion-1));
    }

    public int del(int posicion) {
        if (posicion == 0) {
            this.primero = this.primero.getSiguiente();
            return this.getNumeroElementos();
        } else {
            ElementoLE actual = this.primero;
            for (int i = 0; i != posicion - 1; i++) {
                actual = actual.getSiguiente();
                if (actual.getSiguiente().getSiguiente() == null) {
                    actual.setSiguiente(null);
                    return this.getNumeroElementos();
                }
            }
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return this.getNumeroElementos();
        }
    }

    public int getNumeroElementos() {
        int elms = 0;
        ElementoLE actual = this.primero;
        while (actual != null) {
            elms += 1;
            actual = actual.getSiguiente();
        }
        return elms;
    }

    public int getPosicion(ElementoLE el) {
        int pos = 0;
        ElementoLE actual = this.primero;
        while (actual != el) {
            actual = actual.getSiguiente();
            pos += 1;
        }
        return pos;
    }

    public ElementoLE getPrimero() {
        return this.primero;
    }

    public ElementoLE getUltimo() {
        ElementoLE actual = this.primero;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public ElementoLE getSiguiente(ElementoLE el) {
        return el.getSiguiente();
    }

    public ElementoLE getElemento(int posicion) {
        ElementoLE actual = this.primero;
        for (int i = 0; i != posicion; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }
}
