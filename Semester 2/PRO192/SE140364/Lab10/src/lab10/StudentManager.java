/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Henry
 */
public class StudentManager {

    HashMap<String, List<Student>> h;

    public StudentManager() {
        this.h = new HashMap<>();
    }

    public boolean checkCampus(String campusName) {
        return h.containsKey(campusName);
    }

    public void addStudentOfCampus(String campusName, List<Student> list) {
        String choice = null;
        Scanner sc = new Scanner(System.in);
        if (checkCampus(campusName)) {
            do {
                System.out.println("Your campus name existed. Do you want replace list of student in this campus ? [Y/N]");
                choice = sc.nextLine();
            } while (!choice.equals("N") & !choice.equals("Y"));
            if (choice.equals("Y")) {
                h.put(campusName, list);
            }
        } else {
            h.put(campusName, list);
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Input a campus name :");
            String campusname = sc.nextLine();
            List<Student> list = new ArrayList();
            do {
                String id, name;
                System.out.println("Input ID : ");
                sc = new Scanner(System.in);
                id = sc.nextLine();
                System.out.println("Input Name : ");
                sc = new Scanner(System.in);
                name = sc.nextLine();
                Student stu = new Student(id, name);
                list.add(stu);
                System.out.println("Do you continue (Y/N)?");
                sc = new Scanner(System.in);
                choice = sc.nextLine();
            } while (choice.equals("Y"));
            addStudentOfCampus(campusname, list);
            System.out.println("Do you add more campus [Y/N] ?");
            sc = new Scanner(System.in);
            choice = sc.nextLine();
        } while (choice.equals("Y"));
    }

    public List<Student> getStudentByCampus(String campusName) {
        Set<String> rs = h.keySet();
        for (String r : rs) {
            if (r.equals(campusName)) {
                List<Student> list = h.get(r);
                return list;
            }
        }
        return null;
    }

    public void test1() {
        String campus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input campus name to get student: ");
        campus = sc.nextLine();
        List<Student> result = getStudentByCampus(campus);
        if (result.size() > 0) {
            for (Student student : result) {
                System.out.println(student.toString());
            }
        } else {
            System.out.println("Campus which you have inputed do not have any student");
        }
    }

    public void addStudentToCampus(String campusName, Student stu) {
        List<Student> list = getStudentByCampus(campusName);
        list.add(stu);
    }

    public void test2() {
        String campus, stuId, stuName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Campus : ");
        campus = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Input ID : ");
        stuId = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Input Name : ");
        stuName = sc.nextLine();
        Student stu = new Student(stuId, stuName);
        addStudentToCampus(campus, stu);
    }

    public String getCampusMax() {
        int max = 0;
        Set<String> rs = h.keySet();
        for (String r : rs) {
            if (h.get(r).size() > max) {
                max = h.get(r).size();
            }
        }
        for (String r : rs) {
            if (h.get(r).size() == max) {
                return r;
            }
        }
        return null;
    }

    public int getMaxNumberStudent() {
        Set<String> rs = h.keySet();
        String campus_max = getCampusMax();
        for (String r : rs) {
            if (r.equals(campus_max)) {
                return h.get(r).size();
            }
        }
        return -1;
    }

    public void test3() {
        String result1 = getCampusMax();
        int result2 = getMaxNumberStudent();
        if (result1 == null) {
            System.out.println("No found");
        } else {
            System.out.println("The campus has maximum number of students : " + result1);
        }
        if (result2 < 0) {
            System.out.println("No found");
        } else {
            System.out.println("The maximum number of student: " + result2);
        }
    }

    public Student checkStudentLearnCampus(String id) {
        Set<String> rs = h.keySet();
        for (String r : rs) {
            List<Student> list = h.get(r);
            for (Student student : list) {
                if (student.getId().equals(id)) {
                    return student;
                }
            }
        }
        return null;
    }

    public int countCampusOfStudent(String id) {
        Set<String> rs = h.keySet();
        int count = 0;
        for (String r : rs) {
            List<Student> list = h.get(r);
            for (Student student : list) {
                if (student.getId().equals(id)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void displayStudentLearnManyCampus() {
        Set<String> rs = h.keySet();
        Set<Student> temp = new HashSet<>();
        for (String r : rs) {
            List<Student> list = h.get(r);
            for (Student student : list) {
                if ((countCampusOfStudent(student.getId()) > 1)) {
                    temp.add(student);
                }
            }
        }
        for (Student student : temp) {
            System.out.println(student.toString() + " , ");
        }
    }
}
