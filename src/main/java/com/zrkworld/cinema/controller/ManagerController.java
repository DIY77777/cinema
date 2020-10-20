package com.zrkworld.cinema.controller;

import com.alibaba.fastjson.JSON;
import com.zrkworld.cinema.Config.RedisUtil;
import com.zrkworld.cinema.pojo.CinemaResult;
import com.zrkworld.cinema.pojo.Manager;
import com.zrkworld.cinema.service.ManagerService;
import com.zrkworld.cinema.utils.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class ManagerController {
    @Resource
    ManagerService managerService;

    @Resource
    RedisUtil redisUtil;
    /**
     *  //获取管理员数据，请求参数managerId
     * export const managerData = query=>{
     *     return request({
     *         url:'getManagerData',
     *         method:'get',
     *         params:query
     *     });
     * };
     * @param managerId
     * @return
     */
    @RequestMapping("getManagerData")
    public CinemaResult getManagerData(String managerId){
        return CinemaResult.ok(managerService.selectByManagerId(managerId));
    }

    @RequestMapping(value = "managerLogin")
    public CinemaResult managerLogin(String managerId, String password){

        Manager manager = (Manager) managerService.managerLogin(managerId, password);

        if (manager == null) {
            return CinemaResult.build(500,"error");
        } else {
            String token = UUID.randomUUID().toString();
            redisUtil.setStr(token, JSON.toJSONString(manager),60*30, TimeUnit.SECONDS);
            Map<String, Object> map = new HashMap<>();
            map.put("token", token);
            map.put("tokenUser", manager);
            return CinemaResult.ok(map);
        }


    }
}
