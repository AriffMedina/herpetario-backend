package mx.edu.tecdesoftware.market_backend_2026_3_a.domain.repository;

import mx.edu.tecdesoftware.market_backend_2026_3_a.domain.Reptile;

import java.util.List;
import java.util.Optional;

public interface ReptileRepository {
    List<Reptile> getAll();
    List<Reptile> getBySpecies(int speciesId);
    Optional<Reptile> getReptile(int reptileId);
    Reptile save(Reptile reptile);
    void delete(int reptileId);
}
