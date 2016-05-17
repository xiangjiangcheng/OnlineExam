package com.onlineexam.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/5/12.
 */
@Entity
@Table(name = "t_scores", schema = "", catalog = "db_onlineexam")
public class ScoresEntity {
    private int id;
    private String sname;
    private String snumber;
    private String subjectname;
    private Float score;
    private Timestamp endtime;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sname", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "snumber", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
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
    @Column(name = "score", nullable = true, insertable = true, updatable = true, precision = 0)
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Basic
    @Column(name = "endtime", nullable = true, insertable = true, updatable = true)
    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScoresEntity that = (ScoresEntity) o;

        if (id != that.id) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (snumber != null ? !snumber.equals(that.snumber) : that.snumber != null) return false;
        if (subjectname != null ? !subjectname.equals(that.subjectname) : that.subjectname != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (endtime != null ? !endtime.equals(that.endtime) : that.endtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (snumber != null ? snumber.hashCode() : 0);
        result = 31 * result + (subjectname != null ? subjectname.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        return result;
    }
}
