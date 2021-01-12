/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Henry
 */
public class Grade {

    float labs, projectTest, finalExam;

    public Grade(float labs, float projectTest, float finalExam) {
        this.labs = labs;
        this.projectTest = projectTest;
        this.finalExam = finalExam;
    }

    public float getLabs() {
        return labs;
    }

    public void setLabs(float labs) {
        this.labs = labs;
    }

    public float getProjectTest() {
        return projectTest;
    }

    public void setProjectTest(float projectTest) {
        this.projectTest = projectTest;
    }

    public float getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(float finalExam) {
        this.finalExam = finalExam;
    }

    @Override
    public String toString() {
        return "Grade{" + "labs=" + labs + ", projectTest=" + projectTest + ", finalExam=" + finalExam + '}';
    }
}
