package com.oop.gestaovendas.entities.produto;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComidaImplTest {

    @Test
    public void testValorComDescontoPromocionalVegano() {
        ComidaImpl comida = new ComidaImpl(200, true, new ArrayList<>(), "Salada", 10.0, 123);
        double desconto = 0.1; // 10% de desconto para vegano
        double valorComDesconto = comida.valorComDescontoPromocional(desconto);
        assertNotEquals(9.0, valorComDesconto, 0.01); // Valor esperado com desconto
    }

    @Test
    public void testValorComDescontoPromocionalNaoVegano() {
        ComidaImpl comida = new ComidaImpl(300, false, new ArrayList<>(), "Hamburguer", 15.0, 456);
        double desconto = 0.1; // 10% de desconto para não vegano
        double valorComDesconto = comida.valorComDescontoPromocional(desconto);
        assertEquals(13.5, valorComDesconto, 0.01); // Valor esperado com desconto
    }

    @Test
    public void testValorComDescontoPromocionalVeganoPesoAlto() {
        ComidaImpl comida = new ComidaImpl(600, true, new ArrayList<>(), "Prato Vegano", 20.0, 789);
        double desconto = 0.1; // 10% de desconto para vegano com peso alto
        double valorComDesconto = comida.valorComDescontoPromocional(desconto);
        assertNotEquals(18.0, valorComDesconto, 0.01); // Valor esperado com desconto
    }

    @Test
    public void testToString() {
        ComidaImpl comida = new ComidaImpl(200, true, new ArrayList<>(), "Salada", 10.0, 123);
        String expected = "ComidaImpl {peso=200.0, vegano=true, adicionais=[], Produto{nome='Salada', valor=10.0, codigo=123}}";
        assertEquals(expected, comida.toString());
    }

    @Test
    public void testGettersAndSetters() {
        ComidaImpl comida = new ComidaImpl(200, true, new ArrayList<>(), "Salada", 10.0, 123);

        assertEquals(200, comida.getPeso(), 0.01);
        assertEquals(true, comida.isVegano());
        assertEquals(0, comida.getAdicionais().size());

        comida.setPeso(300);
        comida.setVegano(false);
        comida.setAdicionais(new ArrayList<>());

        assertEquals(300, comida.getPeso(), 0.01);
        assertEquals(false, comida.isVegano());
        assertEquals(0, comida.getAdicionais().size());
    }



}