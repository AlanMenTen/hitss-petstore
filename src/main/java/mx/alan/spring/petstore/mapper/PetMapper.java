package mx.alan.spring.petstore.mapper;

import mx.alan.spring.petstore.dto.external.request.PetExternalRequest;
import mx.alan.spring.petstore.dto.request.PetRequest;
import mx.alan.spring.petstore.dto.response.PetPostResponse;
import mx.alan.spring.petstore.dto.response.PetResponse;
import mx.alan.spring.petstore.dto.external.response.PetExternalResponse;

public interface PetMapper {
    PetResponse mapPetExternalResponseToPetResponse(PetExternalResponse petExternalResponse);
    PetExternalRequest mapPetRequestToPetExternalRequest(PetRequest petRequest);
    PetPostResponse mapPetExternalResponseToPetPostResponse(PetExternalResponse petExternalResponse);
}
