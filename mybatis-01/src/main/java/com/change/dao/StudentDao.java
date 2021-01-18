package com.change.dao;

import com.change.pojo.Student;

import java.util.List;

/**
 * mapper
 *
 * @author: lichunxia
 * @create: 2021-01-04 22:12
 */
public interface StudentDao {

    // ResultSet
    List<Student> getStudentList();

    int insert(Student student);

}
