package security.repositories;

import org.springframework.data.repository.CrudRepository;
import security.entities.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {
   User findByLogin(String name);

}
