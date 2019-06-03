package com.ahbai.mapper;

import com.ahbai.dto.RoleDto;
import com.ahbai.pojo.UserInfo;

import com.ahbai.vo.UserInfoVo;


import java.util.List;

public interface UserInfoMapper {

//    List<User> findAll(UserVo userVo);

//    List<UserInfo> findAll(UserInfoVo userInfoVo);
//    /**
//     * 添加数据
//     */
//    int allUserInfo(UserInfo userInfo);
//    /**
//     * 修改数据
//     */
//    int updateUserInfo(UserInfo userInfo);
//    /**
//     * 删除数据
//     */
//    int deleteUserIfon(UserInfoVo userInfoVo);

    /**
     *登录
     */
    UserInfo findLogin(UserInfo userInfo);

    /**
     * 跳转用户维护 + 模糊查询
     */
    List<UserInfo> getListUserInfo(UserInfoVo userInfoVo);

    /**
     * 新填
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
    int deleteRole(UserInfoVo userInfoVo);
    int addRole(UserInfoVo userInfoVo);
}
