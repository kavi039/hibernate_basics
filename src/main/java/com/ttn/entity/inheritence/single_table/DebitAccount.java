package com.ttn.entity.inheritence.single_table;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("debitAccount")
public class DebitAccount extends Account{

    private Integer overdraftFee;

    public Integer getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(Integer overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
}
