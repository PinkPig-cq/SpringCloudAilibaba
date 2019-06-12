package com.hpeu.userconsumer.service;

import com.hpeu.pojo.Users;
import com.hpeu.userconsumer.fallback.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 这里是把 对微服务的调用封装成接口 供 消费端调用
 */
@FeignClient(value = "userProvider",fallback = UserServiceFallBack.class)
public interface UserService {
    /**
     * RequestMapping  用来绑定 微服务的方法
     */
    @GetMapping("/index/{id}")
    Users index(@PathVariable("id") int id);
}
