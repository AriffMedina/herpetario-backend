package mx.edu.tecdesoftware.herpetario.persistence.mapper;

import mx.edu.tecdesoftware.herpetario.domain.Species;
import mx.edu.tecdesoftware.herpetario.persistence.entity.Especie;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SpeciesMapper {
    @Mappings({
            @Mapping(source = "idEspecie", target = "speciesId"),
            @Mapping(source = "nombreComun", target = "commonName"),
            @Mapping(source = "nombreCientifico", target = "scientificName"),
            @Mapping(source = "frecuenciaAlimentacionDias", target = "feedingIntervalDays"),
            @Mapping(source = "tempMin", target = "minTemperature"),
            @Mapping(source = "tempMax", target = "maxTemperature"),
            @Mapping(source = "humedadMin", target = "minHumidity"),
            @Mapping(source = "humedadMax", target = "maxHumidity"),
            @Mapping(source = "dieta", target = "diet"),
            @Mapping(source = "estado", target = "active")
    })
    Species toSpecies(Especie especie);
    List<Species> toSpeciesList(List<Especie> especies);

    @InheritInverseConfiguration
    Especie toEspecie(Species species);
}
