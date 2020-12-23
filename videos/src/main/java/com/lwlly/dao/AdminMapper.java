package com.lwlly.dao;

import com.lwlly.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lwlly
 * @since 2020-12-23
 */
@Repository
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

}
