package example.demo;

import java.io.Serializable;

public class Telef implements Serializable {
    public Persona pers;
    public String numero;

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
        Telef other = (Telef) obj;
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
