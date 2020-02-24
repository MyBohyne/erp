package com.ylin.sys.service;

import com.ylin.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaoke
 * @since 2019-09-20
 */
public interface UserService extends IService<User> {

	/**
	 * 保存用户和角色之间的关系
	 * @param uid
	 * @param ids
	 */
	void saveUserRole(Integer uid, Integer[] ids);

}
