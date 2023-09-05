package com.oop.gestaovendas.entities.pedido;

import com.oop.gestaovendas.entities.produto.Produto;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private double codigo;
    private Solicitante solicitante;
    private List<Produto> listaDeProdutos;
    private String descricao;
    private LocalDateTime dataDoPedido;

    public Pedido(double codigo, Solicitante solicitante, List<Produto> listaDeProdutos, String descricao, LocalDateTime dataDoPedido) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.listaDeProdutos = listaDeProdutos;
        this.descricao = descricao;
        this.dataDoPedido = dataDoPedido;
    };

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(LocalDateTime dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pedido {" +
                "codigo=" + codigo +
                ", solicitante=" + solicitante +
                ", listaDeProdutos=" + listaDeProdutos +
                ", descricao='" + descricao + '\'' +
                ", dataDoPedido=" + dataDoPedido +
                '}';
    }
}
