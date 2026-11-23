package mx.edu.tecdesoftware.market_backend_2026_3_a.domain.repository;

import mx.edu.tecdesoftware.market_backend_2026_3_a.domain.Species;

import java.util.List;
import java.util.Optional;

public interface SpeciesRepository {
    List<Species> getAll();
    Optional<Species> getSpecies(int speciesId);
}
