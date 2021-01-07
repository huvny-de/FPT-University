package Manager;

import Object.Subject;
import Object.Grade;
import Object.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class GradeManager {

    HashMap<Student, ArrayList<Grade>> list3;
    SubjectManager sub_manage;

    public GradeManager(SubjectManager A) {
        // truyền danh sách các môn học đã add vào list
        list3 = new HashMap<>();
        sub_manage = A;
    }

    public void enrollStudent(Student id) {
        ArrayList<Grade> listGrade = new ArrayList<>();
        String choice = "";
        Scanner sc = new Scanner(System.in);
        Grade grd;
        String checkID_subject;
        do {
            System.out.println("Input id subject: ");
            checkID_subject = sc.nextLine();
            Subject sub = sub_manage.findSub(checkID_subject);
            double lab;
            double progressTest;
            double FinalExam;
            if (sub != null) {
                System.out.println("Inpur grade Lab: ");
                lab = sc.nextDouble();
                sc = new Scanner(System.in);
                System.out.println("Input grade Progress:");
                progressTest = sc.nextDouble();
                sc = new Scanner(System.in);
                System.out.println("nhap grade Final: ");
                FinalExam = sc.nextDouble();
                if (list3.containsKey(id)) {
                    listGrade = list3.get(id);
                }
                grd = new Grade(lab, progressTest, FinalExam, checkID_subject);
                listGrade.add(grd);
            } else {
                System.out.println("Not found your subject");
            }
            System.out.println("Do you want to add more grade?[Y/N]");
            boolean nhaptiep = true;
            do {
                try {
                    sc = new Scanner(System.in);
                    choice = sc.nextLine().toUpperCase();
                    if (!choice.equals("N") && !choice.equals("Y")) {
                        throw new Exception("\nJust choose Y or N. Choose again !!!");
                    }
                    nhaptiep = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } while (nhaptiep);
        } while (!choice.equalsIgnoreCase("N"));

        list3.put(id, listGrade);
    }

    public ArrayList printStudent(Student id) {
        Set<Student> ks = list3.keySet();
        for (Student k : ks) {
            if (k.equals(id)) {
                ArrayList<Grade> value = list3.get(k);
                for (Grade grade : value) {
                    return value;
                }
            }
        }

        return null;
    }

}
