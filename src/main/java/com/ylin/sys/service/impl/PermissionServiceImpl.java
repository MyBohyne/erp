package com.ylin.sys.service.impl;

import com.ylin.sys.entity.Permission;
import com.ylin.sys.mapper.PermissionMapper;
import com.ylin.sys.service.PermissionService;
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
 * @since 2019-09-21
 */
@Service
@Transactional
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

	
	@Override
	public boolean removeById(Serializable id) {
		PermissionMapper permissionMapper = this.getBaseMapper();
		//根据权限或菜单ID删除权限表各和角色的关系表里面的数据
		permissionMapper.deleteRolePermissionByPid(id);
		return super.removeById(id);//删除 权限表的数据
	}
}
