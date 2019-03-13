package cn.demon.controller;

import cn.demon.pojo.Customer;
import cn.demon.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @desciption: 客户控制器
 * @author: Demon
 * @version: 1.0 2019-03-12 14:56
 **/
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * 跳转客户添加功能页面
     */
    @RequestMapping("/toSavePage")
    public ModelAndView toSavePage(){
        return new ModelAndView("page/save");
    }

    /**
     * 跳转分页查询功能页面
     */
    @RequestMapping("/toListPage")
    public ModelAndView toListPage(){
        return new ModelAndView("redirect:findByPage.do");
    }

    /**
     * 保存
     * @param customer 客户信息
     * @return 返回成功界面
     */
    @RequestMapping("/save")
    public ModelAndView save(Customer customer){
        customerService.create(customer);
        return new ModelAndView("page/info","message","保存成功");
    }

    /**
     * 客户信息删除的方法
     *
     * @param id 客户id
     * @return 删除成功界面
     */
    @RequestMapping(value = "/delete")
    public String delete(@RequestParam long id, Model model) {
        try {
            customerService.delete(id);
            model.addAttribute("message", "删除客户信息成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/info";
    }

    /**
     * 根据id查询客户信息方法
     *
     * @param customer
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findById")
    public Customer findById(@RequestBody Customer customer) {
        Customer customerInfo = customerService.findById(customer.getId());
        if (customerInfo != null) {
            return customerInfo;
        } else {
            return null;
        }
    }

    /**
     * 更新客户信息的方法
     *
     * @param customer
     * @param model
     * @return
     */
    @RequestMapping(value = "/update")
    public String update(Customer customer, Model model) {
        try {
            customerService.update(customer);
            model.addAttribute("message", "更新客户信息成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/info";
    }

    /**
     * 分页查询
     *
     * @param customer 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页显示的记录数
     * @return 返回分页查询界面
     */
    @RequestMapping("/findByPage")
    public ModelAndView findByPage(@RequestParam(value = "pageCode",required = false,defaultValue = "1") int pageCode,
                                   @RequestParam(value = "pageSize",required = false,defaultValue = "2") int pageSize,
                                   Customer customer){
        return new ModelAndView("page/list","page",customerService.findByPage(pageCode,pageSize,customer));
    }
}
