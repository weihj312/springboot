package com.lwlly.dao;

import com.lwlly.pojo.Subject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 学科表，存储各个学科的名字 Mapper 接口
 * </p>
 *
 * @author lwlly
 * @since 2020-12-23
 */
@Repository
@Mapper
public interface SubjectMapper extends BaseMapper<Subject> {

}
