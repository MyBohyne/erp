package com.ylin.bus.service.impl;

import com.ylin.bus.entity.Provider;
import com.ylin.bus.mapper.ProviderMapper;
import com.ylin.bus.service.ProviderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaoke
 * @since 2019-09-27
 */
@Service
@Transactional
public class ProviderServiceImpl extends ServiceImpl<ProviderMapper, Provider> implements ProviderService {
	
	@Override
	public boolean save(Provider entity) {
		return super.save(entity);
	}
	@Override
	public boolean updateById(Provider entity) {
		return super.updateById(entity);
	}
	
	@Override
	public boolean removeById(Serializable id) {
		return super.removeById(id);
	}
	
	@Override
	public Provider getById(Serializable id) {
		return super.getById(id);
	}
	
	@Override
	public boolean removeByIds(Collection<? extends Serializable> idList) {
		return super.removeByIds(idList);
	}
	
}