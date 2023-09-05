package com.oop.gestaovendas.services;

import com.oop.gestaovendas.entities.pedido.Pedido;
import com.oop.gestaovendas.entities.pedido.Solicitante;
import com.oop.gestaovendas.entities.produto.Produto;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SolicitadorDeNovoPedidoServico {

    private Pedido pedido;
    private Set<Pedido> conjuntoDePedidos = new HashSet<>();

    public void setNovoPedido(
            Solicitante solicitante, List<Produto> listaDeProdutos,
            String descricao, LocalDateTime dataDoPedido
    ) {
        Random random = new Random();
        double codigo = random.nextDouble() * 1000000;
        this.pedido = new Pedido(codigo, solicitante, listaDeProdutos, descricao, dataDoPedido);
        conjuntoDePedidos.add(this.pedido);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Set<Pedido> getConjuntoDePedidos() {
        return conjuntoDePedidos;
    }

    @Override
    public String toString() {
        return "SolicitadorDeNovoPedidoServico {" +
                "pedido=" + pedido +
                ", conjuntoDePedidos=" + conjuntoDePedidos +
                '}';
    }
}
