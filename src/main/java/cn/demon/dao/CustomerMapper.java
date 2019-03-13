package cn.demon.dao;

import cn.demon.pojo.Customer;
import com.github.pagehelper.Page;

/**
 * @desciption: 客户Mapper
 * @author: Demon
 * @version: 1.0 2019-03-13 09:29
 **/
public interface CustomerMapper {
    /**
     * 新增客户信息
     * @param customer 客户
     */
    void insert(Customer customer);

    /**
     * 根据id删除客户信息
     * @param id 客户id
     */
    void delete(long id);

    /**
     * 更新客户信息
     * @param customer 客户
     */
    void update(Customer customer);

    /**
     * 根据id查找客户信息
     * @param id 客户id
     * @return 返回客户信息
     */
    Customer selectById(long id);

    /**
     * 客户分页查询
     * @param customer 客户
     * @return Page
     */
    Page<Customer> selectPage(Customer customer);
}
