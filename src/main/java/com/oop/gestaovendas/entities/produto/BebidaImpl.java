package com.oop.gestaovendas.entities.produto;
import com.oop.gestaovendas.entities.enums.TipoBebida;
import com.oop.gestaovendas.exceptions.ValorDeDescontoNegativo;

public class BebidaImpl extends Produto {

    private boolean gelada;
    private int tamanho;
    private TipoBebida marca;

    public BebidaImpl(boolean gelada, int tamanho, TipoBebida marca, String nome, double valor, int codigo) {
        super(nome, valor, codigo);
        this.gelada = gelada;
        this.tamanho = tamanho;
        this.marca = marca;
    }


    @Override
    public double valorComDescontoPromocional(double desconto) {
        try {
            super.verificarValor(desconto);
            if (marca == TipoBebida.Guarana) {
                double descontoFinal = desconto + 0.05;
                setValor(getValor() - (getValor() * descontoFinal));
                return getValor();
            } else if (marca == TipoBebida.CocaCola) {
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

    public boolean isGelada() {
        return gelada;
    }

    public void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public TipoBebida getMarca() {
        return marca;
    }

    public void setMarca(TipoBebida marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "BebidaImpl {" +
                "gelada=" + gelada +
                ", tamanho=" + tamanho +
                ", marca=" + marca +
                ", " + super.toString() +
                '}';
    }
}
