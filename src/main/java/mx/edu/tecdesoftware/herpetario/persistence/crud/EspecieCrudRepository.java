package mx.edu.tecdesoftware.herpetario.persistence.crud;

import mx.edu.tecdesoftware.herpetario.persistence.entity.Especie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecieCrudRepository extends JpaRepository<Especie, Integer> {
}
