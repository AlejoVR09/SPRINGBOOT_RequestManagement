package com.example.RequestManagement.RequestManagement.Service;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProponentDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.Proponent;
import com.example.RequestManagement.RequestManagement.Model.Map.IProponentMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IProponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProponentService {
    @Autowired
    IProponentRepository repository;
    @Autowired
    IProponentMap map;

    public ProponentDTO add(Proponent data) throws RuntimeException{
        try {
            return map.toProponentDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }

    public ProponentDTO lookForById(Integer id) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                return map.toProponentDTO(repository.findById(id).get());
            }
            else{
                throw new RuntimeException("No found!");
            }
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public List<ProponentDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public ProponentDTO modify(Integer id, Proponent change) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                Proponent foundElement = repository.findById(id).get();
                foundElement.setName(change.getName());
                return map.toProponentDTO(repository.save(foundElement));
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
