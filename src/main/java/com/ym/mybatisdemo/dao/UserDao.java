/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserDao
 * Author:   cj
 * Date:     2019/5/16 16:21
 * Description: 数据层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ym.mybatisdemo.dao;

import com.ym.mybatisdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数据层〉
 *
 * @author cj
 * @create 2019/5/16
 * @since 1.0.0
 */
@Mapper
public interface  UserDao {

    List<User> getAllUser();
    void insert(User user);
}
