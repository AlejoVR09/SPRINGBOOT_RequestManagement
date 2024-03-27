package com.example.RequestManagement.RequestManagement.Controller;

import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.ProposalDefinionErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.RepresentantErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalDefinition;
import com.example.RequestManagement.RequestManagement.Model.Entity.Representant;
import com.example.RequestManagement.RequestManagement.Service.ProposalDefinitionService;
import com.example.RequestManagement.RequestManagement.Service.RepresentantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/proposalDefinition")
public class ProposalDefinitionController {
    @Autowired
    ProposalDefinitionService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProposalDefinition proposalDefinition){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.add(proposalDefinition));
        }
        catch (RuntimeException error){
            ProposalDefinionErrorDTO proposalDefinionErrorDTO = new ProposalDefinionErrorDTO();
            proposalDefinionErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalDefinionErrorDTO.getMessage());
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
            ProposalDefinionErrorDTO proposalDefinionErrorDTO = new ProposalDefinionErrorDTO();
            proposalDefinionErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalDefinionErrorDTO.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchById(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.lookForById(id));
        }
        catch (RuntimeException error){
            ProposalDefinionErrorDTO proposalDefinionErrorDTO = new ProposalDefinionErrorDTO();
            proposalDefinionErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalDefinionErrorDTO.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody ProposalDefinition proposalDefinition ,@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.modify(id, proposalDefinition));
        }
        catch (RuntimeException error){
            ProposalDefinionErrorDTO proposalDefinionErrorDTO = new ProposalDefinionErrorDTO();
            proposalDefinionErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalDefinionErrorDTO.getMessage());
        }
    }
}
