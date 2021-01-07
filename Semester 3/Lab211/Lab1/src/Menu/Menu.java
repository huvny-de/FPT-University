package Menu;

import Manager.GradeManager;
import Object.Subject;
import Object.Student;
import Object.Grade;
import Manager.StudentManager;
import Manager.SubjectManager;
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
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager obj = new StudentManager();
        SubjectManager obj2 = new SubjectManager();
        GradeManager obj3 = new GradeManager(obj2);
        boolean nhaptiep = true;
        int choice = 0;
        do {
            System.out.println("\nMenu");
            System.out.println("1.Add new student");
            System.out.println("2.Update Student"
                    + "\n  2.1 Update Student"
                    + "\n  2.2 Delete Student");
            System.out.println("3.Add new Subject");
            System.out.println("4.Update Subject"
                    + "\n  4.1 Update Subject"
                    + "\n  4.2 Delete Subject   ");
            System.out.println("5.Enter Grade");
            System.out.println("6. Display Student Grade Report");
            System.out.println("7. Display Subject Grade Report");
            System.out.println("8.Exit");

            while (true) {
                try {
                    sc = new Scanner(System.in);
                    choice = sc.nextInt();
                    if (choice < 1 || choice > 8) {
                        throw new Exception("Your choice entered is not valid. Try again!!!");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Your choice entered must be a number. Try again !!!");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (choice) {
                case 1:
                    String temp = "";
                    nhaptiep = true;
                    do {
                        if (obj.addStudent()) {
                            System.out.println("Added");
                        } else {
                            System.out.println("failed");
                        }
                        System.out.println("Do you want to add more student?(Y/N)");

                        do {
                            try {
                                sc = new Scanner(System.in);
                                temp = sc.nextLine().toUpperCase();
                                if (!temp.equals("N") && !temp.equals("Y")) {
                                    throw new Exception("\nJust choose Y or N. Choose again !!!");
                                }
                                nhaptiep = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                        } while (nhaptiep);

                    } while (!temp.toUpperCase().equals("N"));

                    break;

                case 2:

                    String idStu = "";
                    String temp2 = "";
                    do {
                        System.out.println("Input id to find: ");
                        sc = new Scanner(System.in);
                        idStu = sc.nextLine();
                        if (obj.findStudentToManipulation(idStu) != null) {
                            System.out.println("");
                        } else {
                            System.out.println("Not found your student!!!");
                        }
                        System.out.println("Do you want to find next student(Y/N)");
                        nhaptiep = true;
                        do {
                            try {
                                sc = new Scanner(System.in);
                                temp2 = sc.nextLine().toUpperCase();
                                if (!temp2.equals("N") && !temp2.equals("Y")) {
                                    throw new Exception("\nJust choose Y or N. Choose again !!!");
                                }
                                nhaptiep = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                        } while (nhaptiep);

                    } while (!temp2.equals("N"));
                    break;

                case 3:
                    String tmp = "";

                    do {
                        if (obj2.addSubject()) {
                            System.out.println("Added");
                        } else {
                            System.out.println("Add failed");
                        }
                        System.out.println("Do you want to add more subjects?[Y/N]");
                        nhaptiep = true;
                        do {
                            try {
                                sc = new Scanner(System.in);
                                tmp = sc.nextLine().toUpperCase();
                                if (!tmp.equals("N") && !tmp.equals("Y")) {
                                    throw new Exception("\nJust choose Y or N. Choose again !!!");
                                }
                                nhaptiep = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                        } while (nhaptiep);
                    } while (!tmp.toUpperCase().equals("N"));
                    break;

                case 4:
                    String idSub;
                    String tmp2 = "";
                    while (!tmp2.toUpperCase().equals("N")) {
                        System.out.println("Input subject's id to find: ");
                        sc = new Scanner(System.in);
                        idSub = sc.nextLine();
                        if (obj2.findSubjectToManipulation(idSub) != null) {

                        } else {
                            System.out.println("Not Found");
                        }
                        System.out.println("\nDo you want to find next subject ?[Y/N]");
                        nhaptiep = true;
                        do {
                            try {
                                sc = new Scanner(System.in);
                                tmp2 = sc.nextLine().toUpperCase();
                                if (!tmp2.equals("N") && !tmp2.equals("Y")) {
                                    throw new Exception("\nJust choose Y or N. Choose again !!!");
                                }
                                nhaptiep = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                        } while (nhaptiep);
                    }
                    break;

                case 5:
                    System.out.println("Input id student: ");
                    String stuInput,
                     NameInput;
                    sc = new Scanner(System.in);
                    stuInput = sc.nextLine();
                    System.out.println("Input name student: ");
                    sc = new Scanner(System.in);
                    NameInput = sc.nextLine();
                    Student stu = obj.findStu(stuInput, NameInput);
                    if (stu == null) {
                        System.out.println("Not found your student");
                    } else {
                        obj3.enrollStudent(stu);
                    }
                    break;

                case 6:
                    ArrayList<Grade> kq;
                    String idStuPrint,
                     idNamePrint;
                    System.out.println("Input id");
                    sc = new Scanner(System.in);
                    idStuPrint = sc.nextLine();
                    System.out.println("Input name");
                    sc = new Scanner(System.in);
                    idNamePrint = sc.nextLine();
                    kq = obj3.printStudent(obj.findStu(idStuPrint, idNamePrint));//viết r
                    System.out.println("| ++ No ++ | +++++++Subject name ++++++++ | ++ Average mark ++ | ++ Status ++ |");
                    int num = 1;
                    if (kq != null) {
                        for (int i = 0; i < kq.size(); i++) {
                            System.out.println("\t" + num + "\t" + "\t" + obj2.getSubNameByID(kq.get(i).getSubjectId()) + "\t" + "\t" + kq.get(i).AvgMark() + "\t" + "\t" + kq.get(i).Status());
                            num++;
                        }
                    } else {
                        System.out.println("Not found grade of your student or student !!!");
                    }
                    break;

                case 7:

                    break;

                case 8:
                    break;

            }

        } while (choice != 8);
    }

}
