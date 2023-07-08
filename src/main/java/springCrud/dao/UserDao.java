package springCrud.dao;

import springCrud.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void updateUser(int id, User user);

    public void deleteUser(int id);

    public User getUserById(int id);

    public List<User> getAllUsers();

}
