package mx.alan.spring.petstore.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

public class PetPostResponse extends PetResponse {
    private UUID transactionId;
    private LocalDateTime dateCreated;

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
