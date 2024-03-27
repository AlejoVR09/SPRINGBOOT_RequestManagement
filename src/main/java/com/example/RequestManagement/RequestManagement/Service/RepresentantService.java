package com.example.RequestManagement.RequestManagement.Service;

import com.example.RequestManagement.RequestManagement.Model.DTO.RepresentantDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.Representant;
import com.example.RequestManagement.RequestManagement.Model.Map.IRepresentantMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IRepresentantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepresentantService {
    @Autowired
    IRepresentantRepository repository;
    @Autowired
    IRepresentantMap map;

    public RepresentantDTO add(Representant data) throws RuntimeException{
        try {
            return map.toRepresentantDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }

    public RepresentantDTO lookForById(Integer id) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                return map.toRepresentantDTO(repository.findById(id).get());
            }
            else{
                throw new RuntimeException("No found!");
            }
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public List<RepresentantDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public RepresentantDTO modify(Integer id, Representant change) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                Representant foundElement = repository.findById(id).get();
                foundElement.setName(change.getName());
                foundElement.setDocumentType(change.getDocumentType());
                return map.toRepresentantDTO(repository.save(foundElement));
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
