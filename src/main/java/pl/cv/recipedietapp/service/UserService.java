package pl.cv.recipedietapp.service;

import pl.cv.recipedietapp.entity.User;


public interface UserService {

    User findByUserName(String name);

    void saveUser(User user);
}