package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import user.User;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/25/2015
 */
public interface UserRepository extends MongoRepository<User, String>{
    User findByUsernameAndPassword(String username, String password);
}
