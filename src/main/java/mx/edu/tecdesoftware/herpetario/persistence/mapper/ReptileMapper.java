package mx.edu.tecdesoftware.herpetario.persistence.mapper;

import mx.edu.tecdesoftware.herpetario.domain.Reptile;
import mx.edu.tecdesoftware.herpetario.persistence.entity.Reptil;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SpeciesMapper.class})
public interface ReptileMapper {
    @Mappings({
            @Mapping(source = "idReptil", target = "reptileId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idEspecie", target = "speciesId"),
            @Mapping(source = "sexo", target = "sex"),
            @Mapping(source = "fechaNacimiento", target = "birthDate"),
            @Mapping(source = "pesoGramos", target = "weightGrams"),
            @Mapping(source = "ultimaAlimentacion", target = "lastFeeding"),
            @Mapping(source = "imageUrl", target = "imageUrl"),
            @Mapping(source = "notas", target = "notes"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "especie", target = "species")
    })
    Reptile toReptile(Reptil reptil);
    List<Reptile> toReptiles(List<Reptil> reptiles);

    @InheritInverseConfiguration
    @Mapping(target = "especie", ignore = true)
    Reptil toReptil(Reptile reptile);
}
