package com.example.RequestManagement.RequestManagement.Model.Map;
import com.example.RequestManagement.RequestManagement.Model.DTO.RepresentantDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.Representant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface IRepresentantMap {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "document", target = "document"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "phone", target = "phone"),
            @Mapping(source = "documentType.documentTypeName", target = "documentTypeName")
    })

    RepresentantDTO toRepresentantDTO(Representant representant);
    List<RepresentantDTO> toDTOList(List<Representant> documentTypeList);
}
