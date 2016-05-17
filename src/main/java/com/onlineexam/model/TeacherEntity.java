package com.onlineexam.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/12.
 */
@Entity
@Table(name = "t_teacher", schema = "", catalog = "db_onlineexam")
public class TeacherEntity {
    private int id;
    private String tname;
    private String tpwd;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tname", nullable = true, insertable = true, updatable = true, length = 20)
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Basic
    @Column(name = "tpwd", nullable = true, insertable = true, updatable = true, length = 20)
    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (id != that.id) return false;
        if (tname != null ? !tname.equals(that.tname) : that.tname != null) return false;
        if (tpwd != null ? !tpwd.equals(that.tpwd) : that.tpwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tname != null ? tname.hashCode() : 0);
        result = 31 * result + (tpwd != null ? tpwd.hashCode() : 0);
        return result;
    }
}
