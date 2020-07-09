package cn.edu.sdut.project.mapper;

import cn.edu.sdut.project.entity.User;

public interface UserMapper {
    User login(User user);
    int addUser(User user);
    int updateUserpwd(User user);
}
