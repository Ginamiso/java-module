package academy.everyonecodes.java.optionals.maps.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UsersDataStore {

    private Map<String, User> users = new HashMap();

    public UsersDataStore() {
        User gina = new User("Gina", "lalala");
        User nina = new User("Nina", "shalala");
        users.put(gina.getUsername(), gina);
        users.put(nina.getUsername(), nina);
    }
    public Optional<User> getUserByUsername(String username){
        if(users.containsKey(username)){
            return Optional.of(users.get(username));
        }
        return Optional.empty();

}
}
