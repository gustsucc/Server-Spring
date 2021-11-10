package example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "telefonos")
public interface Repor_Telefono extends CrudRepository<Telefono,Telef>{
    
}
