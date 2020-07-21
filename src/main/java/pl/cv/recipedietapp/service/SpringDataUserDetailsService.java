package pl.cv.recipedietapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.cv.recipedietapp.entity.User;

import java.util.HashSet;
import java.util.Set;


public class SpringDataUserDetailsService implements UserDetailsService {

    private pl.cv.recipedietapp.service.UserService userService;

    @Autowired
    public void setUserRepository(pl.cv.recipedietapp.service.UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userService.findByUserName(username);
        if (user == null) {throw new UsernameNotFoundException(username); }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        user.getRoles().forEach(r ->
                grantedAuthorities.add(new SimpleGrantedAuthority(r.getName())));
        return new pl.cv.recipedietapp.service.CurrentUser(user.getUsername(),user.getPassword(),
                grantedAuthorities, user);
    }

}