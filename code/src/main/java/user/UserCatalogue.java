package user;

import abstractCatalogue.AbstractCatalogue;
import repository.UserRepository;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/21/2015
 */
public class UserCatalogue extends AbstractCatalogue{

    private UserRepository userRepository;

    public UserCatalogue() {
        super();
        userRepository = new UserRepository(super.getMorphia(), super.getMongoClient());
    }

    private List<User> users = new LinkedList<User>();

    // TODO
    public boolean login(User user) {
        return true;
    }

    // TODO
    public boolean logout(User user) {
        return true;
    }

    // TODO
    public void addUser(User user) {
        userRepository.save(user);
    }

    // TODO
    public void editUser(User user) {

    }

    // TODO
    public void deleteUser(User user) {

    }

    // TODO
    public List<User> list() {
        return users;
    }

    // TODO
    public List<User> search(String keyword) {
        return null;
    }

    // TODO
    public User authenticate(String username, String password) {
        return null;
    }
}
