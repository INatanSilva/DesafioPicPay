package tech.buildrun.picpay.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_transfer")
public class transfer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "wallet_sander_id")
    private wallet sander;

    @ManyToOne
    @JoinColumn(name = "wallet_receiver_id")
    private wallet receiver;

    @Column(name = "value")
    private BigDecimal value;

    public transfer() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public wallet getSander() {
        return sander;
    }

    public void setSander(wallet sander) {
        this.sander = sander;
    }

    public wallet getReceiver() {
        return receiver;
    }

    public void setReceiver(wallet receiver) {
        this.receiver = receiver;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
