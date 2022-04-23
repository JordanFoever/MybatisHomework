package com.hxut.mybatis.mapper;

import com.hxut.mybatis.pojo.Tbvideo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author weijiangquan
 * @date 2022/4/22 -20:43
 */
public interface TbvideoMapper {

    // 往表中插入一行数据
    boolean insert(Tbvideo video);

    //更新表中的数据
    boolean update();

    //删除一行数据
    boolean delete(int id);

    //通过id查找数据
    Tbvideo selectById(@Param("id") int id);

    //查找所有的用户
    @Select("select * from tbvideo")
    List<Tbvideo> selectAll();



}
