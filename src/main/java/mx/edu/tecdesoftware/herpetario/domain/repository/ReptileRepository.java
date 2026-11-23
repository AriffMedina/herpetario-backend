package mx.edu.tecdesoftware.herpetario.domain.repository;

import mx.edu.tecdesoftware.herpetario.domain.Reptile;

import java.util.List;
import java.util.Optional;

public interface ReptileRepository {
    List<Reptile> getAll();
    List<Reptile> getBySpecies(int speciesId);
    Optional<Reptile> getReptile(int reptileId);
    Reptile save(Reptile reptile);
    void delete(int reptileId);
}
