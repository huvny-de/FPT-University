package Manager;

import Object.Subject;
import java.util.ArrayList;
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
public class SubjectManager {

    ArrayList<Subject> list2;

    public SubjectManager() {

        list2 = new ArrayList<>();
    }

    public boolean checkSubjectID(ArrayList<Subject> list2, String idSubject) {
        if (list2.stream().noneMatch((sub) -> (sub.getSubjectId().equalsIgnoreCase(idSubject)))) {
            return true;
        }
        return false;
    }

    public Subject findSub(String id) {
        for (Subject subject : list2) {
            if (subject.getSubjectId().equalsIgnoreCase(id)) {
                return subject;
            }
        }

        return null;
    }

    public boolean addSubject() {
        String idSubject = "";
        System.out.println("Input id subject: ");
        Scanner sc = new Scanner(System.in);
        idSubject = sc.nextLine();
        while (checkSubjectID(list2, idSubject) == false) {
            System.out.println("Your id subject is duplicate!!!");
            System.out.println("Input again: ");
            idSubject = sc.nextLine();
        }
        String subjectName = "";
        int credit = 0;

        boolean nhaptiep = true;
        do {
            try {
                System.out.println("\nInput Subject's name: ");
                sc = new Scanner(System.in);
                subjectName = sc.nextLine();
                if (subjectName.isEmpty()) {
                    throw new Exception("\nSubject's name must be inputted");
                }
                nhaptiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);
        nhaptiep = true;
        do {
            try {
                System.out.println("\nInput credit: ");
                sc = new Scanner(System.in);
                credit = sc.nextInt();
                if (!MyValidation.Validation.isValidNumber(credit)) {
                    throw new Exception("\nCredit entered must be a positive integer number");
                }
                nhaptiep = false;
            } catch (InputMismatchException e) {
                System.out.println("Credit entered must be a integer");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);
        Subject sub = new Subject(idSubject, subjectName, credit);
        list2.add(sub);
        return true;
    }

    public Subject findSubjectToManipulation(String SubID) {
        int temp;
        for (Subject subject : list2) {
            if (subject.getSubjectId().equalsIgnoreCase(SubID)) {
                System.out.println("Do you want to update or delete subject ?[Input 1 or 2]");
                Scanner sc = new Scanner(System.in);
                temp = sc.nextInt();
                switch (temp) {
                    case 1:
                        String newName = "";
                        System.out.println("\nYou choose update subject");
                        System.out.println("Input new name subject: ");
                        sc = new Scanner(System.in);
                        newName = sc.nextLine();
                        subject.setSubjectName(newName);
                        System.out.println(subject);
                        break;
                    case 2:
                        String choose = "";
                        System.out.println("\nYou choose remove subject");
                        System.out.println("Do you really want to delete ? [Y/N]");
                        sc = new Scanner(System.in);
                        choose = sc.nextLine();
                        if (choose.toUpperCase().equals("Y")) {
                            if (list2.remove(subject)) {
                                System.out.println("Removed");
                            } else {
                                System.out.println("Remove failed");
                            }

                        } else {
                            System.out.println("Remove failed. Back to menu !!!!");
                        }
                        break;
                        
                    default:
                        System.out.println("Remove failed. Back to menu !!!!");
                        break;
                }
                return subject;
            }
        }
        return null;
    }

    public void display() {
        for (Subject subject : list2) {
            System.out.println(subject);
        }
    }

    public String getSubNameByID(String id) {
        for (Subject subject : list2) {
            if (subject.getSubjectId().equalsIgnoreCase(id)) {
                return subject.getSubjectName();
            }
        }
        return null;
    }
}
