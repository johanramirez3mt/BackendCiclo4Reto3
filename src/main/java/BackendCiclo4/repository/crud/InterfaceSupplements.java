package BackendCiclo4.repository.crud;

import BackendCiclo4.model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
    
}
