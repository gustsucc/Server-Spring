package example.demo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Grupo {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Integer gestion;
    @Column(nullable = false, length = 10)
    private String identificador;
    @ManyToOne(optional = false)
    private Materia mat;
    @OneToMany(mappedBy = "grp")
    private Set<Nota> notas;
    @ManyToOne
    private Docente docen;
   
    public Docente getDocen() {
        return docen;
    }
    public void setDocen(Docente docen) {
        this.docen = docen;
    }
    public Set<Nota> getNotas() {
        return notas;
    }
    public void setNotas(Set<Nota> notas) {
        this.notas = notas;
    }
    public Materia getMat() {
        return mat;
    }
    public void setMat(Materia mat) {
        this.mat = mat;
    }
    public Grupo() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getGestion() {
        return gestion;
    }
    public void setGestion(Integer gestion) {
        this.gestion = gestion;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gestion == null) ? 0 : gestion.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
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
        Grupo other = (Grupo) obj;
        if (gestion == null) {
            if (other.gestion != null)
                return false;
        } else if (!gestion.equals(other.gestion))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (identificador == null) {
            if (other.identificador != null)
                return false;
        } else if (!identificador.equals(other.identificador))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Grupo [gestion=" + gestion + ", id=" + id + ", identificador=" + identificador + "]";
    }    
}
