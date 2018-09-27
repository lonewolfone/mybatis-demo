package org.lanqiao.dao;

import org.lanqiao.pojo.Student;

import java.io.IOException;
import java.util.List;

public interface StudentDao {
    //添加一条数据
    public void addStu(Student student) throws IOException;
    // 查询所有学生
    public List<Student> findStu();
}
