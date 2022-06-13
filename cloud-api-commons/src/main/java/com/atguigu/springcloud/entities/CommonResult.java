package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.entities
 * @Author: Lu Fang
 * @Date: 2022/6/10 16:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T data;
    
    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}

