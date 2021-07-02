package example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "grupos")
public interface RepoGrupos extends CrudRepository<Grupo,Long> {
    
}
