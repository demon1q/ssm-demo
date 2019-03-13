package cn.demon.service;

import cn.demon.pojo.PageBean;

import java.util.List;

/**
 * @desciption: 将CRUD封装起来
 * @author: Demon
 * @version: 1.0 2019-03-13 09:18
 **/
public interface BaseService<T> {
    /**
     * 查询所有
     *
     * @return
     */
    List<T> findAll();

    /**
     * 根据id查询
     */
    T findById(long id);

    /**
     * 新增
     */
    void create(T t);

    /**
     * 更新
     */
    void update(T t);

    /**
     * 删除
     */
    void delete(long id);

    /**
     * 分页查询
     *
     * @param t        查询对象
     * @param pageCode 页码
     * @param pageSize 每页个数
     */
    PageBean<T> findByPage(int pageCode, int pageSize, T t);
}
