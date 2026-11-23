package mx.edu.tecdesoftware.herpetario.domain.repository;

import mx.edu.tecdesoftware.herpetario.domain.Species;

import java.util.List;
import java.util.Optional;

public interface SpeciesRepository {
    List<Species> getAll();
    Optional<Species> getSpecies(int speciesId);
}
