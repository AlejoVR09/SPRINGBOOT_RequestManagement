package com.example.RequestManagement.RequestManagement.Service;

import com.example.RequestManagement.RequestManagement.Model.DTO.DocumentTypeDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.DocumentType;
import com.example.RequestManagement.RequestManagement.Model.Map.IDocumentTypeMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IDocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentTypeService {
    @Autowired
    IDocumentTypeRepository repository;
    @Autowired
    IDocumentTypeMap map;

    public DocumentTypeDTO add(DocumentType data) throws RuntimeException{
        try {
            return map.toDocumentTypeDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }

    public DocumentTypeDTO lookForById(Integer id) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                return map.toDocumentTypeDTO(repository.findById(id).get());
            }
            else{
                throw new RuntimeException("No found!");
            }
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public List<DocumentTypeDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public DocumentTypeDTO modify(Integer id, DocumentType change) throws RuntimeException{
        try {
            if(repository.findById(id).isPresent()){
                DocumentType foundElement = repository.findById(id).get();
                foundElement.setDocumentTypeName(change.getDocumentTypeName());
                return map.toDocumentTypeDTO(repository.save(foundElement));
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