package com.onlineexam.repository;

import com.onlineexam.model.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/5/16.
 */
@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer>{
    /**
     * 教师登录
     * 参数：教师类
     */
    @Query("select t from TeacherEntity as t where  t.tname=:tname")
    public TeacherEntity findByTname(@Param("tname")String tname);

}
