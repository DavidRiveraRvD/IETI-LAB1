package edu.eci.Microservice.service;

public interface UserService {
    User create( User user );
    User findById( String id );
    List<User> all();
    void deleteById( String id );
    User update( User user, String userId );
}