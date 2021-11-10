package example.demo;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
public class Usuario {
    @Id
    @Column(length = 15)
    private String login;
    @Column(length = 15)
    private String clave;
    @ManyToMany
    private Set<Rol> roles;

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
   
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        result = prime * result + ((clave == null) ? 0 : clave.hashCode());
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
        Usuario other = (Usuario) obj;
        if (login == null) {
            if (other.login != null)
                return false;
        } else if (!login.equals(other.login))
            return false;
        if (clave == null) {
            if (other.clave != null)
                return false;
        } else if (!clave.equals(other.clave))
            return false;
        
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [clave=" + clave + ", login=" + login + "]";
    }
    public Usuario() {
    }
    
    public Usuario(String login, String clave) {
        this.login = login;
        this.clave = clave;
    }

    //Eventos JPA para operaciones previas a persistir en la BD
    @PrePersist
    public void nuevo() {
        clave= new BCryptPasswordEncoder().encode(clave);
        System.out.println("nuevo  "+login+" "+clave);
    }
    
    @PreUpdate
    public void actualizado() {
        clave= new BCryptPasswordEncoder().encode(clave);
        System.out.println("actualizado "+clave+" "+login);
    }
}
