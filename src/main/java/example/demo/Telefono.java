package example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(value = Telef.class)
public class Telefono implements Serializable {
    @ManyToOne
    @Id
    private Persona pers;
    @Id
    private String numero;
    public Persona getPers() {
        return pers;
    }
    public void setPers(Persona pers) {
        this.pers = pers;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Telefono() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((pers == null) ? 0 : pers.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Telefono other = (Telefono) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (pers == null) {
            if (other.pers != null)
                return false;
        } else if (!pers.equals(other.pers))
            return false;
        return true;
    }
    
}
