package com.suncreate.mvn.mapper.auth;

import java.util.List;

import com.suncreate.mvn.entity.auth.Role;
import com.suncreate.mvn.mapper.BaseMapper;

/**
 * @author Vincent.wang
 *
 */
public interface RoleMapper extends BaseMapper<String, Role> {

    /**
     * 根据用户查询对应所有角色
     *
     * @param userId
     *            用户
     * @return roles 所有角色
     */
    public List<Role> findRoleByUserId(String userId);

    /**
     * 根据编码查询角色
     *
     * @param code
     *            角色编码
     * @return
     */
    public Role findRoleByCode(String code);

}
