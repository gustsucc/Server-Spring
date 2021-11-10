package example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "autores")
public interface Repo_Persona extends CrudRepository<Persona,Long>{
    
}
