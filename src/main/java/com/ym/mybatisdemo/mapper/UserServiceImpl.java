/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   cj
 * Date:     2019/5/16 16:20
 * Description: service实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ym.mybatisdemo.mapper;
import com.ym.mybatisdemo.bean.User;
import com.ym.mybatisdemo.dao.UserDao;
import com.ym.mybatisdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈service实现类〉
 *
 * @author cj
 * @create 2019/5/16
 * @since 1.0.0
 */
@Service
public class UserServiceImpl  implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }
}
