package com.example.RequestManagement.RequestManagement.Model.Map;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProponentDTO;
import com.example.RequestManagement.RequestManagement.Model.DTO.ProponentTypeDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProponentType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface IProponentTypeMap {
    @Mappings({
            @Mapping(source = "proponentTypeName", target = "proponentTypeName")
    })
    ProponentTypeDTO toProponentTypeDTO(ProponentType proponentType);
    List<ProponentTypeDTO> toDTOList(List<ProponentType> proponentType);
}
