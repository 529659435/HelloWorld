/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserService
 * Author:   cj
 * Date:     2019/5/16 16:20
 * Description: service类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ym.mybatisdemo.service;
import com.ym.mybatisdemo.bean.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈service类〉
 *
 * @author cj
 * @create 2019/5/16
 * @since 1.0.0
 */
public interface  UserService {

    List<User> getAllUser();

    void insert(User user);

}
