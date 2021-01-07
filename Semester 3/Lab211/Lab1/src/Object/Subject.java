package Object;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Subject {

    String SubjectId;
    String subjectName;
    int credit;

    public Subject() {
    }

    public Subject(String SubjectId, String subjectName, int credit) {
        this.SubjectId = SubjectId;
        this.subjectName = subjectName;
        this.credit = credit;
    }

    public Subject(String SubjectId) {
        this.SubjectId = SubjectId;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String SubjectId) {
        this.SubjectId = SubjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Subject{" + "SubjectId=" + SubjectId + ", subjectName=" + subjectName + ", credit=" + credit + '}';
    }

}
