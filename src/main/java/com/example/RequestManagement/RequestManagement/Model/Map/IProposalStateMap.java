package com.example.RequestManagement.RequestManagement.Model.Map;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProposalStateDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalState;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface IProposalStateMap {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "states", target = "state"),
    })
    ProposalStateDTO toDTO(ProposalState proposalState);
    List<ProposalStateDTO> toDTOList(List<ProposalState> proposalState);
}
