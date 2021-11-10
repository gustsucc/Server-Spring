package example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(indexes = @Index(columnList = "est_ru,grp_id,num",unique = true))
public class Nota implements Serializable {
    @Id
    @GeneratedValue
    private Long num;
    @ManyToOne
    private Estudiante est;
    @ManyToOne
    private Grupo grp;
    @Column(length = 50, nullable = false)
    private String descripcion;
    @NonNull
    private Float ponderacion;
    private Float nota;

    public Long getNum() {
        return num;
    }
    public void setNum(Long num) {
        this.num = num;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((est == null) ? 0 : est.hashCode());
        result = prime * result + ((grp == null) ? 0 : grp.hashCode());
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
        Nota other = (Nota) obj;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (est == null) {
            if (other.est != null)
                return false;
        } else if (!est.equals(other.est))
            return false;
        if (grp == null) {
            if (other.grp != null)
                return false;
        } else if (!grp.equals(other.grp))
            return false;
        return true;
    }
    public Estudiante getEst() {
        return est;
    }
    public void setEst(Estudiante est) {
        this.est = est;
    }
    public Grupo getGrp() {
        return grp;
    }
    public void setGrp(Grupo grp) {
        this.grp = grp;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Float getPonderacion() {
        return ponderacion;
    }
    public void setPonderacion(Float ponderacion) {
        this.ponderacion = ponderacion;
    }
    public Float getNota() {
        return nota;
    }
    public void setNota(Float nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Nota [descripcion=" + descripcion + ", est=" + est + ", grp=" + grp + ", nota=" + nota
                + ", ponderacion=" + ponderacion + "]";
    }
    public Nota() {
    }
}
