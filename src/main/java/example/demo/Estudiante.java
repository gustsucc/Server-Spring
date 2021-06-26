package example.demo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Estudiante {
    @Id
    private Long RU;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String apellido;
    @Column(length = 30)
    private String email;
    private byte[] foto;
    @OneToOne
    private Usuario usr;
    @OneToMany(mappedBy = "est")
    private Set<Nota> calificaciones;
    
    
    public Set<Nota> getCalificaciones() {
        return calificaciones;
    }
    public void setCalificaciones(Set<Nota> calificaciones) {
        this.calificaciones = calificaciones;
    }
    public Long getRU() {
        return RU;
    }
    public void setRU(Long rU) {
        RU = rU;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public byte[] getFoto() {
        return foto;
    }
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public Usuario getUsr() {
        return usr;
    }
    public void setUsr(Usuario usr) {
        this.usr = usr;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((RU == null) ? 0 : RU.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        Estudiante other = (Estudiante) obj;
        if (RU == null) {
            if (other.RU != null)
                return false;
        } else if (!RU.equals(other.RU))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
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
        return "Estudiante [RU=" + RU + ", apellido=" + apellido + ", email=" + email + ", nombre=" + nombre + ", usr="
                + usr + "]";
    }
}
