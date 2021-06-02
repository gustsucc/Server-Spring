package example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(catalog = "privado",name = "asignatura")
public class Materia {
    @Id
    @GeneratedValue
    private Long codigo;
    @Column(name = "identificador",length = 7,nullable = false,unique = true)
    private String sigla;
    @Column(name="nombre",length = 50)
    private String descrip;
    @ManyToOne(optional = true)
    private Docente doc;

    public Docente getDoc() {
        return doc;
    }
    public void setDoc(Docente doc) {
        this.doc = doc;
    }
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getDescrip() {
        return descrip;
    }
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((descrip == null) ? 0 : descrip.hashCode());
        result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
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
        Materia other = (Materia) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (descrip == null) {
            if (other.descrip != null)
                return false;
        } else if (!descrip.equals(other.descrip))
            return false;
        if (sigla == null) {
            if (other.sigla != null)
                return false;
        } else if (!sigla.equals(other.sigla))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Materia [codigo=" + codigo + ", descrip=" + descrip + ", sigla=" + sigla + "]";
    }

    public Materia() {
    }

    
}
