package com.example.demo.cq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.cq.entity.TbUser;
import com.example.demo.cq.mapper.TbUserMapper;
import com.example.demo.cq.service.TbUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cq
 * @since 2019-03-24
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

    @Override
    public Page<TbUser> findAll(Page page , TbUser tbUser) {
        QueryWrapper<TbUser> wrapper=new QueryWrapper<>();
        wrapper.like("username",tbUser.getUsername());
        IPage<TbUser> list =this.baseMapper.selectPage(page,wrapper);
         return (Page)list;
    }

    @Override
    public List<TbUser> findAllOne() {
        return this.baseMapper.findAllOne();
    }
}
