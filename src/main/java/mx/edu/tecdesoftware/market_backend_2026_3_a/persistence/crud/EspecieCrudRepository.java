package mx.edu.tecdesoftware.market_backend_2026_3_a.persistence.crud;

import mx.edu.tecdesoftware.market_backend_2026_3_a.persistence.entity.Especie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecieCrudRepository extends JpaRepository<Especie, Integer> {
}
