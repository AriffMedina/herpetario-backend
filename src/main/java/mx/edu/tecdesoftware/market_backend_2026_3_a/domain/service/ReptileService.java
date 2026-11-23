package mx.edu.tecdesoftware.market_backend_2026_3_a.domain.service;

import mx.edu.tecdesoftware.market_backend_2026_3_a.domain.Reptile;
import mx.edu.tecdesoftware.market_backend_2026_3_a.domain.repository.ReptileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReptileService {
    @Autowired
    private ReptileRepository reptileRepository;

    public List<Reptile> getAll() {
        return reptileRepository.getAll();
    }

    public List<Reptile> getBySpecies(int speciesId) {
        return reptileRepository.getBySpecies(speciesId);
    }

    public Optional<Reptile> getReptile(int reptileId) {
        return reptileRepository.getReptile(reptileId);
    }

    public Reptile save(Reptile reptile) {
        // Ignore any client-sent id so POST always creates
        reptile.setReptileId(null);
        return reptileRepository.save(reptile);
    }

    public Optional<Reptile> update(int reptileId, Reptile reptile) {
        if (getReptile(reptileId).isEmpty()) return Optional.empty();
        reptile.setReptileId(reptileId);
        return Optional.of(reptileRepository.save(reptile));
    }

    public boolean delete(int reptileId) {
        if (getReptile(reptileId).isEmpty()) return false;
        reptileRepository.delete(reptileId);
        return true;
    }
}
