package cn.demon.service.impl;

import cn.demon.dao.CustomerMapper;
import cn.demon.pojo.Customer;
import cn.demon.pojo.PageBean;
import cn.demon.service.CustomerService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desciption:
 * @author: Demon
 * @version: 1.0 2019-03-13 09:21
 **/
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerServiceImpl(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(long id) {
        return customerMapper.selectById(id);
    }

    @Override
    public void create(Customer customer) {
        customerMapper.insert(customer);
    }

    @Override
    public void update(Customer customer) {
        customerMapper.update(customer);
    }

    @Override
    public void delete(long id) {
        customerMapper.delete(id);
    }

    @Override
    public PageBean<Customer> findByPage(int pageCode, int pageSize, Customer customer) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode,pageSize);

        //调用分页查询方法，其实就是查询所有数据，mybatis自动帮我们进行分页计算
        Page<Customer> page = customerMapper.selectPage(customer);
        return new PageBean<Customer>(pageCode,(int)(page.getTotal()-1)/pageSize+1,(int)page.getTotal(),pageSize,page.getResult());
    }
}
