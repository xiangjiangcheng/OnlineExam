package com.onlineexam.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/5/12.
 */
@Entity
@Table(name = "t_question", schema = "", catalog = "db_onlineexam")
public class QuestionEntity {
    private int id;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    private String weight;
    private String subjectname;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "question", nullable = true, insertable = true, updatable = true, length = 255)
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "optionA", nullable = true, insertable = true, updatable = true, length = 255)
    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    @Basic
    @Column(name = "optionB", nullable = true, insertable = true, updatable = true, length = 255)
    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    @Basic
    @Column(name = "optionC", nullable = true, insertable = true, updatable = true, length = 255)
    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    @Basic
    @Column(name = "optionD", nullable = true, insertable = true, updatable = true, length = 255)
    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    @Basic
    @Column(name = "answer", nullable = true, insertable = true, updatable = true, length = 10)
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "weight", nullable = true, insertable = true, updatable = true, length = 10)
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "subjectname", nullable = true, insertable = true, updatable = true, length = 20)
    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionEntity that = (QuestionEntity) o;

        if (id != that.id) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (optionA != null ? !optionA.equals(that.optionA) : that.optionA != null) return false;
        if (optionB != null ? !optionB.equals(that.optionB) : that.optionB != null) return false;
        if (optionC != null ? !optionC.equals(that.optionC) : that.optionC != null) return false;
        if (optionD != null ? !optionD.equals(that.optionD) : that.optionD != null) return false;
        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (subjectname != null ? !subjectname.equals(that.subjectname) : that.subjectname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (optionA != null ? optionA.hashCode() : 0);
        result = 31 * result + (optionB != null ? optionB.hashCode() : 0);
        result = 31 * result + (optionC != null ? optionC.hashCode() : 0);
        result = 31 * result + (optionD != null ? optionD.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (subjectname != null ? subjectname.hashCode() : 0);
        return result;
    }
}
