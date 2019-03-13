import cn.demon.dao.UserMapper;
import cn.demon.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * @desciption:
 * @author: Demon
 * @version: 1.0 2019-03-11 14:36
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/beans.xml")
public class test {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void select(){
        User user = userMapper.selectByName("张强");
//        UserService userService = new UserServiceImpl();
//        User user = userService.login("admin");
        System.out.println(user);
    }

    @Test
    public void show(){
        System.out.println("在");
    }
}
