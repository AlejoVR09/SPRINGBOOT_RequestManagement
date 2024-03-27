package com.example.RequestManagement.RequestManagement.Model.Map;
import com.example.RequestManagement.RequestManagement.Model.DTO.ValueProposalDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ValueProposal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface IValueProposalMap {
    @Mappings({
            @Mapping(source = "idValueProposal", target = "idValueProposal"),
            @Mapping(source = "comfamaValue", target = "comfamaValue"),
            @Mapping(source = "totalValue", target = "totalValue"),
    })
    ValueProposalDTO toDTO(ValueProposal valueProposal);
    List<ValueProposalDTO> toDTOList(List<ValueProposal> valueProposalList);
}
