package com.xxx.server.util;

import com.xxx.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author li
 * @create @create 2023-02-05 15:58
 */
public class AdminUtil {

    /**
     * 获取当前登录操作员
     * @return
     */
    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
