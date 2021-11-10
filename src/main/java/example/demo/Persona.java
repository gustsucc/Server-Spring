package example.demo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Persona {
    @Id
    private Long cod_per;
    private String nombre;
    private String apellido;
    
    @OneToMany(mappedBy = "pers")
    private Set<Telefono> tels;

    @ManyToMany
    @JoinTable(name="escriben")
    private Set<Libros> escritos;

    public Long getCod_per() {
        return cod_per;
    }

    public void setCod_per(Long cod_per) {
        this.cod_per = cod_per;
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

    public Set<Telefono> getTels() {
        return tels;
    }

    public void setTels(Set<Telefono> tels) {
        this.tels = tels;
    }

    public Persona() {
    }
    
}
