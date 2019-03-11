package cn.demon.pojo;

/**
 * @desciption: User类
 * @author: Demon
 * @version: 1.0 2019-03-10 19:58
 **/
public class User {
    /**
     * 用户id
     */
    private int id;
    /**
     * 用户登录名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
