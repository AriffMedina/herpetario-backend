package mx.edu.tecdesoftware.herpetario.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import mx.edu.tecdesoftware.herpetario.domain.Reptile;
import mx.edu.tecdesoftware.herpetario.domain.service.ReptileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reptiles")
@Tag(name = "Reptile", description = "Manage the reptiles in the herpetarium")
public class ReptileController {

    private static final String EXAMPLE = """
            {
              "name": "Mango",
              "speciesId": 1,
              "sex": "F",
              "birthDate": "2024-03-15",
              "weightGrams": 55.0,
              "lastFeeding": "2026-11-21",
              "notes": "Shed last week",
              "active": true
            }
            """;

    @Autowired
    private ReptileService reptileService;

    @GetMapping("")
    @Operation(summary = "Get all reptiles")
    @ApiResponse(responseCode = "200", description = "Successful retrieval of reptiles")
    public ResponseEntity<List<Reptile>> getAll() {
        return ResponseEntity.ok(reptileService.getAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a reptile by its id")
    @ApiResponse(responseCode = "200", description = "Reptile found")
    @ApiResponse(responseCode = "404", description = "Reptile not found")
    public ResponseEntity<Reptile> getReptile(@PathVariable("id") int reptileId) {
        return reptileService.getReptile(reptileId).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/species/{speciesId}")
    @Operation(summary = "Get reptiles of a species", description = "Ordered by name; backs the species filter")
    @ApiResponse(responseCode = "200", description = "Reptiles of the species (may be empty)")
    public ResponseEntity<List<Reptile>> getBySpecies(@PathVariable("speciesId") int speciesId) {
        return ResponseEntity.ok(reptileService.getBySpecies(speciesId));
    }

    @PostMapping("")
    @Operation(summary = "Register a new reptile",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(required = true,
                    content = @Content(examples = @ExampleObject(name = "Example reptile", value = EXAMPLE))))
    @ApiResponse(responseCode = "201", description = "Reptile created")
    @ApiResponse(responseCode = "400", description = "Missing name or speciesId")
    public ResponseEntity<Reptile> save(@RequestBody Reptile reptile) {
        if (!isValid(reptile)) return ResponseEntity.badRequest().build();
        return new ResponseEntity<>(reptileService.save(reptile), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a reptile")
    @ApiResponse(responseCode = "200", description = "Reptile updated")
    @ApiResponse(responseCode = "400", description = "Missing name or speciesId")
    @ApiResponse(responseCode = "404", description = "Reptile not found")
    public ResponseEntity<Reptile> update(@PathVariable("id") int reptileId, @RequestBody Reptile reptile) {
        if (!isValid(reptile)) return ResponseEntity.badRequest().build();
        return reptileService.update(reptileId, reptile).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a reptile")
    @ApiResponse(responseCode = "200", description = "Reptile deleted")
    @ApiResponse(responseCode = "404", description = "Reptile not found")
    public ResponseEntity<Void> delete(@PathVariable("id") int reptileId) {
        return reptileService.delete(reptileId) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    // Name and species are the only fields the app cannot work without
    private boolean isValid(Reptile reptile) {
        return reptile.getName() != null && !reptile.getName().isBlank() && reptile.getSpeciesId() != null;
    }
}
