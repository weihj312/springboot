package com.lwlly.service.impl;

import com.lwlly.pojo.Video;
import com.lwlly.dao.VideoMapper;
import com.lwlly.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lwlly
 * @since 2020-12-23
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
