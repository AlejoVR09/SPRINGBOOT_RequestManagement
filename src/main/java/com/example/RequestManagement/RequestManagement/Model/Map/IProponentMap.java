package com.example.RequestManagement.RequestManagement.Model.Map;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProponentDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.Proponent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface IProponentMap {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "representant.name", target = "representantName"),
            @Mapping(source = "documentType.documentTypeName", target = "documentType"),
            @Mapping(source = "proponentType.proponentTypeName", target = "proponentTypeName")
    })
    ProponentDTO toProponentDTO(Proponent proponent);
    List<ProponentDTO> toDTOList(List<Proponent> proponent);
}
