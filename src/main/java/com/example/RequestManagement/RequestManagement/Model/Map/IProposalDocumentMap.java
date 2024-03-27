package com.example.RequestManagement.RequestManagement.Model.Map;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProposalDocumentDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface IProposalDocumentMap {
    @Mappings({
            @Mapping(source = "attachedDocument.urlDocument", target = "attachedDocumentUrl"),
            @Mapping(source = "proposalDefinition.proposalDescription", target = "proposalDefinitionDescription"),
    })
    ProposalDocumentDTO toDTO(ProposalDocument proposalDocument);
    List<ProposalDocumentDTO> toDTOList(List<ProposalDocument> proposalDocumentList);
}
