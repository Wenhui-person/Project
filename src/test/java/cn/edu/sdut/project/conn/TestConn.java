package cn.edu.sdut.project.conn;

import cn.edu.sdut.project.ProjectApplication;
import cn.edu.sdut.project.ProjectApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest(classes = ProjectApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestConn extends ProjectApplicationTests {
    @Resource
    private DataSource dataSource;

    @Test
    public void testConn() throws SQLException {
        Connection connection=this.dataSource.getConnection();
        System.out.println("connection = " + connection);
    }
}
