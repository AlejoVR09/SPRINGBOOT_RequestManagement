package com.example.RequestManagement.RequestManagement.Model.Map;

import com.example.RequestManagement.RequestManagement.Model.DTO.DocumentTypeDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.DocumentType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDocumentTypeMap {
    @Mappings(
            {
                    @Mapping(source = "idDocumentType", target = "idDocumentType"),
                    @Mapping(source = "documentTypeName", target = "documentTypeName"),
            }
    )
    DocumentTypeDTO toDocumentTypeDTO(DocumentType documentType);
    List<DocumentTypeDTO> toDTOList(List<DocumentType> documentTypeList);
}
