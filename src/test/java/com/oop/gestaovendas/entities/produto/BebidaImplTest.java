package com.oop.gestaovendas.entities.produto;

import com.oop.gestaovendas.entities.enums.TipoBebida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaImplTest {

    @Test
    public void testValorComDescontoPromocionalGuarana() {
        BebidaImpl guarana = new BebidaImpl(true, 500, TipoBebida.Guarana, "Guaraná", 3.0, 123);
        double desconto = 0.1;
        double valorComDesconto = guarana.valorComDescontoPromocional(desconto);
        assertNotEquals(2.7, valorComDesconto, 0.01); // Valor esperado com desconto adicional por ser Guarana
    }

    @Test
    public void testValorComDescontoPromocionalCocaCola() {
        BebidaImpl cocaCola = new BebidaImpl(true, 500, TipoBebida.CocaCola, "Coca-Cola", 3.0, 456);
        double desconto = 0.1;
        double valorComDesconto = cocaCola.valorComDescontoPromocional(desconto);
        assertNotEquals(2.7, valorComDesconto, 0.01); // Valor esperado com desconto adicional por ser Coca Cola
    }

    @Test
    public void testValorComDescontoPromocionalOutrasMarcas() {
        BebidaImpl fanta = new BebidaImpl(true, 500, TipoBebida.Fanta, "Fanta", 3.0, 789);
        double desconto = 0.1;
        double valorComDesconto = fanta.valorComDescontoPromocional(desconto);
        assertEquals(2.7, valorComDesconto, 0.01); // Valor esperado com desconto
    }

    @Test
    public void testToString() {
        BebidaImpl bebida = new BebidaImpl(true, 500, TipoBebida.Guarana, "Guaraná", 3.0, 123);
        String expected = "BebidaImpl {gelada=true, tamanho=500, marca=Guarana, Produto{nome='Guaraná', valor=3.0, codigo=123}}";
        assertEquals(expected, bebida.toString());
    }

    @Test
    public void testGettersAndSetters() {
        BebidaImpl bebida = new BebidaImpl(true, 500, TipoBebida.Guarana, "Guaraná", 3.0, 123);

        assertEquals(true, bebida.isGelada());
        assertEquals(500, bebida.getTamanho());
        assertEquals(TipoBebida.Guarana, bebida.getMarca());

        bebida.setGelada(false);
        bebida.setTamanho(750);
        bebida.setMarca(TipoBebida.CocaCola);

        assertEquals(false, bebida.isGelada());
        assertEquals(750, bebida.getTamanho());
        assertEquals(TipoBebida.CocaCola, bebida.getMarca());
    }
}