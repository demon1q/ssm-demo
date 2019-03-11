package cn.demon.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @desciption: 分页
 * @author: Demon
 * @version: 1.0 2019-03-11 09:50
 **/
public class PageBean<T> implements Serializable {
    /**
     * 当前页
     */
    private int pageCode;

    /**
     * 总页数=总条数/每页显示的条数
     */
    private int totalPage;

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 每页显示的记录条数
     */
    private int pageSize;

    /**
     * 每页显示的数据
     */
    private List<T> beanList;
}
