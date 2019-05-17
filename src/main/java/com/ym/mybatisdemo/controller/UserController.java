/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserController
 * Author:   cj
 * Date:     2019/5/16 16:27
 * Description: 控制层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ym.mybatisdemo.controller;
import com.ym.mybatisdemo.bean.User;
import com.ym.mybatisdemo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈控制层〉
 *
 * @author cj
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/hello")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping(value = "/insert")
    public void insert(@Param("id") int id,
                       @RequestParam("user_name") String username,
                       @Param("age") String age,
                       @Param("sex") String sex){
        User user = new User();
        user.setId(id);
        user.setUserName(username);
        user.setAge(age);
        user.setSex(sex);
        userService.insert(user);
    }
}
