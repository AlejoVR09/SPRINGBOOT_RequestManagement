package com.example.RequestManagement.RequestManagement.Service;


import com.example.RequestManagement.RequestManagement.Model.DTO.ProposalDefinitionDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalDefinition;
import com.example.RequestManagement.RequestManagement.Model.Map.IProposalDefinitionMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IProposalDefinitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProposalDefinitionService {
    @Autowired
    IProposalDefinitionRepository repository;
    @Autowired
    IProposalDefinitionMap map;

    public ProposalDefinitionDTO add(ProposalDefinition data) throws RuntimeException{
        try {
            return map.toDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }

    public ProposalDefinitionDTO lookForById(Integer id) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                return map.toDTO(repository.findById(id).get());
            }
            else{
                throw new RuntimeException("No found!");
            }
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public List<ProposalDefinitionDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public ProposalDefinitionDTO modify(Integer id, ProposalDefinition change) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                ProposalDefinition foundElement = repository.findById(id).get();
                foundElement.setBenefited(change.getBenefited());
                return map.toDTO(repository.save(foundElement));
            }
            else{
                throw new RuntimeException("No found!");
            }
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }
}
