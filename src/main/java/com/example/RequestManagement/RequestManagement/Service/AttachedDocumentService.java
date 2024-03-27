package com.example.RequestManagement.RequestManagement.Service;

import com.example.RequestManagement.RequestManagement.Model.DTO.AttachedDocumentDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.AttachedDocument;
import com.example.RequestManagement.RequestManagement.Model.Map.IAttachedDocumentMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IAttachedDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachedDocumentService {
    @Autowired
    IAttachedDocumentRepository repository;
    @Autowired
    IAttachedDocumentMap map;

    public AttachedDocumentDTO add(AttachedDocument data) throws RuntimeException{
        try {
            return map.toAttachedDocumentDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }

    public AttachedDocumentDTO lookForByID(Integer id) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                return map.toAttachedDocumentDTO(repository.findById(id).get());
            }
            else{
                throw new RuntimeException("No found!");
            }
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public List<AttachedDocumentDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public AttachedDocumentDTO modify(Integer id, AttachedDocument change) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                AttachedDocument foundDocument = repository.findById(id).get();
                foundDocument.setDocumentName(change.getDocumentName());
                foundDocument.setUrlDocument(change.getUrlDocument());
                return map.toAttachedDocumentDTO(repository.save(foundDocument));
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
