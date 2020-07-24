package pl.cv.recipedietapp.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User {
    private final pl.cv.recipedietapp.entity.User user;
    public CurrentUser(String username, String password,
                       Collection<? extends GrantedAuthority> authorities,
                       pl.cv.recipedietapp.entity.User user) {
        super(username, password, authorities);
        this.user = user;
    }
    public pl.cv.recipedietapp.entity.User getUser() {return user;}

}