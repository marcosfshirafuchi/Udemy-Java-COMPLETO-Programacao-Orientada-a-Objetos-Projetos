package com.educandoweb.course.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:s'Z'", timezone = "GMT")
    private Instant moment;

    //Quando coloca o @JsonIgnore traz os pedidos associados pelo Id do usuário
    //@JsonIgnore
    //Relacionamento muitos pedidos para um usuário
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order(){
    }

    public Order(Long id, Instant moment, User client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Order order)) return false;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
