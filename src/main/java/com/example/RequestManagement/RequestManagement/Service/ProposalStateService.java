package com.example.RequestManagement.RequestManagement.Service;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProposalStateDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalState;
import com.example.RequestManagement.RequestManagement.Model.Map.IProposalStateMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IProposalStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProposalStateService {
    @Autowired
    IProposalStateRepository repository;
    @Autowired
    IProposalStateMap map;

    public ProposalStateDTO add(ProposalState data) throws RuntimeException{
        try {
            return map.toDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }

    public ProposalStateDTO lookForById(Integer id) throws RuntimeException{
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

    public List<ProposalStateDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public ProposalStateDTO modify(Integer id, ProposalState change) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                ProposalState foundElement = repository.findById(id).get();
                foundElement.setStates(change.getStates());
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
