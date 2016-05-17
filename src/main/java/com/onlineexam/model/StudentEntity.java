package com.onlineexam.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/12.
 */
@Entity
@Table(name = "t_student", schema = "", catalog = "db_onlineexam")
public class StudentEntity {
    private int id;
    private String sname;
    private String snumber;
    private String spwd;
    private String smail;
    private String stel;
    private String saddress;

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
    @Column(name = "spwd", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    @Basic
    @Column(name = "smail", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSmail() {
        return smail;
    }

    public void setSmail(String smail) {
        this.smail = smail;
    }

    @Basic
    @Column(name = "stel", nullable = true, insertable = true, updatable = true, length = 20)
    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    @Basic
    @Column(name = "saddress", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (snumber != null ? !snumber.equals(that.snumber) : that.snumber != null) return false;
        if (spwd != null ? !spwd.equals(that.spwd) : that.spwd != null) return false;
        if (smail != null ? !smail.equals(that.smail) : that.smail != null) return false;
        if (stel != null ? !stel.equals(that.stel) : that.stel != null) return false;
        if (saddress != null ? !saddress.equals(that.saddress) : that.saddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (snumber != null ? snumber.hashCode() : 0);
        result = 31 * result + (spwd != null ? spwd.hashCode() : 0);
        result = 31 * result + (smail != null ? smail.hashCode() : 0);
        result = 31 * result + (stel != null ? stel.hashCode() : 0);
        result = 31 * result + (saddress != null ? saddress.hashCode() : 0);
        return result;
    }
}
