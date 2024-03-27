package com.example.RequestManagement.RequestManagement.Service;

import com.example.RequestManagement.RequestManagement.Model.DTO.ValueProposalDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ValueProposal;
import com.example.RequestManagement.RequestManagement.Model.Map.IValueProposalMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IRepresentantRepository;
import com.example.RequestManagement.RequestManagement.Model.Repository.IValueProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValueProposalService {
    @Autowired
    IValueProposalRepository repository;
    @Autowired
    IValueProposalMap map;

    public ValueProposalDTO add(ValueProposal data) throws RuntimeException{
        try {
            return map.toDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }

    public ValueProposalDTO lookForById(Integer id) throws RuntimeException{
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

    public List<ValueProposalDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public ValueProposalDTO modify(Integer id, ValueProposal change) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                ValueProposal foundElement = repository.findById(id).get();
                foundElement.setTotalValue(change.getTotalValue());
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
