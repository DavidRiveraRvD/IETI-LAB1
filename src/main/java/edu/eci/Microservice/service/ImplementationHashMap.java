package edu.eci.Microservice.service;

import edu.eci.Microservice.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ImplementationHashMap implements UserService{
    private final HashMap<String, User> users = new HashMap();

    @Override
    public User create(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        if(users.containsKey(id)){
            return users.get(id);
        }
        return null;
    }

    @Override
    public List<User> all() {
        List<User> usersList = new ArrayList();
        for(User u : users.values()){
            usersList.add(u);
        }
        return usersList;
    }

    @Override
    public Boolean deleteById(String id) {
        return users.remove(id, users.get(id));
    }

    @Override
    public User update(User user, String userId) {
        users.put(userId, user);
        return user;
    }

}


