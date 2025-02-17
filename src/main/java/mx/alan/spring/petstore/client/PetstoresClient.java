package mx.alan.spring.petstore.client;

import mx.alan.spring.petstore.dto.external.request.PetExternalRequest;
import mx.alan.spring.petstore.dto.request.PetRequest;
import mx.alan.spring.petstore.dto.response.PetResponse;
import mx.alan.spring.petstore.dto.external.response.PetExternalResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "petstore-client", url = "https://petstore.swagger.io/v2")
public interface PetstoresClient {

    @GetMapping("/pet/{petId}")
    PetExternalResponse getPetById(@PathVariable("petId") Long petId);

    @PostMapping("/pet")
    PetExternalResponse createPet(@RequestBody PetExternalRequest petExternalRequest);
}
