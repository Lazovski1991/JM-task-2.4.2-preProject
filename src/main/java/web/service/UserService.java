package web.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import web.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getUsers();

    void save(User user);

    void delete(Long id);

    User get(Long id);
}
