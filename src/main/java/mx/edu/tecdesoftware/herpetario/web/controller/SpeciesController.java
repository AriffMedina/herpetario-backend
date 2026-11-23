package mx.edu.tecdesoftware.herpetario.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import mx.edu.tecdesoftware.herpetario.domain.Species;
import mx.edu.tecdesoftware.herpetario.domain.service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/species")
@Tag(name = "Species", description = "Reptile species and their care requirements")
public class SpeciesController {

    @Autowired
    private SpeciesService speciesService;

    @GetMapping("")
    @Operation(summary = "Get all species", description = "Return every species with its care requirements")
    @ApiResponse(responseCode = "200", description = "Successful retrieval of species")
    public ResponseEntity<List<Species>> getAll() {
        return ResponseEntity.ok(speciesService.getAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a species by its id")
    @ApiResponse(responseCode = "200", description = "Species found")
    @ApiResponse(responseCode = "404", description = "Species not found")
    public ResponseEntity<Species> getSpecies(@PathVariable("id") int speciesId) {
        return speciesService.getSpecies(speciesId).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
