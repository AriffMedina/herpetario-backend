package mx.edu.tecdesoftware.herpetario.persistence;

import mx.edu.tecdesoftware.herpetario.domain.Reptile;
import mx.edu.tecdesoftware.herpetario.domain.repository.ReptileRepository;
import mx.edu.tecdesoftware.herpetario.persistence.crud.ReptilCrudRepository;
import mx.edu.tecdesoftware.herpetario.persistence.mapper.ReptileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReptilRepository implements ReptileRepository {

    @Autowired
    private ReptilCrudRepository reptilCrudRepository;
    @Autowired
    private ReptileMapper reptileMapper;

    public List<Reptile> getAll() {
        return reptileMapper.toReptiles(reptilCrudRepository.findAll());
    }

    public List<Reptile> getBySpecies(int speciesId) {
        return reptileMapper.toReptiles(reptilCrudRepository.findByIdEspecieOrderByNombreAsc(speciesId));
    }

    public Optional<Reptile> getReptile(int reptileId) {
        return reptilCrudRepository.findById(reptileId).map(reptileMapper::toReptile);
    }

    public Reptile save(Reptile reptile) {
        return reptileMapper.toReptile(reptilCrudRepository.save(reptileMapper.toReptil(reptile)));
    }

    public void delete(int reptileId) {
        reptilCrudRepository.deleteById(reptileId);
    }
}
