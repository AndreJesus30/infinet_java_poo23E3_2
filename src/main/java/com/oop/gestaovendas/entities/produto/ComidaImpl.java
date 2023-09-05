package com.oop.gestaovendas.entities.produto;
import com.oop.gestaovendas.entities.enums.AdicionaisComida;
import com.oop.gestaovendas.exceptions.ValorDeDescontoNegativo;

import java.util.ArrayList;

public class ComidaImpl extends Produto {
    private float peso;
    private boolean vegano;
    private ArrayList<AdicionaisComida> adicionais;


    public ComidaImpl(float peso, boolean vegano, ArrayList<AdicionaisComida> adicionais, String nome, double valor, int codigo) {
        super(nome, valor, codigo);
        this.peso = peso;
        this.vegano = vegano;
        this.adicionais = adicionais;
    }


    @Override
    public double valorComDescontoPromocional(double desconto) {
       try {
           super.verificarValor(desconto);
           if (vegano) {
               double descontoFinal = desconto + 0.05;
               setValor(getValor() - (getValor() * descontoFinal));
               return getValor();
           } else if (vegano && (peso > 500)) {
               double descontoFinal = desconto + 0.07;
               setValor(getValor() - (getValor() * descontoFinal));
               return getValor();
           } else {
               setValor(getValor() - (getValor() * desconto));
               return getValor();
           }
       } catch (ValorDeDescontoNegativo e ) {
           System.out.println("Erro: " + e.getMessage());
       }

    return getValor();
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public ArrayList<AdicionaisComida> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(ArrayList<AdicionaisComida> adicionais) {
        this.adicionais = adicionais;
    }

    @Override
    public String toString() {
        return "ComidaImpl {" +
                "peso=" + peso +
                ", vegano=" + vegano +
                ", adicionais=" + adicionais +
                ", " + super.toString() +
                '}';
    }
}
