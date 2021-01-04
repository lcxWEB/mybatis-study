package com.change.dao;

import com.change.pojo.Student;
import com.change.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: lichunxia
 * @create: 2021-01-04 23:08
 */
public class StudentDaoTest {

    // org.apache.ibatis.binding.BindingException: Type interface com.change.dao.StudentDao is not known to the MapperRegistry.

    @Test
    public void test() {
        // 获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = studentDao.getStudentList();
        System.out.println(studentList);
        sqlSession.close();
    }

}
