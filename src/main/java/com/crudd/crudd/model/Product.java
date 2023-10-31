package com.crudd.crudd.model;


import ch.qos.logback.core.joran.spi.NoAutoStart;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serial;
import java.math.BigDecimal;

@Entity
@Table(name="tb_product", schema = "public")
public class Product {

    @Serial
    private static final long SerialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    long id;

    @NotNull
    String name;

    @NotNull
    private BigDecimal quantity;

    @NotNull
    private BigDecimal value;

    public Product(){}

    public Product(long id, String name, BigDecimal quantity, BigDecimal value) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
