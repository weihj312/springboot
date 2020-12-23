package com.lwlly.service;

import com.lwlly.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lwlly
 * @since 2020-12-23
 */
public interface AdminService extends IService<Admin> {

    List<Admin> findAll();
}
