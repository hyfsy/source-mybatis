package com.hyf.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScannerRegistrar;

import com.hyf.mapper.UserMapper;
import com.hyf.pojo.User;

/**
 * @author baB_hyf
 * @date 2020/05/16
 */
public class HelloTests
{

    /**
     * 测试 mybatis源码
     */
    @Test
    public void testHello() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
    }

    /**
     * 测试 mybatis-spring源码
     */
    @Test
    public void testMybatisSpring() {
        new MapperScannerRegistrar();
    }


    //---------------------------------------------------------------------
    // basic
    //---------------------------------------------------------------------

    private SqlSession sqlSession;

    @Before
    public void loadEnv() throws Exception {
        String configPath = "config/mybatis-config.xml";
        InputStream resource = Resources.getResourceAsStream(configPath);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @After
    public void closeSession() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
