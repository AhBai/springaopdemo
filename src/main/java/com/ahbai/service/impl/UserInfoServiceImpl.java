package com.ahbai.service.impl;

import com.ahbai.dto.RoleDto;
import com.ahbai.mapper.UserInfoMapper;
import com.ahbai.pojo.UserInfo;
import com.ahbai.service.UserInfoService;
import com.ahbai.tool.MD5Utils;
import com.ahbai.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;


//    public List<UserInfo> findAll(UserInfoVo userInfoVo) {
//
//
//        return userInfoMapper.findAll(userInfoVo);
//    }

    /**
     * 登录
     * @param userInfo
     * @return
     */
    public UserInfo findLogin(UserInfo userInfo) {
        userInfo.setPassword(MD5Utils.myEncode(userInfo.getPassword()));
        return userInfoMapper.findLogin(userInfo);
    }

    /**
     * 跳转用户维护 + 模糊查询
     * @return
     */
    public List<UserInfo> getListUserInfo(UserInfoVo userInfoVo) {

        List<UserInfo> listUserInfo = userInfoMapper.getListUserInfo(userInfoVo);
        return listUserInfo;
    }

    /**
     * 新添
     * @param userInfo
     * @return
     */
    public int addUserInfo(UserInfo userInfo) {
        userInfo.setPassword(MD5Utils.myEncode(userInfo.getPassword()));
        int i = userInfoMapper.addUserInfo(userInfo);
        return i;
    }

    public UserInfo findById(int id) {

        return userInfoMapper.findById(id);
    }

    /**
     * 修改
     * @param userInfo
     * @return
     */
    public int updateUser(UserInfo userInfo) {
        return userInfoMapper.updateUser(userInfo);
    }
    /**
     * 用id查找roleInfo
     */
    public List<RoleDto> getRole(int id) {
        return userInfoMapper.getRole(id);
    }

    /**
     * 根据userid修改user_role
     */
    public boolean updateRole(UserInfoVo userInfoVo) {
        int d=userInfoMapper.deleteRole(userInfoVo);
        int a=userInfoMapper.addRole(userInfoVo);
            if (a>0&&d>0){
                return true;
            }
        return false;
    }

}
