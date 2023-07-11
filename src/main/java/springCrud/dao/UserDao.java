package springCrud.dao;

import springCrud.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void updateUser(Long id, User user);

    public void deleteUser(Long id);

    public User getUserById(Long id);

    public List<User> getAllUsers();

}
