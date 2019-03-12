package cn.demon.controller;

import cn.demon.pojo.User;
import cn.demon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @desciption: 用户控制器
 * @author: Demon
 * @version: 1.0 2019-03-11 12:26
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        User user = userService.login(username);
        if (user == null) {
            model.addAttribute("message", "用户不存在");
            return "page/loginInfo";
        }
        if (!user.getPassword().equals(password)) {
            model.addAttribute("message", "密码错误");
            return "page/loginInfo";
        }
        return "page/page";
    }

    /**
     * 回到登录页
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
