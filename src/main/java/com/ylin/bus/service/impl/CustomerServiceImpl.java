package com.ylin.bus.service.impl;

import com.ylin.bus.entity.Customer;
import com.ylin.bus.mapper.CustomerMapper;
import com.ylin.bus.service.CustomerService;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

	
	@Override
	public boolean save(Customer entity) {
		return super.save(entity);
	}
	
	@Override
	public boolean updateById(Customer entity) {
		return super.updateById(entity);
	}
	
	@Override
	public boolean removeById(Serializable id) {
		return super.removeById(id);
	}
	@Override
	public Customer getById(Serializable id) {
		return super.getById(id);
	}
	
	@Override
	public boolean removeByIds(Collection<? extends Serializable> idList) {
		return super.removeByIds(idList);
	}
	
}
