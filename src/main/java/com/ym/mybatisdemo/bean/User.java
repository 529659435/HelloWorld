/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   cj
 * Date:     2019/5/16 16:16
 * Description: 用户类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ym.mybatisdemo.bean;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.validation.annotation.Validated;
import lombok.Data;
import lombok.ToString;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户类〉
 *
 * @author cj
 * @create 2019/5/16
 * @since 1.0.0
 */
@Data
@ToString
@Validated
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class User {

    private int id;
    private String userName;
    private String age;
    private String sex;

}
