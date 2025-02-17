package mx.alan.spring.petstore.mapper.impl;

import mx.alan.spring.petstore.dto.external.request.PetExternalRequest;
import mx.alan.spring.petstore.dto.request.PetRequest;
import mx.alan.spring.petstore.dto.response.PetPostResponse;
import mx.alan.spring.petstore.dto.response.PetResponse;
import mx.alan.spring.petstore.dto.external.response.PetExternalResponse;
import mx.alan.spring.petstore.mapper.PetMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PetMapperImpl implements PetMapper {


    @Override
    public PetResponse mapPetExternalResponseToPetResponse(PetExternalResponse petExternalResponse) {
        PetResponse  petResponse= new PetResponse();
        petResponse.setId(petExternalResponse.getId());
        petResponse.setName(petExternalResponse.getName());
        petResponse.setStatus(petExternalResponse.getStatus());
        return petResponse;
    }

    @Override
    public PetExternalRequest mapPetRequestToPetExternalRequest(PetRequest petRequest) {
        PetExternalRequest petExternalRequest= new PetExternalRequest();
        petExternalRequest.setId(petRequest.getId());
        petExternalRequest.setName(petRequest.getName());
        petExternalRequest.setStatus(petRequest.getStatus());
        return petExternalRequest;
    }

    @Override
    public PetPostResponse mapPetExternalResponseToPetPostResponse(PetExternalResponse petExternalResponse) {
        PetPostResponse petPostResponse= new PetPostResponse();
        petPostResponse.setId(petExternalResponse.getId());
        petPostResponse.setName(petExternalResponse.getName());
        petPostResponse.setStatus(petExternalResponse.getStatus());
        petPostResponse.setDateCreated(LocalDateTime.now());
        petPostResponse.setTransactionId(UUID.randomUUID());
        return petPostResponse;
    }
}
