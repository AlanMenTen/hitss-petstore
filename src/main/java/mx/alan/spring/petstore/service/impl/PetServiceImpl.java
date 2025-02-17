package mx.alan.spring.petstore.service.impl;

import mx.alan.spring.petstore.client.PetstoresClient;
import mx.alan.spring.petstore.dto.external.request.PetExternalRequest;
import mx.alan.spring.petstore.dto.request.PetRequest;
import mx.alan.spring.petstore.dto.response.PetPostResponse;
import mx.alan.spring.petstore.dto.response.PetResponse;
import mx.alan.spring.petstore.dto.external.response.PetExternalResponse;
import mx.alan.spring.petstore.mapper.PetMapper;
import mx.alan.spring.petstore.service.PetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PetServiceImpl implements PetService {

    private static final Logger logger = LoggerFactory.getLogger(PetServiceImpl.class);

    private final PetstoresClient petstoresClient;
    private final PetMapper petMapper;

    @Autowired
    public PetServiceImpl(PetstoresClient petstoresClient, PetMapper petMapper) {
        this.petstoresClient = petstoresClient;
        this.petMapper = petMapper;

    }

    @Override
    public PetResponse getPetById(Long petId){
        //consumo de la api externa
        PetExternalResponse petExternalResponse = petstoresClient.getPetById(petId);
        //imprimiendo resultado
        logger.info("La mascota obtenida del GET fue: " + petExternalResponse.toString());
        return petMapper.mapPetExternalResponseToPetResponse(petExternalResponse);
    }

    @Override
    public PetResponse createPet(PetRequest petRequest){
        PetExternalRequest petExternalRequest = petMapper.mapPetRequestToPetExternalRequest(petRequest);
        //consumo de la api externa
        PetExternalResponse petExternalResponse = petstoresClient.createPet(petExternalRequest);
        logger.info("La mascota obtenida del POST fue: " + petExternalResponse.toString());
        return petMapper.mapPetExternalResponseToPetPostResponse(petExternalResponse);
    }

}
