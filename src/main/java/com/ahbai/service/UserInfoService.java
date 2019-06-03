package com.ahbai.service;

import com.ahbai.dto.RoleDto;
import com.ahbai.pojo.UserInfo;
import com.ahbai.vo.UserInfoVo;

import java.util.List;

public interface UserInfoService {

//    List<UserInfo> findAll(UserInfoVo userInfoVo);

    /**
     * 登录
     * @param userInfo
     * @return
     */
    UserInfo findLogin(UserInfo userInfo);

    /**
     * 跳转用户维护 + 模糊查询
     * @return
     */
    List<UserInfo> getListUserInfo(UserInfoVo userInfoVo);

    /**
     * 新添
     */
    int addUserInfo(UserInfo userInfo);

    /**
     * 用id查找
     */
    UserInfo findById(int id);

    /**
     * 修改
     * @param userInfo
     * @return
     */
    int updateUser(UserInfo userInfo);

    /**
     * 用id查找roleInfo
     */
    List<RoleDto> getRole(int id);
    /**
     * 根据userid修改user_role
     */
    boolean updateRole(UserInfoVo userInfoVo);
}
