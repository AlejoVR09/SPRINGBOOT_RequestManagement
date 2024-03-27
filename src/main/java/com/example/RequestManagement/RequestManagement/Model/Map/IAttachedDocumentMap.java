package com.example.RequestManagement.RequestManagement.Model.Map;

import com.example.RequestManagement.RequestManagement.Model.DTO.AttachedDocumentDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.AttachedDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface IAttachedDocumentMap {
    @Mappings({
            @Mapping(source = "urlDocument", target = "urlDocument"),
            @Mapping(source = "documentName", target = "documentName")
    })
    AttachedDocumentDTO toAttachedDocumentDTO(AttachedDocument attachedDocument);
    List<AttachedDocumentDTO> toDTOList(List<AttachedDocument> documentTypeList);
}
