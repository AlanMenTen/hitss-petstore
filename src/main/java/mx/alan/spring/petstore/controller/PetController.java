package mx.alan.spring.petstore.controller;

import mx.alan.spring.petstore.dto.request.PetRequest;
import mx.alan.spring.petstore.dto.response.PetResponse;
import mx.alan.spring.petstore.service.PetService;
import mx.alan.spring.petstore.service.impl.PetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pet")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetServiceImpl petService) {
        this.petService = petService;
    }

    //Metodo para obtener mascota por di
    @GetMapping("/{petId}")
    public PetResponse getPetById(@PathVariable Long petId) {
        return petService.getPetById(petId);
    }

    //metodo para crear una nueva mascota
    @PostMapping
    public PetResponse createPet(@RequestBody PetRequest petRequest) {
        return petService.createPet(petRequest);
    }
}
