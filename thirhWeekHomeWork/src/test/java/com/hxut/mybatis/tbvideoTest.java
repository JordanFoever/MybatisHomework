package com.hxut.mybatis;

import com.hxut.mybatis.mapper.TbvideoMapper;
import com.hxut.mybatis.pojo.Tbvideo;
import com.hxut.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author weijiangquan
 * @date 2022/4/22 -21:20
 */
public class tbvideoTest {

    /**
     * 插入数据
     * @throws IOException
     */

    @Test
    public void insertYiHanDataAtTbvideo() throws IOException {
        // 这是静态方法不用通过new的方式创建出来,直接通过点类名的方式弄出来
        SqlSession session = SqlSessionUtils.getSqlSession();
        TbvideoMapper mapper = session.getMapper(TbvideoMapper.class);
        //5.获取Mapper对象(反射,设计模式之代理模式)

        // 创建实例对象，先将数据存放在对象中
        Tbvideo tbvideo = new Tbvideo();
        tbvideo.setTitle("我是小小卫");
        tbvideo.setContent("漠漠轻寒上小楼,晓阴无赖似穷秋");
        tbvideo.setCoverimg("https://img-blog.csdnimg.cn/6a4f5ae1d2c941b288fc328bbbfc8749.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBA5a2R5a2T6bK46JC9,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center");
        tbvideo.setVideopath("dhakshdahdklsa");
        // tbvideo.getPublishtime();
        tbvideo.setLovecount(21);
        tbvideo.setViewcount(12);
        tbvideo.setOntop(1);
        tbvideo.setDuration(121);
        tbvideo.setDuration(15789456);
        tbvideo.setSize(123);
        tbvideo.setStatus(1);
        tbvideo.setTags("adsd");
        // tbvideo.setCid(1);
        // tbvideo.setUid(1);

        // 通过这种方式传给接口
        mapper.insert(tbvideo);
    }

    /**
     * 更新一行数据
     * @throws IOException
     */
    @Test
    public void updateDataAtTbvideo() throws IOException {
        SqlSession session = SqlSessionUtils.getSqlSession();
        //5.获取Mapper对象(反射,设计模式之代理模式)
        TbvideoMapper mapper = session.getMapper(TbvideoMapper.class);
        mapper.update();

    }

    /**
     * 删除一行数据
     */
    @Test
    public void deleteDataAtTbvideo(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        //5.获取Mapper对象(反射,设计模式之代理模式)
        TbvideoMapper mapper = session.getMapper(TbvideoMapper.class);

         Tbvideo tbvideo =  new Tbvideo();
         tbvideo.setId(4);
        mapper.delete((int)tbvideo.getId());

    }

    /**
     * 通过id进行查找一行数据
     */

    @Test
    public void getDataByIdTest(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        //5.获取Mapper对象(反射,设计模式之代理模式)
        TbvideoMapper mapper = session.getMapper(TbvideoMapper.class);

        System.out.println(mapper.selectById(6) instanceof Object);
        // System.out.println(mapper.selectById(6));

    }
    // 查找所有的数据

    /**
     * 查找所有的数据
     * @param
     * @return
     */
    @Test
    public void getAllDataTest(){
        SqlSession session = SqlSessionUtils.getSqlSession();
        //5.获取Mapper对象(反射,设计模式之代理模式)
        TbvideoMapper mapper = session.getMapper(TbvideoMapper.class);

        List<Tbvideo> list = mapper.selectAll();
        list.forEach(System.out::println);
    }


    // 下面是检测的方法(测试的玩的)
    public TestMyThink checkMyThink(int a){
        TestMyThink testMyThink = new TestMyThink();
        testMyThink.setId(a);
        testMyThink.setA(12);
        testMyThink.setB(23);

        // ArrayList<TestMyThink> tList = new ArrayList<TestMyThink>();
        int[] bb = new int[3];
        bb[0] = testMyThink.getId();
        bb[1] = testMyThink.getA();
        bb[2] = testMyThink.getB();

        return null;
    }
    @Test
    public void Test(){
        System.out.println("对象输出的值是"+checkMyThink(12));
    }



}
class TestMyThink{
    private int a;
    private int b;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}







