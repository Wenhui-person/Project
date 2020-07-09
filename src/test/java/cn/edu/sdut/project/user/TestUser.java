package cn.edu.sdut.project.user;

import cn.edu.sdut.project.ProjectApplicationTests;
import cn.edu.sdut.project.entity.User;
import cn.edu.sdut.project.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;

public class TestUser extends ProjectApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void testLogin(){
        User  user=new User("17110123","1234");
        User login=this.userService.login(user);
        System.out.println("login = " + login);
    }
}
