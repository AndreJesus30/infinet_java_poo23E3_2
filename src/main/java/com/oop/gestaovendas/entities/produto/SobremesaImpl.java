package com.oop.gestaovendas.entities.produto;

public class SobremesaImpl extends Produto {
    private float quantidade;
    private boolean doce;
    private boolean zeroAcucar;

    public SobremesaImpl(float quantidade, boolean doce, boolean zeroAcucar, String nome, double valor, int codigo) {
        super(nome, valor, codigo);
        this.quantidade = quantidade;
        this.doce = doce;
        this.zeroAcucar = zeroAcucar;
    }

    @Override
    public double valorComDescontoPromocional(double desconto) {
        double descontoFinal = 0.0;
        setValor(getValor() - (getValor() * descontoFinal));
        return getValor();
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDoce() {
        return doce;
    }

    public void setDoce(boolean doce) {
        this.doce = doce;
    }

    public boolean isZeroAcucar() {
        return zeroAcucar;
    }

    public void setZeroAcucar(boolean zeroAcucar) {
        this.zeroAcucar = zeroAcucar;
    }

    @Override
    public String toString() {
        return "SobremesaImpl {" +
                "quantidade=" + quantidade +
                ", doce=" + doce +
                ", zeroAcucar=" + zeroAcucar +
                ", " + super.toString() +
                '}';
    }
}
