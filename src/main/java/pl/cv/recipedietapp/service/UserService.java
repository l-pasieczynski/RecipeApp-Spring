package pl.cv.recipedietapp.service;

import pl.cv.recipedietapp.entity.User;

public interface UserService {

    User findByUserName(String username);

    void saveUser(User user);

}
