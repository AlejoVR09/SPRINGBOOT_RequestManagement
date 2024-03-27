package com.example.RequestManagement.RequestManagement.Controller;

import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.AttachedDocumentErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.AttachedDocument;
import com.example.RequestManagement.RequestManagement.Service.AttachedDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/attachedDocument")
public class AttachedDocumentController {
    @Autowired
    AttachedDocumentService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody AttachedDocument attachedDocument){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.add(attachedDocument));
        }
        catch (RuntimeException error){
            AttachedDocumentErrorDTO attachedDocumentErrorDTO = new AttachedDocumentErrorDTO();
            attachedDocumentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(attachedDocumentErrorDTO.getMessage());
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
            AttachedDocumentErrorDTO attachedDocumentErrorDTO = new AttachedDocumentErrorDTO();
            attachedDocumentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(attachedDocumentErrorDTO.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchById(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.lookForByID(id));
        }
        catch (RuntimeException error){
            AttachedDocumentErrorDTO attachedDocumentErrorDTO = new AttachedDocumentErrorDTO();
            attachedDocumentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(attachedDocumentErrorDTO.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody AttachedDocument attachedDocument ,@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.modify(id, attachedDocument));
        }
        catch (RuntimeException error){
            AttachedDocumentErrorDTO attachedDocumentErrorDTO = new AttachedDocumentErrorDTO();
            attachedDocumentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(attachedDocumentErrorDTO.getMessage());
        }
    }
}
