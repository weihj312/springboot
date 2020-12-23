package com.lwlly.service.impl;

import com.lwlly.pojo.Admin;
import com.lwlly.dao.AdminMapper;
import com.lwlly.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lwlly
 * @since 2020-12-23
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> findAll() {
        return adminMapper.selectList(null);
    }
}
