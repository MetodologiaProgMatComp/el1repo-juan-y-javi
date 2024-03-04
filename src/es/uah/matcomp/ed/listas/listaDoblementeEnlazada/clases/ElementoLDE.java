package es.uah.matcomp.ed.listas.listaDoblementeEnlazada.clases;

public class ElementoLDE {
    private Object data;
    private ElementoLDE siguiente;
    private ElementoLDE anterior;

    protected void insertarmeEn(ElementoLDE el) {
        this.siguiente = el.siguiente;
        this.anterior = el;
        el.siguiente = this;
        if (this.siguiente != null)
            this.siguiente.anterior = this;
    }

    protected ElementoLDE getSiguiente() {
        return siguiente;
    }

    protected ElementoLDE getAnterior() {
        return anterior;
    }

    protected void setSiguiente(ElementoLDE el) {
        this.siguiente = el;
    }

    protected void setAnterior(ElementoLDE el) {
        this.anterior = el;
    }


    public Object getData() {
        return this.data;
    }

    public void setData(Object d) {
        this.data = d;
    }
}
