package com.onlineexam.repository;

        import com.onlineexam.model.StudentEntity;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Modifying;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;
        import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/5/12.
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{
    /**
     * 修改学生信息
     * 参数：studentid
     */
    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update StudentEntity st set st.sname=:sname, st.snumber=:snumber, st.spwd=:spwd, st.smail=:smail, st.stel=:stel, st.saddress=:saddress where st.id=:id")
    public void updateStudent(@Param("sname") String sname, @Param("snumber") String snumber,
                              @Param("spwd") String spwd, @Param("smail") String smail, @Param("stel") String stel, @Param("saddress") String saddress, @Param("id") Integer id);
}
