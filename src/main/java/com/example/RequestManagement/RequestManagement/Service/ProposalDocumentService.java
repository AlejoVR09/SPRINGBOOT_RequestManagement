package com.example.RequestManagement.RequestManagement.Service;

import com.example.RequestManagement.RequestManagement.Model.DTO.ProposalDocumentDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalDocument;
import com.example.RequestManagement.RequestManagement.Model.Map.IProposalDocumentMap;
import com.example.RequestManagement.RequestManagement.Model.Repository.IProposalDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProposalDocumentService {
    @Autowired
    IProposalDocumentRepository repository;
    @Autowired
    IProposalDocumentMap map;

    public ProposalDocumentDTO add(ProposalDocument data) throws RuntimeException{
        try {
            return map.toDTO(repository.save(data));
        }
        catch (RuntimeException error){
            throw new RuntimeException(error.getMessage());
        }
    }

//    public ProposalDocumentDTO lookForById(Integer id) throws RuntimeException{
//        try {
//            if(repository.findById(id).isPresent()){
//                return map.toDTO(repository.findById(id).get());
//            }
//            else{
//                throw new RuntimeException("No found!");
//            }
//        }
//        catch (RuntimeException error) {
//            throw new RuntimeException(error.getMessage());
//        }
//    }

    public List<ProposalDocumentDTO> lookForAll() throws RuntimeException{
        try {
            return map.toDTOList(repository.findAll());
        }
        catch (RuntimeException error) {
            throw new RuntimeException(error.getMessage());
        }
    }

//    public ProposalDocumentDTO modify(Integer id, ProposalDocument change) throws RuntimeException{
//        try {
//            if(repository.findById(id).isPresent()){
//                ProposalDocument foundElement = repository.findById(id).get();
//                foundElement.setBenefited(change.getBenefited());
//                return map.toDTO(repository.save(foundElement));
//            }
//            else{
//                throw new RuntimeException("No found!");
//            }
//        }
//        catch (RuntimeException error) {
//            throw new RuntimeException(error.getMessage());
//        }
//    }
}
