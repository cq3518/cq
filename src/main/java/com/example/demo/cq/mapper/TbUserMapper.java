package com.example.demo.cq.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.cq.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cq
 * @since 2019-03-24
 */
public interface TbUserMapper extends BaseMapper<TbUser> {
    /**
     * 查询
     * @param tbUser
     * @return
     */
    List<TbUser> findAll(TbUser tbUser);

    List<TbUser> findAllOne();
}
