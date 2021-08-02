package example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "grupos")
@CrossOrigin("*")
public interface RepoGrupos extends CrudRepository<Grupo,Long> {
    @Query("select a from Grupo a where docen=null")
    Iterable<Grupo> Grupos_Libres();
}
