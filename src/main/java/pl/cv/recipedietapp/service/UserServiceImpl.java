package pl.cv.recipedietapp.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pl.cv.recipedietapp.entity.Role;
import pl.cv.recipedietapp.entity.User;
import pl.cv.recipedietapp.repository.RoleRepository;
import pl.cv.recipedietapp.repository.UserRepository;

import java.util.Arrays;
import java.util.HashSet;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setActive(true);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
}
