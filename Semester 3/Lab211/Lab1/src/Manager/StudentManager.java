package Manager;

import Object.Student;
import java.util.ArrayList;
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
public class StudentManager extends ArrayList<Student> {

    public StudentManager() {
        super();
    }

    //stream Returns a sequential Stream with this collection as its source.
    public boolean checkIdStudent(ArrayList<Student> list, String id) {
        if (this.stream().noneMatch((stu) -> (id.equalsIgnoreCase(stu.getStudentID())))) {
            return true;
        }
        return false;

    }

    public Student findStu(String id, String name) {
        for (Student student : this) {
            if (student.getStudentID().equalsIgnoreCase(id)) {
                if (student.getLastName().equalsIgnoreCase(name)) {
                    return student;
                } else {
                    return null;
                }

            }
        }
        return null;
    }

    //check exits student
    public boolean addStudent() {

        String idStudent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id student: ");
        idStudent = sc.nextLine();
        while (checkIdStudent(this, idStudent) == false) {
            System.out.println("Your id is duplicate !!!");
            System.out.println("Input again: ");
            idStudent = sc.nextLine();
        }
        String studentID;
        String firstName = "";
        String lastName = "";
        String gender = "";
        int date = 0;
        int month = 0;
        int year = 0;
        String email = "";
        String phoneNumber = "";

        boolean nhaptiep = true;
        do {
            try {
                System.out.println("\nInput first name: ");
                sc = new Scanner(System.in);
                firstName = sc.nextLine();
                if (firstName.isEmpty()) {
                    throw new Exception("\nStudent's first name must be inputted");
                }
                nhaptiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        nhaptiep = true;
        do {
            try {
                System.out.println("\nInput last name: ");
                sc = new Scanner(System.in);
                lastName = sc.nextLine();
                if (lastName.isEmpty()) {
                    throw new Exception("\nStudent's last name must be inputted");
                }
                nhaptiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        nhaptiep = true;
        do {
            try {

                System.out.println("\nInput Student gender: ");
                sc = new Scanner(System.in);
                gender = sc.nextLine();
                if (gender.isEmpty()) {
                    throw new Exception("\nStudent's gender must be inputted");
                }
                nhaptiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        nhaptiep = true;
        do {
            try {
                System.out.println("\nInput Student's date of birth : ");
                System.out.println("Input date: ");
                sc = new Scanner(System.in);
                date = sc.nextInt();
                System.out.println("Input month: ");
                sc = new Scanner(System.in);
                month = sc.nextInt();
                System.out.println("Input year: ");
                sc = new Scanner(System.in);
                year = sc.nextInt();
                if (!MyValidation.Validation.isValidDate(date, month, year)) {
                    throw new Exception("\nDoB must be less than current date. Please, input again! ");
                }
                nhaptiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        nhaptiep = true;
        do {
            try {
                System.out.println("\nInput email: ");
                sc = new Scanner(System.in);
                email = sc.nextLine();

                if (email.isEmpty()) {
                    throw new Exception("\nStudent's email must be inputted!!!");
                } else if (!MyValidation.Validation.isValidEmail(email)) {
                    throw new Exception("\nYour email entered is not valid !!!");
                }
                nhaptiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        nhaptiep = true;
        do {
            try {
                System.out.println("\nInput Student's phone number: ");
                sc = new Scanner(System.in);
                phoneNumber = sc.nextLine();
                if (phoneNumber.isEmpty()) {
                    throw new Exception("\nStudent's phone number must be inputted!!!");
                } else if (!MyValidation.Validation.isValidPhoneNumber(phoneNumber)) {
                    throw new Exception("\nYour phone number entered is not valid !!!");
                }
                nhaptiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nhaptiep);

        Student x = new Student(idStudent, firstName, lastName, gender, date, month, year, email, phoneNumber);
        this.add(x);
        return true;
    }

    public Student findStudentToManipulation(String idStu) {
        for (Student student : this) {
            if (student.getStudentID().equalsIgnoreCase(idStu)) {
                int choice = 0;
                System.out.println("Do you want to Update student or Delete student(Input 1 or 2)");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\nYou choose update student");
                        String newPhoneNumber;
                        System.out.println("Input new phone number: ");
                        sc = new Scanner(System.in);
                        newPhoneNumber = sc.nextLine();
                        student.setPhoneNumber(newPhoneNumber);
                        System.out.println(student.toString());
                        break;
                    case 2:
                        System.out.println("\nYou choose remove subject");
                        System.out.println("Do you really want to delete ?[Y/N]");
                        String tmp = "";
                        sc = new Scanner(System.in);
                        tmp = sc.nextLine().toUpperCase();
                        if (tmp.equals("Y")) {
                            if (this.remove(student)) {
                                System.out.println("Removed");
                            } else {
                                System.out.println("Remove failed");
                            }
                        } else {
                            System.out.println("Remove failed. Back to find next student!!!");
                        }
                        break;

                    default:
                        System.out.println("Remove failed.. Back to find next student!!!");
                        break;
                }
                return student;
            }
            return null;
        }
        return null;
    }

    public void display() {
        for (Student student : this) {
            System.out.println(student);
        }
    }

}
