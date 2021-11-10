package example.demo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Rol {
    @Id
    private Long codr;
    @Column(length = 40,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private Boolean estado;
    @ManyToMany(mappedBy = "roles")
    private Set<Usuario> users;
    
    public Long getCodr() {
        return codr;
    }
    public void setCodr(Long codr) {
        this.codr = codr;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Set<Usuario> getUsers() {
        return users;
    }
    public void setUsers(Set<Usuario> users) {
        this.users = users;
    }
    public Rol() {
        estado=true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codr == null) ? 0 : codr.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Rol other = (Rol) obj;
        if (codr == null) {
            if (other.codr != null)
                return false;
        } else if (!codr.equals(other.codr))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Rol [codr=" + codr + ", estado=" + estado + ", nombre=" + nombre + ", users=" + users + "]";
    }

}
