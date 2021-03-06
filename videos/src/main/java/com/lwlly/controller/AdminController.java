package com.lwlly.controller;


import com.lwlly.pojo.Admin;
import com.lwlly.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lwlly
 * @since 2020-12-23
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("findAll")
    public List<Admin> findAll() {
        return adminService.findAll();
    }

}
