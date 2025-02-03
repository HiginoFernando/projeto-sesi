package com.sesi.projeto.entities;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant momento;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    public Pagamento() {}

    public Pagamento(Long id, Instant momento, Pedido pedido) {
        this.id = id;
        this.momento = momento;
        this.pedido = pedido;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Instant getMomento() { return momento; }
    public void setMomento(Instant momento) { this.momento = momento; }

    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }
}
