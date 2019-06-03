package com.ahbai.controller;


import com.ahbai.dto.MenuInfoDto;
import com.ahbai.dto.RoleInfoDto;
import com.ahbai.pojo.RoleInfo;
import com.ahbai.pojo.UserInfo;
import com.ahbai.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService roleInfoService;
    /**
     *获取roleInfo加模糊查找
     */
    @RequestMapping(value = "getRoleInfos")
    public Object getRole(RoleInfoDto roleInfo){

        List<RoleInfo> roleInfos =roleInfoService.getRoleInfos(roleInfo);
        return roleInfos;
    }

    /**
     *根据userid获取menu
     */
    @RequestMapping(value = "getMenuInfo")
    public Object getMenuInfo(HttpSession httpSession){

//        UserInfo userInfo = (UserInfo) httpSession.getAttribute("userInfo");
//        int userId = userInfo.getUserId();
        List<MenuInfoDto> menuInfoDto= roleInfoService.getMenus(3);
        return menuInfoDto;
    }

    /**
     *获取菜单烂
     */
    @RequestMapping(value = "getMenuInfos")
    public Object getMenuInfos(HttpSession httpSession){
       UserInfo userInfo= (UserInfo) httpSession.getAttribute("userInfo");
        List<MenuInfoDto> menuInfoDto= roleInfoService.getMenuInfos(userInfo.getUserId());
        return menuInfoDto;
    }

}
