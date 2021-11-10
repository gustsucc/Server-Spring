package example.demo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Libros {
    @Id
    private Long cod_lib;
    private String Titulo;
    @ManyToMany(mappedBy = "escritos")
    private Set<Persona> autores;
    
    public Long getCod_lib() {
        return cod_lib;
    }
    public void setCod_lib(Long cod_lib) {
        this.cod_lib = cod_lib;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public Libros() {
    }
    public Set<Persona> getAutores() {
        return autores;
    }
    public void setAutores(Set<Persona> autores) {
        this.autores = autores;
    }
    
}
