package mx.alan.spring.petstore.service;

import mx.alan.spring.petstore.dto.request.PetRequest;
import mx.alan.spring.petstore.dto.response.PetResponse;

public interface PetService {
    PetResponse getPetById(Long petId);
    PetResponse createPet(PetRequest petRequest);
}
