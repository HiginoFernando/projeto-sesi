package com.sesi.projeto.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_do_pedido")
public class ItemDoPedido {

    @EmbeddedId
    private ItemDoPedidoPK id = new ItemDoPedidoPK();

    private int quantidade;
    private double preco;

    public ItemDoPedido() {}

    public ItemDoPedido(Pedido pedido, Produto produto, int quantidade, double preco) {
        this.id.setPedido(pedido);
        this.id.setProduto(produto);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public ItemDoPedidoPK getId() { return id; }
    public void setId(ItemDoPedidoPK id) { this.id = id; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}
