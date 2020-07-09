package cn.edu.sdut.project.service;

import cn.edu.sdut.project.entity.User;

public interface UserService {
    User login(User user);
    int addUser(User user);
    int updateUserpwd(User user);
}
