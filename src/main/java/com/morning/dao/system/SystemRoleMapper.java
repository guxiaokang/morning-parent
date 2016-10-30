package com.morning.dao.system;

import java.util.List;

import com.morning.entity.system.SystemRole;

/**
 * 
*    
* 项目名称：morning Maven Webapp   
* 类名称：SystemRoleMapper   
* 类描述：系统角色持久层接口   
* 创建人：陈星星   
* 创建时间：2016年10月23日 下午9:00:27   
* 修改人：陈星星   
* 修改时间：2016年10月23日 下午9:00:27   
* 修改备注：   
* @version    
*
 */
public interface SystemRoleMapper {
	
	/**
	 * 通过管理员ID，查询角色信息
	 * @param accountId 账户ID
	 * @return
	 */
	public List<SystemRole> queryRoleByUserId(Integer accountId);
	
	/**
	 * 查询角色列表
	 * @return List<SystemRole> 管理员列表
	 */
	public List<SystemRole> queryRoleList();
	
	/**
	 * 查询角色人数
	 * @param roleId  角色编号
	 * @return	int 数量
	 */
	public int queryRoleNumber(Integer roleId);
}