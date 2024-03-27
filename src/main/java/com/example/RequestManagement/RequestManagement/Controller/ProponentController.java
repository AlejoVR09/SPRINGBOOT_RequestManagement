package com.example.RequestManagement.RequestManagement.Controller;

import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.ProponentErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.Proponent;
import com.example.RequestManagement.RequestManagement.Service.ProponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/proponent")
public class ProponentController {
    @Autowired
    ProponentService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Proponent proponent){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.add(proponent));
        }
        catch (RuntimeException error){
            ProponentErrorDTO proponentErrorDTO = new ProponentErrorDTO();
            proponentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proponentErrorDTO.getMessage());
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
            ProponentErrorDTO proponentErrorDTO = new ProponentErrorDTO();
            proponentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proponentErrorDTO.getMessage());
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
            ProponentErrorDTO proponentErrorDTO = new ProponentErrorDTO();
            proponentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proponentErrorDTO.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody Proponent proponent ,@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.modify(id, proponent));
        }
        catch (RuntimeException error){
            ProponentErrorDTO proponentErrorDTO = new ProponentErrorDTO();
            proponentErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(proponentErrorDTO.getMessage());
        }
    }
}
