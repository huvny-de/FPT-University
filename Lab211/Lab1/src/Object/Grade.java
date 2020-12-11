package Object;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Grade extends Subject {

    double labs;
    double progressTest;
    double FinalExam;
   

    public Grade() {
        super();
        labs = 0;
        progressTest = 0;
        FinalExam = 0;

    }

    public Grade(double labs, double progressTest, double FinalExam, String SubjectId) {
        super(SubjectId);
        this.labs = labs;
        this.progressTest = progressTest;
        this.FinalExam = FinalExam;
    }

    
    
    @Override
    public String getSubjectName() {
        return super.getSubjectName(); //nè
    }

    @Override
    public String getSubjectId() {
        return super.getSubjectId(); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Grade(double labs, double progressTest, double FinalExam) {
        this.labs = labs;
        this.progressTest = progressTest;
        this.FinalExam = FinalExam;
    }

    public double getLabs() {
        return labs;
    }

    public void setLabs(double labs) {
        this.labs = labs;
    }

    public double getProgressTest() {
        return progressTest;
    }

    public void setProgressTest(double progressTest) {
        this.progressTest = progressTest;
    }

    public double getFinalExam() {
        return FinalExam;
    }

    public void setFinalExam(double FinalExam) {
        this.FinalExam = FinalExam;
    }

    
   
    

    public boolean inputGrade() {
        boolean nhaptiep = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("\nInput lab grade: ");
                sc = new Scanner(System.in);
                labs = sc.nextFloat();
                if (labs < 0 || labs > 10) {
                    throw new Exception("\nLab grade must be entered from 0 -10. Try again!!!");
                }
                nhaptiep = false;
            } catch (InputMismatchException e) {
                System.out.println("Grade entered must be a number !!!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        nhaptiep = true;
        do {
            try {
                System.out.println("\nInput ProgressTest grade: ");
                sc = new Scanner(System.in);
                progressTest = sc.nextFloat();
                if (progressTest < 0 || progressTest > 10) {
                    throw new Exception("\nProgressTest grade must be entered from 0 -10. Try again!!!");
                }
                nhaptiep = false;
            } catch (InputMismatchException e) {
                System.out.println("Grade entered must be a number !!!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        nhaptiep = true;
        do {
            try {
                System.out.println("\nInput Final exam grade: ");
                sc = new Scanner(System.in);
                FinalExam = sc.nextFloat();
                if (FinalExam < 0 || FinalExam > 10) {
                    throw new Exception("\nFinal exam grade must be entered from 0 -10. Try again!!!");
                }
                nhaptiep = false;
            } catch (InputMismatchException e) {
                System.out.println("Grade entered must be a number !!!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        return true;
    }

    public double AvgMark() {
        return (double) Math.round((this.getLabs() * 0.3 + this.getProgressTest() * 0.3 + this.FinalExam * 0.4 ));

    }

    public String Status() {
        return AvgMark() >= 5 ? "Pass" : "Not Pass";
    }
}