package com.example.RequestManagement.RequestManagement.Controller;

import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.ProposalDocumentErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalDocument;
import com.example.RequestManagement.RequestManagement.Service.ProposalDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/proposalDocument")
public class ProposalDocumentController {
    @Autowired
    ProposalDocumentService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProposalDocument proposalDocument){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.add(proposalDocument));
        }
        catch (RuntimeException error){
            ProposalDocumentErrorDTO proposalDocumentErrorDTO = new ProposalDocumentErrorDTO();
            proposalDocumentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalDocumentErrorDTO.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> searchAll(){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.lookForAll());
        }
        catch (RuntimeException error){
            ProposalDocumentErrorDTO proposalDocumentErrorDTO = new ProposalDocumentErrorDTO();
            proposalDocumentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalDocumentErrorDTO.getMessage());
        }
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<?> searchById(@PathVariable Integer id){
//        try {
//            return ResponseEntity
//                    .status(HttpStatus.ACCEPTED)
//                    .body(this.service.lookForById(id));
//        }
//        catch (RuntimeException error){
//            ProposalDocumentErrorDTO proposalDocumentErrorDTO = new ProposalDocumentErrorDTO();
//            proposalDocumentErrorDTO.setMessage(error.getMessage());
//            return ResponseEntity
//                    .status(HttpStatus.BAD_REQUEST)
//                    .body(proposalDocumentErrorDTO.getMessage());
//        }
//    }

//    @PutMapping("/{id}")
//    public ResponseEntity<?> modify(@RequestBody ProposalDefinition proposalDefinition ,@PathVariable Integer id){
//        try {
//            return ResponseEntity
//                    .status(HttpStatus.ACCEPTED)
//                    .body(this.service.modify(id, proposalDefinition));
//        }
//        catch (RuntimeException error){
//            ProposalDocumentErrorDTO proposalDocumentErrorDTO = new ProposalDocumentErrorDTO();
//            proposalDocumentErrorDTO.setMessage(error.getMessage());
//            return ResponseEntity
//                    .status(HttpStatus.BAD_REQUEST)
//                    .body(proposalDocumentErrorDTO.getMessage());
//        }
//    }
}
