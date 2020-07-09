package cn.edu.sdut.project.service.Impl;

import cn.edu.sdut.project.entity.User;
import cn.edu.sdut.project.mapper.UserMapper;
import cn.edu.sdut.project.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return this.userMapper.login(user);
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int updateUserpwd(User user) {
        return this.userMapper.updateUserpwd(user);
    }
}
