/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reposity;

import Entity.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class SubjectManager {

    List<Subject> subjectList;

    public SubjectManager() {
        subjectList = new ArrayList();
    }

    public boolean addSubject(Subject sb) {
        subjectList.add(sb);
        return true;
    }

    public int findSubject(String id) {
        for (int i = 0; i < subjectList.size(); i++) {
            if (subjectList.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateSubject(String id) {
        String newId, newName;
        int newCredit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input new Subject Id: ");
        newId = sc.nextLine();
        subjectList.get(findSubject(id)).setId(newId);
        sc = new Scanner(System.in);
        System.out.println("Input new Subject Name: ");
        newName = sc.nextLine();
        subjectList.get(findSubject(id)).setSbName(newName);
        sc = new Scanner(System.in);
        System.out.println("Input new Credit: ");
        newCredit = sc.nextInt();
        subjectList.get(findSubject(id)).setCredit(newCredit);
        return true;
    }

    public boolean deleteSb(String id) {
        subjectList.remove(id);
        return true;
    }

}
