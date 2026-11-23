package mx.edu.tecdesoftware.herpetario.persistence.crud;

import mx.edu.tecdesoftware.herpetario.persistence.entity.Reptil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReptilCrudRepository extends JpaRepository<Reptil, Integer> {

    // Backs the species filter chips in the app
    List<Reptil> findByIdEspecieOrderByNombreAsc(int idEspecie);
}
