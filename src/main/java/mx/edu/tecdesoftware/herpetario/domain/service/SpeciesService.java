package mx.edu.tecdesoftware.herpetario.domain.service;

import mx.edu.tecdesoftware.herpetario.domain.Species;
import mx.edu.tecdesoftware.herpetario.domain.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpeciesService {
    @Autowired
    private SpeciesRepository speciesRepository;

    public List<Species> getAll() {
        return speciesRepository.getAll();
    }

    public Optional<Species> getSpecies(int speciesId) {
        return speciesRepository.getSpecies(speciesId);
    }
}
