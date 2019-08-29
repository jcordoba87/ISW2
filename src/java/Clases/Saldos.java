/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JUAN CAMILO
 */
@Entity
@Table(name = "Saldos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Saldos.findAll", query = "SELECT s FROM Saldos s"),
    @NamedQuery(name = "Saldos.findBySaldo", query = "SELECT s FROM Saldos s WHERE s.saldo = :saldo")})
public class Saldos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Saldo")
    private Double saldo;

    public Saldos() {
    }

    public Saldos(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saldo != null ? saldo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saldos)) {
            return false;
        }
        Saldos other = (Saldos) object;
        if ((this.saldo == null && other.saldo != null) || (this.saldo != null && !this.saldo.equals(other.saldo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clases.Saldos[ saldo=" + saldo + " ]";
    }
    
}
