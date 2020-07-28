package pl.cv.recipedietapp.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.cv.recipedietapp.entity.Role;
import pl.cv.recipedietapp.entity.User;
import pl.cv.recipedietapp.repository.RoleRepository;
import pl.cv.recipedietapp.repository.UserRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserEditServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserEditServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
                               BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }
    @Override
    public void saveUser(User user) {
        user.setEnabled(1);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
}