package mx.edu.tecdesoftware.market_backend_2026_3_a.persistence.crud;

import mx.edu.tecdesoftware.market_backend_2026_3_a.persistence.entity.Reptil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReptilCrudRepository extends JpaRepository<Reptil, Integer> {

    // Backs the species filter chips in the app
    List<Reptil> findByIdEspecieOrderByNombreAsc(int idEspecie);
}
