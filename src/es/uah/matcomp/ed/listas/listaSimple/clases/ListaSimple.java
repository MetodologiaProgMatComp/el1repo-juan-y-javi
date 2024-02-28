package es.uah.matcomp.ed.listas.listaSimple.clases;

/**
 * Programar la lista simplemente enlazada.
 */
public class ListaSimple {
    private ElementoLS[] datos;
    private int maximo;

    public ListaSimple(int m) {
        this.maximo = m;
        this.datos = new ElementoLS[m];
    }

    public Boolean isVacia() {
        return this.datos[0] == null;
    }

    public void vaciar() {
        this.datos = new ElementoLS[maximo];
    }

    private int add(ElementoLS el) {
        int pos = 0;
        for (int i = 0; this.datos[i] != null; i++) {
            pos += 1;
        }
        this.datos[pos] = el;
        return pos;
    }

    public void add(String s) {
        ElementoLS e = new ElementoLS();
        e.setData(s);
        add(e);
    }

    public void add(Object o) {
        ElementoLS e = new ElementoLS();
        e.setData(o);
        add(e);
    }

    public void insert(Object o, int posicion) {
        ElementoLS e = new ElementoLS();
        e.setData(o);
        ElementoLS actual = this.datos[posicion];
        for (int i = posicion; this.datos[i] != null; i++) {
            ElementoLS siguiente = this.datos[i + 1];
            this.datos[i + 1] = actual;
            actual = siguiente;
        }
        this.datos[posicion] = e;
    }

    public void insert(String s, int posicion) {
        ElementoLS e = new ElementoLS();
        e.setData(s);
        ElementoLS actual = this.datos[posicion];
        for (int i = posicion; this.datos[i] != null; i++) {
            ElementoLS siguiente = this.datos[i + 1];
            this.datos[i + 1] = actual;
            actual = siguiente;
        }
        this.datos[posicion] = e;
    }

    public int del(int posicion) {
        this.datos[posicion] = null;
        int ultimo = 0;
        for (int i = posicion + 1; this.datos[i] != null; i++) {
            this.datos[i - 1] = this.datos[i];
            ultimo += 1;
        }
        return ultimo + posicion - 2;
    }

    public int getNumeroElementos() {
        int elms = 0;
        for (int i = 0; this.datos[i] != null; i++) {
            elms += 1;
        }
        return elms;
    }

    public int getPosicion(ElementoLS el) {
        int pos = 0;
        for (int i = 0; this.datos[i].getData() != el.getData(); i++) {
            pos += 1;
        }
        return pos;
    }

    public ElementoLS getPrimero() {
        return this.datos[0];
    }

    public ElementoLS getUltimo() {
        int pos = getNumeroElementos();
        return this.datos[pos - 1];
    }

    private ElementoLS getSiguiente(ElementoLS el) {
        int pos = getPosicion(el);
        return this.datos[pos + 1];
    }

    public ElementoLS getElemento(int posicion) {
        return this.datos[posicion];
    }
}
