package cn.demon.pojo;

import java.util.List;

/**
 * @desciption: 分页
 * @author: Demon
 * @version: 1.0 2019-03-11 09:50
 **/
public class PageBean<T>{
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

    public PageBean() {
    }

    public PageBean(int pageCode, int totalPage, int totalCount, int pageSize, List<T> beanList) {
        this.pageCode = pageCode;
        this.totalPage = totalPage;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.beanList = beanList;
    }

    public int getPageCode() {
        return pageCode;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<T> beanList) {
        this.beanList = beanList;
    }
}
