package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.server.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * <p>
 * 管理员表 Mapper 接口
 * </p>
 *
 * @author Bing
 * @since 2021-01-13
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
    /**
     * 获取所有的操作员
     * @param id
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(@Param("id") Integer id,@Param("keywords") String keywords);
}
