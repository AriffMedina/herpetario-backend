package mx.edu.tecdesoftware.market_backend_2026_3_a.domain;

import java.time.LocalDate;

public class Reptile {
    private Integer reptileId;
    private String name;
    private Integer speciesId;
    private String sex;
    private LocalDate birthDate;
    private Double weightGrams;
    private LocalDate lastFeeding;
    private String imageUrl;
    private String notes;
    private Boolean active;
    private Species species;

    public Integer getReptileId() { return reptileId; }
    public void setReptileId(Integer reptileId) { this.reptileId = reptileId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getSpeciesId() { return speciesId; }
    public void setSpeciesId(Integer speciesId) { this.speciesId = speciesId; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public Double getWeightGrams() { return weightGrams; }
    public void setWeightGrams(Double weightGrams) { this.weightGrams = weightGrams; }

    public LocalDate getLastFeeding() { return lastFeeding; }
    public void setLastFeeding(LocalDate lastFeeding) { this.lastFeeding = lastFeeding; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }

    public Species getSpecies() { return species; }
    public void setSpecies(Species species) { this.species = species; }
}
