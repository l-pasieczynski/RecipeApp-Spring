package pl.cv.recipedietapp.service;

import pl.cv.recipedietapp.entity.User;

public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    void saveUser(User user);

}
