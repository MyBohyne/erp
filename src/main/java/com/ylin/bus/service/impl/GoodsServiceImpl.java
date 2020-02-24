package com.ylin.bus.service.impl;

import com.ylin.bus.entity.Goods;
import com.ylin.bus.mapper.GoodsMapper;
import com.ylin.bus.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.io.Serializable;

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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

	
	@Override
	public boolean save(Goods entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}
	
	@Override
	public boolean updateById(Goods entity) {
		// TODO Auto-generated method stub
		return super.updateById(entity);
	}
	
	@Override
	public boolean removeById(Serializable id) {
		// TODO Auto-generated method stub
		return super.removeById(id);
	}
	
	@Override
	public Goods getById(Serializable id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}
}
