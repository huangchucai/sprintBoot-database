package hello.services;

import hello.entity.User;
import hello.mapper.UserMapper;

import javax.inject.Inject;

public class UserService {
    private UserMapper userMapper;

    @Inject
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(Integer id) {
       return userMapper.findUserById(id);
    }

}
