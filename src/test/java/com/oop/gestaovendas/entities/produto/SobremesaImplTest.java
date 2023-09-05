package com.oop.gestaovendas.entities.produto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SobremesaImplTest {

    @Test
    public void testGettersAndSetters() {
        SobremesaImpl sobremesa = new SobremesaImpl(100, true, true, "Bolo", 12.0, 789);

        assertEquals(100, sobremesa.getQuantidade(), 0.01);
        assertEquals(true, sobremesa.isDoce());
        assertEquals(true, sobremesa.isZeroAcucar());

        sobremesa.setQuantidade(200);
        sobremesa.setDoce(false);
        sobremesa.setZeroAcucar(false);

        assertEquals(200, sobremesa.getQuantidade(), 0.01);
        assertEquals(false, sobremesa.isDoce());
        assertEquals(false, sobremesa.isZeroAcucar());
    }

    @Test
    public void testToString() {
        SobremesaImpl sobremesa = new SobremesaImpl(100, true, true, "Bolo", 12.0, 789);
        String expected = "SobremesaImpl {quantidade=100.0, doce=true, zeroAcucar=true, Produto{nome='Bolo', valor=12.0, codigo=789}}";
        assertEquals(expected, sobremesa.toString());
    }
}