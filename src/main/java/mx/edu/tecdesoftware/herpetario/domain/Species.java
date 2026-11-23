package mx.edu.tecdesoftware.market_backend_2026_3_a.domain;

public class Species {
    private Integer speciesId;
    private String commonName;
    private String scientificName;
    private Integer feedingIntervalDays;
    private Double minTemperature;
    private Double maxTemperature;
    private Integer minHumidity;
    private Integer maxHumidity;
    private String diet;
    private Boolean active;

    public Integer getSpeciesId() { return speciesId; }
    public void setSpeciesId(Integer speciesId) { this.speciesId = speciesId; }

    public String getCommonName() { return commonName; }
    public void setCommonName(String commonName) { this.commonName = commonName; }

    public String getScientificName() { return scientificName; }
    public void setScientificName(String scientificName) { this.scientificName = scientificName; }

    public Integer getFeedingIntervalDays() { return feedingIntervalDays; }
    public void setFeedingIntervalDays(Integer feedingIntervalDays) { this.feedingIntervalDays = feedingIntervalDays; }

    public Double getMinTemperature() { return minTemperature; }
    public void setMinTemperature(Double minTemperature) { this.minTemperature = minTemperature; }

    public Double getMaxTemperature() { return maxTemperature; }
    public void setMaxTemperature(Double maxTemperature) { this.maxTemperature = maxTemperature; }

    public Integer getMinHumidity() { return minHumidity; }
    public void setMinHumidity(Integer minHumidity) { this.minHumidity = minHumidity; }

    public Integer getMaxHumidity() { return maxHumidity; }
    public void setMaxHumidity(Integer maxHumidity) { this.maxHumidity = maxHumidity; }

    public String getDiet() { return diet; }
    public void setDiet(String diet) { this.diet = diet; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
