package com.lwlly.dao;

import com.lwlly.pojo.Speaker;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
public interface SpeakerMapper extends BaseMapper<Speaker> {

}
