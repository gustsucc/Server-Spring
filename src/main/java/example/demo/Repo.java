package example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Repo extends CrudRepository<Docente,Long> {

    Iterable<Docente> findByEmail(String string);
    
}
