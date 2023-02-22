package com.xxx.server.exception;

import com.xxx.server.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 * @author li
 * @create @create 2023-02-04 17:09
 */
@RestControllerAdvice
public class GlobalException {

//    @ExceptionHandler(SQLException.class)
//    public RespBean mySqlException(SQLException sqlException){
//        if (sqlException instanceof SQLIntegrityConstraintViolationException){
//            return RespBean.error("该数据有关联数据，操作失败");
//        }
//        return RespBean.error("数据库异常，操作失败!");
//    }

}
