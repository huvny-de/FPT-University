/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.Student;
import Entity.Subject;
import Reposity.StudentManager;
import Reposity.SubjectManager;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Menu {

    public static void main(String[] args) {

        StudentManager obj = new StudentManager();
        SubjectManager obj2 = new SubjectManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add New Student.");
            System.out.println("2. Update Student.\n\t2.1 Update Student Informations.\n\t2.2 Delete Student.");
            System.out.println("3. Add New Subject.");
            System.out.println("4. Update Subject. \n\t4.1 Update Subject Information.\n\t4.2 Delete Subject Information. ");
            System.out.println("5. Enter Student's Grade.");
            System.out.println("6. Display Student Grade Report.");
            System.out.println("7. Display Subject Grade Report.");
            System.out.println("8. Exit.");
            System.out.println("9. Find Student");
            System.out.println("Please Input Your Chooice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    boolean working = true;
                    System.out.println("-- Add Student --");
                    int day,
                     month,
                     year,
                     phoneNumber;
                    String id,
                     lastName,
                     firstName,
                     email,
                     gender;
                    do {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input ID: ");
                            id = sc.nextLine();
                            if (id.isEmpty()) {
                                throw new Exception("Student ID is required.");

                            } else if (!Validation.isValidId(id)) {
                                throw new Exception("Student ID form: (SV+ 3 positive interger.)");
                            }

                            while (obj.checkStudentId(id)) {
                                if (obj.findSttt(id) != -1) {
                                    System.out.println("Your Student ID existed !!!");
                                    System.out.println("Please try again: ");
                                    sc = new Scanner(System.in);
                                    id = sc.nextLine();
                                }
                            }
                            working = false;

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (working);
                    //
                    sc = new Scanner(System.in);
                    System.out.println("Input First Name: ");
                    firstName = sc.nextLine();
                    //
                    sc = new Scanner(System.in);
                    System.out.println("Input Last Name");
                    lastName = sc.nextLine();
                    //
                    sc = new Scanner(System.in);
                    System.out.println("Input Gender");
                    gender = sc.nextLine();

                    //
                    sc = new Scanner(System.in);
                    System.out.println("Input Day");
                    day = sc.nextInt();
                    sc = new Scanner(System.in);
                    System.out.println("Input Month");
                    month = sc.nextInt();
                    //
                    sc = new Scanner(System.in);
                    System.out.println("Input Year ");
                    year = sc.nextInt();
                    //
                    sc = new Scanner(System.in);
                    System.out.println("Input Phone Number ");
                    phoneNumber = sc.nextInt();
                    //
                    sc = new Scanner(System.in);
                    System.out.println("Input E-mail");
                    email = sc.nextLine();
                    Student st = new Student(id, firstName, lastName, gender, day, month, year, phoneNumber, email);
                    if (obj.addSt(st)) {
                        System.out.println("Added !!");
                    } else {
                        System.out.println("Student ID existed !!!");
                    }
                    break;
                case 2:
                    String updateId;
                    String confirm = "";
                    sc = new Scanner(System.in);
                    System.out.println("Input ID for update: ");
                    updateId = sc.nextLine();
                    if (obj.findSttt(updateId) != -1) {
                        do {
                            System.out.println("2.1 Update Student Informations.");
                            System.out.println("2.2 Delete Student.");
                            int choose;

                            sc = new Scanner(System.in);
                            System.out.println("Input your choice: ");
                            choose = sc.nextInt();
                            switch (choose) {
                                case 1:
                                    String newID,
                                     newLName,
                                     newFName,
                                     newGender,
                                     newEmail;
                                    int newDay,
                                     newMonth,
                                     newYear,
                                     newPhoneNumber;
                                    obj.updateSt(updateId);
                                    System.out.println("Updated !!!");
                                    System.out.println("Do you want to update another student information (Y/N) ");
                                    sc = new Scanner(System.in);
                                    confirm = sc.nextLine();
                                    break;
                                case 2:

                                    String confirm3;
                                    System.out.println("-----Delete Student-----");
                                    sc = new Scanner(System.in);
                                    System.out.println("Confirm delete: student ID: " + updateId + " (Y/N)");
                                    confirm3 = sc.nextLine().toUpperCase();
                                    if (confirm3.equalsIgnoreCase("Y")) {
                                        obj.deleteSt(updateId);
                                        System.out.println("Deleted !!!");
                                    } else {
                                        System.out.println("Back to main menu !!!!");
                                    }
                                    break;
                            }
                        } while (confirm.equalsIgnoreCase("Y"));
                    } else {
                        System.out.println("Not Found !");
                    }
                    break;
                case 3:
                    //String updateId = "";
                    String confirm2;
                    do {
                        int credit;
                        String sbName,
                                sbId;
                        System.out.println("-----Add Subject-----");
                        sc = new Scanner(System.in);
                        System.out.println("Input Subject ID:");
                        sbId = sc.nextLine();
                        sc = new Scanner(System.in);
                        System.out.println("Input Subject Name: ");
                        sbName = sc.nextLine();
                        sc = new Scanner(System.in);
                        System.out.println("Input Credit: ");
                        credit = sc.nextInt();
                        Subject sb = new Subject(sbId, sbName, credit);
                        if (obj2.addSubject(sb)) {
                            System.out.println("Subject Added !!");
                        } else {
                            System.out.println("Failed");
                        }
                        sc = new Scanner(System.in);
                        System.out.println("Do you want to Add more Subject (Y/N)");
                        confirm2 = sc.nextLine();
                    } while (confirm2.equalsIgnoreCase("Y"));
                    break;
                case 4:
                    int choice4;
                    String sbupdateId;
                    sc = new Scanner(System.in);
                    System.out.println("Input Subject ID for update: ");
                    sbupdateId = sc.nextLine();
                    if (obj2.findSubject(sbupdateId) != -1) {
                        do {
                            System.out.println("4.1 Update Subject Information.");
                            System.out.println("4.2 Delete Subject.");
                            System.out.println("4.3 Back to Main Menu.");
                            System.out.println("Input Your Choice: ");
                            sc = new Scanner(System.in);
                            choice4 = sc.nextInt();
                            switch (choice4) {
                                case 1:
                                    String choice41;
                                    do {
                                        if (obj2.deleteSb(sbupdateId)) {
                                            System.out.println("Updated !!!");
                                        } else {
                                            System.out.println("Failed");
                                        }
                                        sc = new Scanner(System.in);
                                        System.out.println("Back to the Update Subject Menu ? (Y/N)");
                                        choice41 = sc.nextLine();
                                    } while (choice41.equalsIgnoreCase("Y"));
                                    break;
                                case 2:
                                    String choice42;
                                    do {
                                        if (obj2.deleteSb(sbupdateId)) {
                                            System.out.println("Deleted !!!");
                                        } else {
                                            System.out.println("Failed");
                                        }
                                        sc = new Scanner(System.in);
                                        System.out.println("Back to the Update Subject Menu ? (Y/N)");
                                        choice42 = sc.nextLine();
                                    } while (choice42.equalsIgnoreCase("Y"));
                                    break;
                                case 3:
                                    break;
                            }

                        } while (choice4 != 3);
                    } else {
                        System.out.println("Subject does not exist !");
                    }
                case 5:
                case 6:
                    obj.displayAll();
                    break;
                case 7:
                case 8:
                    System.exit(0);
                default:
                    break;
            }
        } while (choice != 8);
    }

}
