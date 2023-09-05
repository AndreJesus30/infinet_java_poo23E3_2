package com.oop.gestaovendas.exceptions;

public class ValorDeDescontoNegativo extends  Exception {

    public ValorDeDescontoNegativo() {
        super("O valor informado é negativo.");
    }

    public ValorDeDescontoNegativo(String mensagem) {
        super(mensagem);
    }


}
