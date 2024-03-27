package com.example.RequestManagement.RequestManagement.Controller;

import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.DocumentTypeErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.DocumentType;
import com.example.RequestManagement.RequestManagement.Service.DocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/document")
public class DocumentTypeController {
    @Autowired
    DocumentTypeService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody DocumentType documentType){
        try {
            System.out.println(documentType.getDocumentTypeName());
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.add(documentType));
        }
        catch (RuntimeException error){
            DocumentTypeErrorDTO documentTypeErrorDTO = new DocumentTypeErrorDTO();
            documentTypeErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(documentTypeErrorDTO.getMessage());
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
            DocumentTypeErrorDTO documentTypeErrorDTO = new DocumentTypeErrorDTO();
            documentTypeErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(documentTypeErrorDTO.getMessage());
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
            DocumentTypeErrorDTO documentTypeErrorDTO = new DocumentTypeErrorDTO();
            documentTypeErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(documentTypeErrorDTO.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody DocumentType documentType ,@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.modify(id, documentType));
        }
        catch (RuntimeException error){
            DocumentTypeErrorDTO documentTypeErrorDTO = new DocumentTypeErrorDTO();
            documentTypeErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(documentTypeErrorDTO.getMessage());
        }
    }
}
