/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reposity;

import Entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class StudentManager {

    List<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList();
    }

    public boolean checkStudentId(String id) {
        if (findSttt(id) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean addSt(Student st) {
        if (findSttt(st.getId()) != -1) {
            return false;
        } else {
            studentList.add(st);
            return true;
        }
    }

    public Student findSt(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return studentList.get(i);
            }
        }
        return null;
    }

    public String findSt2(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return studentList.get(i).getId();
            }
        }
        return null;
    }

    public boolean updateSt(String id) {
        int pos = findSttt(id);
        if (pos >= 0) {
            String newID, newLName, newFName, newGender, newEmail;
            int newDay, newMonth, newYear, newPhoneNumber;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input New ID: ");
            newID = sc.nextLine();
            studentList.get(pos).setId(newID);
            System.out.println("Input New First Name: ");
            newFName = sc.nextLine();
            studentList.get(pos).setFirstName(newFName);
            sc = new Scanner(System.in);
            System.out.println("Input New Last Name: ");
            newLName = sc.nextLine();
            studentList.get(pos).setLastName(newLName);
            sc = new Scanner(System.in);
            System.out.println("Input New Gender: ");
            newGender = sc.nextLine();
            studentList.get(pos).setGender(newGender);
            sc = new Scanner(System.in);
            System.out.println("Input New Day of Birth");
            newDay = sc.nextInt();
            studentList.get(pos).setDay(newDay);
            sc = new Scanner(System.in);
            System.out.println("Input New Month: ");
            newMonth = sc.nextInt();
            studentList.get(pos).setMonth(newMonth);
            sc = new Scanner(System.in);
            System.out.println("Input New Year: ");
            newYear = sc.nextInt();
            studentList.get(pos).setYear(newYear);
            sc = new Scanner(System.in);
            System.out.println("Input New Phone Number: ");
            newPhoneNumber = sc.nextInt();
            studentList.get(pos).setPhoneNumber(newPhoneNumber);
            sc = new Scanner(System.in);
            System.out.println("Input New Email: ");
            newEmail = sc.nextLine();
            studentList.get(pos).setEmail(newEmail);
        }
        return true;
    }

    public int findSttt(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteSt(String id) {
        int pos = findSttt(id);
        if (pos >= 0) {
            studentList.remove(studentList.get(pos));
            return true;
        } else {
            return false;
        }
    }

    public void display(String id) {
        for (Student student : studentList) {
            if (student.getId().equalsIgnoreCase(id)) {
                System.out.println(student.toString());
            }
        }
    }

    public void displayAll() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());

        }
    }
}
