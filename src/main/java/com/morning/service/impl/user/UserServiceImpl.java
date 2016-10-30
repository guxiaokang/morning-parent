package com.morning.service.impl.user;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morning.dao.user.UserMapper;
import com.morning.entity.user.QueryUser;
import com.morning.entity.user.User;
import com.morning.service.user.UserService;

/**
 * 
 * @description：前台用户业务逻辑层
 * @author CXX
 * @version 创建时间：2016年8月12日  下午11:02:37
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	/**
	 * 在service定义：不需要再写setDao的方法就可以通过接口调用Dao
	 */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * @Override是伪代码,表示重写(当然不写也可以)
	 */
	@Override    
	public int createUser(User user) {
		return userMapper.createUser(user);
	}
	
	@Override
	public void updateUserLoginLog(Integer accountId, Date lastLoginTime,
			String lastLoginIp) {
		Map<String,Object> parameter = new HashMap<String, Object>();
		parameter.put("accountId", accountId);
		parameter.put("lastLoginTime", lastLoginTime);
		parameter.put("lastLoginIp", lastLoginIp);
		userMapper.updateUserLoginLog(parameter);
	}

	@Override
	public User queryUserById(Integer accountId) {
		return userMapper.queryUserById(accountId);
	}
	
	@Override
	public User queryUserByEmail(String email) {
		return userMapper.queryUserByEmail(email);
	}
	
	@Override
	public List<User> queryUserList(QueryUser queryUser) {
		return userMapper.queryUserList(queryUser);
	}
	
	@Override
	public User selectByUser(User user) {
		return userMapper.selectByUser(user);
	}

	@Override
	public boolean checkMobile(String mobile) {
		int count = userMapper.checkMobile(mobile);
		if(count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkEmail(String email) {
		int count = userMapper.checkEmail(email);
		if(count>0){
			return true;
		}
		return false;
	}

	@Override
	public User getLoginUser(String loginName, String loginPassword) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("loginName", loginName);
		map.put("loginPassword", loginPassword);
		return userMapper.getLoginUser(map);
	}

	@Override
	public void updateUserPwd(User user) {
		userMapper.updateUserPwd(user);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public void updateImg(User user) {
		userMapper.updateImg(user);
	}

	@Override
	public int getUserNumber() {
		return userMapper.getUserNumber();
	}

	@Override
	public void updateUserStates(User user) {
		userMapper.updateUserStates(user);
	}

	@Override
	public void deleteUser(Integer accountId) {
		userMapper.deleteUser(accountId);
	}
}
