package com.example.demo.cq.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.cq.entity.TbUser;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cq
 * @since 2019-03-24
 */
public interface TbUserService extends IService<TbUser> {
    /**
     * 查询信息
     * @param page
     * @param tbUser
     * @return
     */
    Page<TbUser> findAll(Page page ,TbUser tbUser);

    List<TbUser> findAllOne();
}
