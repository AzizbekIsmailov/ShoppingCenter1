package service;

import model.User;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class UserService extends BaseService<User, UserRepository> {

    public static final UserService userService = new UserService();

    public static UserService getInstance(){
        return userService;
    }
    public UserService() {
        super(UserRepository.getInstance());
    }
    public Optional<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public ArrayList<User> getBlockedUsers(){
        return repository.getBlockedUsers();
    }
    public ArrayList<User> getNoBlockedUsers(){
        return repository.getNoBlockedUsers();
    }
    public int blockOrUnBlockUser(UUID userId, boolean isBlocked){
        return repository.blockOrUnBlockUser(userId, isBlocked);
    }

    public ArrayList<User> getAllUsers(){
        return repository.getAllUsers();
    }
    public User signIn(String username,String password){
        return repository.signIn(username, password);
    }

    @Override
    public boolean check(User user) {
        return repository.findByUsername(user.getUsername()).isEmpty();
    }
}
