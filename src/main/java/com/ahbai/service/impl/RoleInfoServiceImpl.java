package com.ahbai.service.impl;

import com.ahbai.dto.MenuInfoDto;
import com.ahbai.dto.RoleInfoDto;
import com.ahbai.mapper.RoleInfoMapper;
import com.ahbai.pojo.RoleInfo;
import com.ahbai.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    RoleInfoMapper roleInfoMapper;
    /**
     *获取roleInfo加模糊查找
     */
    public List<RoleInfo> getRoleInfos(RoleInfoDto roleInfo) {

        return roleInfoMapper.getRoleInfos(roleInfo);
    }

    public List<MenuInfoDto> getMenus(int userId) {

        return roleInfoMapper.getMenus(userId);
    }
    /**
     *获取菜单烂
     */
    public List<MenuInfoDto> getMenuInfos(int id) {

        return roleInfoMapper.getMenuInfos(id);
    }
}
