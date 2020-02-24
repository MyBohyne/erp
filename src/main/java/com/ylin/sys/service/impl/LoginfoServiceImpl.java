package com.ylin.sys.service.impl;

import com.ylin.sys.entity.Loginfo;
import com.ylin.sys.mapper.LoginfoMapper;
import com.ylin.sys.service.LoginfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoke
 * @since 2019-09-21
 */
@Service
@Transactional
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements LoginfoService {

}
