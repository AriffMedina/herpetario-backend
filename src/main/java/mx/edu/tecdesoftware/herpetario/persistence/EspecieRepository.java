package mx.edu.tecdesoftware.herpetario.persistence;

import mx.edu.tecdesoftware.herpetario.domain.Species;
import mx.edu.tecdesoftware.herpetario.domain.repository.SpeciesRepository;
import mx.edu.tecdesoftware.herpetario.persistence.crud.EspecieCrudRepository;
import mx.edu.tecdesoftware.herpetario.persistence.mapper.SpeciesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EspecieRepository implements SpeciesRepository {

    @Autowired
    private EspecieCrudRepository especieCrudRepository;
    @Autowired
    private SpeciesMapper speciesMapper;

    public List<Species> getAll() {
        return speciesMapper.toSpeciesList(especieCrudRepository.findAll());
    }

    public Optional<Species> getSpecies(int speciesId) {
        return especieCrudRepository.findById(speciesId).map(speciesMapper::toSpecies);
    }
}
