package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void save(User user);

    void delete(Long id);

    User get(Long id);

    User getByName(String name);
}
