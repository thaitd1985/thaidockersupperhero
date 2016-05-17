package thai.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import thai.model.SupperHero;

/**
 * Created by thai Tran on 5/16/16.
 */
@RepositoryRestResource
public interface SupperHeroRepository extends CrudRepository<SupperHero, String> {
//    public SupperHero findById(@Param(value = "id") Long id);
}
