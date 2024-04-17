package repository;

import enumerators.UserRole;
import model.User;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserRepository extends BaseRepository<User>{

    private static final UserRepository userRepository = new UserRepository();

    public static UserRepository getInstance() {
        return userRepository;
    }

    private UserRepository() {
    }

    public Optional<User> findByUsername(String username) {
        for (User user : getActives()) {
            if (Objects.equals(username, user.getUsername())){
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }



    public ArrayList<User> getBlockedUsers() {
        ArrayList<User> blockedUsers = new ArrayList<>();
        for (User user : data) {
            if (user.isActive()) {
                blockedUsers.add(user);
            }
        }
        return blockedUsers;
    }

    public ArrayList<User> getNoBlockedUsers() {
        ArrayList<User> blockedUsers = new ArrayList<>();
        for (User user : data) {
            if (!user.isActive() && Objects.equals(user.getRole(),UserRole.USER.name())) {
                blockedUsers.add(user);
            }
        }
        return blockedUsers;
    }

    public int blockOrUnBlockUser(UUID userId, boolean isBlocked){
        for (User user : data) {
            if (user.getId().equals(userId)) {
                user.setActive(false);
                return 1;
            }
        }
        return 0;
    }
    public ArrayList<User> getAllUsers(){
        return data;
//        ArrayList<User> users1 = new ArrayList<>();
//        for (User user : data) {
//            users1.add(user);
//        }
//        return users1;
    }
   public User signIn(String username,String password){
       for (User user : data) {
           if(user.getUsername().equals(username) && user.getPassword().equals(password)){
               return user;
           }
       }
       return null;
   }


}
