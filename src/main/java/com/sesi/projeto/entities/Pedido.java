package com.sesi.projeto.entities;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant momento;

    @Enumerated(EnumType.STRING)
    private StatusDoPedido status;

    @OneToMany(mappedBy = "id.pedido")
    private List<ItemDoPedido> itens;

    public Pedido() {}

    public Pedido(Long id, Instant momento, StatusDoPedido status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Instant getMomento() { return momento; }
    public void setMomento(Instant momento) { this.momento = momento; }

    public StatusDoPedido getStatus() { return status; }
    public void setStatus(StatusDoPedido status) { this.status = status; }

    public List<ItemDoPedido> getItens() { return itens; }
}
