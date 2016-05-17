package com.onlineexam.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/12.
 */
@Entity
@Table(name = "t_subject", schema = "", catalog = "db_onlineexam")
public class SubjectEntity {
    private int id;
    private String subjectname;
    private Float singleper;
    private Integer singlenumber;
    private Integer testtime;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subjectname", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    @Basic
    @Column(name = "singleper", nullable = true, insertable = true, updatable = true, precision = 0)
    public Float getSingleper() {
        return singleper;
    }

    public void setSingleper(Float singleper) {
        this.singleper = singleper;
    }

    @Basic
    @Column(name = "singlenumber", nullable = true, insertable = true, updatable = true)
    public Integer getSinglenumber() {
        return singlenumber;
    }

    public void setSinglenumber(Integer singlenumber) {
        this.singlenumber = singlenumber;
    }

    @Basic
    @Column(name = "testtime", nullable = true, insertable = true, updatable = true)
    public Integer getTesttime() {
        return testtime;
    }

    public void setTesttime(Integer testtime) {
        this.testtime = testtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectEntity that = (SubjectEntity) o;

        if (id != that.id) return false;
        if (subjectname != null ? !subjectname.equals(that.subjectname) : that.subjectname != null) return false;
        if (singleper != null ? !singleper.equals(that.singleper) : that.singleper != null) return false;
        if (singlenumber != null ? !singlenumber.equals(that.singlenumber) : that.singlenumber != null) return false;
        if (testtime != null ? !testtime.equals(that.testtime) : that.testtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (subjectname != null ? subjectname.hashCode() : 0);
        result = 31 * result + (singleper != null ? singleper.hashCode() : 0);
        result = 31 * result + (singlenumber != null ? singlenumber.hashCode() : 0);
        result = 31 * result + (testtime != null ? testtime.hashCode() : 0);
        return result;
    }
}
