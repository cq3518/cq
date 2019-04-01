package com.example.demo.cq.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.cq.entity.TbUser;
import com.example.demo.cq.service.TbUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cq
 * @since 2019-03-24
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("tbUser")
@Slf4j
public class TbUserController {
    @Autowired
    private TbUserService tbUserService;
    @GetMapping("/hello")
    public String index(){
        return  "tbUser --!";
    }
    /**
     * 查询信息
     * @param page 当前页面
     * @param tbUser
     * @return
     */
    @PostMapping("/selectByPage")
    public List<TbUser> showByPage(Page page,  TbUser tbUser) {

        Page<TbUser> pageList=tbUserService.findAll(page,tbUser);


        return pageList.getRecords();
    }
}
