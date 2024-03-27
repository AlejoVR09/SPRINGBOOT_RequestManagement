package com.example.RequestManagement.RequestManagement.Controller;

import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.ProponentTypeErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProponentType;
import com.example.RequestManagement.RequestManagement.Service.ProponentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/proponentType")
public class ProponentTypeController {
    @Autowired
    ProponentTypeService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProponentType proponentType){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.add(proponentType));
        }
        catch (RuntimeException error){
            ProponentTypeErrorDTO proponentTypeErrorDTO = new ProponentTypeErrorDTO();
            proponentTypeErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proponentTypeErrorDTO.getMessage());
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
            ProponentTypeErrorDTO proponentTypeErrorDTO = new ProponentTypeErrorDTO();
            proponentTypeErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proponentTypeErrorDTO.getMessage());
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
            ProponentTypeErrorDTO proponentTypeErrorDTO = new ProponentTypeErrorDTO();
            proponentTypeErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proponentTypeErrorDTO.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody ProponentType proponentType ,@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.modify(id, proponentType));
        }
        catch (RuntimeException error){
            ProponentTypeErrorDTO proponentTypeErrorDTO = new ProponentTypeErrorDTO();
            proponentTypeErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proponentTypeErrorDTO.getMessage());
        }
    }
}
