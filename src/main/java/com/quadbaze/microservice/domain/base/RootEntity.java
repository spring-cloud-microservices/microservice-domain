package com.quadbaze.microservice.domain.base;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Olatunji O. Longe on 6/19/2016.
 */

@MappedSuperclass
public abstract class RootEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    @Transient
    protected HashCodeBuilder hashCoder(){
        HashPrimer primer = new HashPrimer(getId());
        return new HashCodeBuilder(primer.PRIME, primer.ID_PRIME);
    }

    @Transient
    protected EqualsBuilder equalizer(){
        return new EqualsBuilder();
    }

    @Override
    public String toString() {
        return String.format("%s: (id: %s)", this.getClass().getName(), this.getId());
    }

}