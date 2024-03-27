package com.example.RequestManagement.RequestManagement.Controller;


import com.example.RequestManagement.RequestManagement.Model.DTO.DTOError.RepresentantErrorDTO;
import com.example.RequestManagement.RequestManagement.Model.Entity.Representant;
import com.example.RequestManagement.RequestManagement.Service.RepresentantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/representant")
public class RepresentantController {
    @Autowired
    RepresentantService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Representant representant){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.add(representant));
        }
        catch (RuntimeException error){
            RepresentantErrorDTO representantErrorDTO = new RepresentantErrorDTO();
            representantErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(representantErrorDTO.getMessage());
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
            RepresentantErrorDTO representantErrorDTO = new RepresentantErrorDTO();
            representantErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(representantErrorDTO.getMessage());
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
            RepresentantErrorDTO representantErrorDTO = new RepresentantErrorDTO();
            representantErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(representantErrorDTO.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody Representant representant ,@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.service.modify(id, representant));
        }
        catch (RuntimeException error){
            RepresentantErrorDTO representantErrorDTO = new RepresentantErrorDTO();
            representantErrorDTO.setMessage(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(representantErrorDTO.getMessage());
        }
    }
}
