package com.oop.gestaovendas.entities.produto;

import com.oop.gestaovendas.entities.enums.TipoBebida;
import com.oop.gestaovendas.exceptions.ValorDeDescontoNegativo;

abstract public class Produto {

    private String nome;
    private double valor;
    private int codigo;

   public Produto(String nome, double valor, int codigo){
       this.nome = nome;
       this.valor = valor;
       this.codigo = codigo;
   }

   abstract public double valorComDescontoPromocional(double desconto);

    public void verificarValor(double desconto) throws ValorDeDescontoNegativo {
        if (desconto < 0) {
            throw new ValorDeDescontoNegativo("Desconto não aplicado, o valor não pode ser negativo: " + desconto);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setMarca(TipoBebida cocaCola) {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", codigo=" + codigo +
                '}';
    }
}
