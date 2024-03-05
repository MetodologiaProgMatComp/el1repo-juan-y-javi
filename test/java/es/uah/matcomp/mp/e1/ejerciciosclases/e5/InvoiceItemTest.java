package es.uah.matcomp.mp.e1.ejerciciosclases.e5;

import es.uah.matcomp.mp.e1.ejerciciosclases.e5.InvoiceItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem j = new InvoiceItem("B202", "desk_lamp", 10, 15.5);
        assertDoesNotThrow(() -> j.getId());
        assertEquals(j.getId(), "B202", "El id no es el esperado");
    }

    @Test
    void getDesc() {
        InvoiceItem j = new InvoiceItem("B202", "desk_lamp", 10, 15.5);
        assertDoesNotThrow(() -> j.getDesc());
        assertEquals(j.getDesc(), "desk_lamp", "La descripcion no es la esperada");
    }

    @Test
    void getQty() {
        InvoiceItem j = new InvoiceItem("B202", "desk_lamp", 10, 15.5);
        assertDoesNotThrow(() -> j.getQty());
        assertEquals(j.getQty(), 10, "La cantidad no es la esperada");
    }

    @Test
    void setQty() {
        InvoiceItem j = new InvoiceItem("B202", "desk_lamp", 10, 15.5);
        assertDoesNotThrow(() -> j.setQty(20));
        assertEquals(j.getQty(), 20, "La cantidad modificada no es la esperada");
    }

    @Test
    void getUnitPrice() {
        InvoiceItem j = new InvoiceItem("B202", "desk_lamp", 10, 15.5);
        assertDoesNotThrow(() -> j.getUnitPrice());
        assertEquals(j.getUnitPrice(), 15.5, "El precio por unidad no es el esperado");
    }

    @Test
    void setUnitPrice() {
        InvoiceItem j = new InvoiceItem("B202", "desk_lamp", 10, 15.5);
        assertDoesNotThrow(() -> j.setUnitPrice(29.99));
        assertEquals(j.getUnitPrice(), 29.99, "El precio por unidad modificado no es el esperado");
    }

    @Test
    void getTotal() {
        InvoiceItem j = new InvoiceItem("B202", "desk_lamp", 10, 15.5);
        assertDoesNotThrow(() -> j.getTotal());
        assertEquals(j.getTotal(), 10 * 15.5, "El precio total no es el esperado");
    }

    @Test
    void testToString() {
        InvoiceItem j = new InvoiceItem("B202", "desk_lamp", 10, 15.5);
        assertEquals(j.toString(), "InvoiceItem[id=B202, desc=desk_lamp, qty" + 10 + ", unitPrice" + 15.5 + "]");
    }
}