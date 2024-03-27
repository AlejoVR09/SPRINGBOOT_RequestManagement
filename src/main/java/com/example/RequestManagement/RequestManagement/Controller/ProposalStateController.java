package com.example.RequestManagement.RequestManagement.Controller;

import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.ProposalStateErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalState;
import com.example.RequestManagement.RequestManagement.Service.ProposalStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/proposalState")
public class ProposalStateController {
    @Autowired
    ProposalStateService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProposalState proposalState){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.add(proposalState));
        }
        catch (RuntimeException error){
            ProposalStateErrorDTO proposalStateErrorDTO = new ProposalStateErrorDTO();
            proposalStateErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalStateErrorDTO.getMessage());
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
            ProposalStateErrorDTO proposalStateErrorDTO = new ProposalStateErrorDTO();
            proposalStateErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalStateErrorDTO.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> search(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.lookForById(id));
        }
        catch (RuntimeException error){
            ProposalStateErrorDTO proposalStateErrorDTO = new ProposalStateErrorDTO();
            proposalStateErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalStateErrorDTO.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody ProposalState proposalState ,@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.modify(id, proposalState));
        }
        catch (RuntimeException error){
            ProposalStateErrorDTO proposalStateErrorDTO = new ProposalStateErrorDTO();
            proposalStateErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proposalStateErrorDTO.getMessage());
        }
    }
}
