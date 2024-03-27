package com.example.RequestManagement.RequestManagement.Model.Map;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProposalDefinitionDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalDefinition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface IProposalDefinitionMap {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "proposalDescription", target = "proposalDescription"),
            @Mapping(source = "descriptionActivities", target = "descriptionActivities"),
            @Mapping(source = "startEventDate", target = "startEventDate"),
            @Mapping(source = "presentation", target = "presentation"),
            @Mapping(source = "proposalName", target = "proposalName"),
            @Mapping(source = "benefited", target = "benefited"),
            @Mapping(source = "proponent.name", target = "proponentName"),
            @Mapping(source = "valueProposal.totalValue", target = "valueProposal")
    })
    ProposalDefinitionDTO toDTO(ProposalDefinition proposalDefinition);
    List<ProposalDefinitionDTO> toDTOList(List<ProposalDefinition> proposalDefinitionList);
}
