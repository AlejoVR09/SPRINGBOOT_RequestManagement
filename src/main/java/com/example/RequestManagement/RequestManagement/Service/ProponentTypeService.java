package com.example.RequestManagement.RequestManagement.Service;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProponentTypeDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProponentType;
import com.example.RequestManagement.RequestManagement.Model.Map.IProponentTypeMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IProponentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProponentTypeService {
    @Autowired
    IProponentTypeRepository repository;
    @Autowired
    IProponentTypeMap map;

    public ProponentTypeDTO add(ProponentType data) throws RuntimeException{
        try {
            return map.toProponentTypeDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }
    public ProponentTypeDTO lookForById(Integer id) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                return map.toProponentTypeDTO(repository.findById(id).get());
            }
            else{
                throw new RuntimeException("No found!");
            }
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public List<ProponentTypeDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public ProponentTypeDTO modify(Integer id, ProponentType change) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                ProponentType foundElement = repository.findById(id).get();
                foundElement.setProponentTypeName(change.getProponentTypeName());
                return map.toProponentTypeDTO(repository.save(foundElement));
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
