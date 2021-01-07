/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookTest;

import PkgBasic.Book;
import PkgExtend.BookList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList obj = new BookList();
        int choice = 0;
        boolean doing = true;
        while (doing) {
            do {
                System.out.println("1. Add a Detective Book ");
                System.out.println("2. Add a ScienceBook");
                System.out.println("3. Delete a book");
                System.out.println("4. Update a book");
                System.out.println("5. Display All DetectiveBooks");
                System.out.println("6. Display All ScienceBooks");
                System.out.println("7. Search by code");
                System.out.println("8. Search by title");
                System.out.println("9. Search and display all books by yearofpublish");
                System.out.println("10. Exit");
                try {
                    sc = new Scanner(System.in);
                    System.out.println("Input your choice:");
                    choice = sc.nextInt();
                    if (choice < 1 | choice > 10) {
                        throw new Exception("You must input from 1 to 10");
                    }
                    switch (choice) {
                        case 1:
                            String code = null,
                             title;
                            int price = 0;
                            int yearofpublication = 0;
                            boolean conto = true;
                            while (conto) {
                                try {
                                    sc = new Scanner(System.in);
                                    System.out.println("Input code: ");
                                    code = sc.nextLine();
                                    if (!code.matches("B[0-9]")) {
                                        throw new Exception("Code must match B[0-9]");
                                    }
                                    conto = false;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            conto = true;
                            sc = new Scanner(System.in);
                            System.out.println("Input title");
                            title = sc.nextLine();
                            while (conto) {
                                try {
                                    sc = new Scanner(System.in);
                                    System.out.println("Input price");
                                    price = sc.nextInt();
                                    conto = false;
                                } catch (InputMismatchException e) {
                                    System.out.println("Price must be a number");
                                }
                            }
                            conto = true;
                            while (conto) {
                                try {
                                    sc = new Scanner(System.in);
                                    System.out.println("Input year of publication");
                                    yearofpublication = sc.nextInt();
                                    conto = false;
                                } catch (InputMismatchException e) {
                                    System.out.println("Year must be a number");
                                }
                            }
                            conto = true;
                            sc = new Scanner(System.in);
                            PkgBasic.DetectiveBook x = new PkgBasic.DetectiveBook(price, yearofpublication, code, title);
                            obj.Add(x);
                            break;
                        case 2:
                            String type = null;
                            conto = true;
                            code = null;
                            while (conto) {
                                try {
                                    sc = new Scanner(System.in);
                                    System.out.println("Input code: ");
                                    code = sc.nextLine();
                                    if (!code.matches("B[0-9]")) {
                                        throw new Exception("Code must match B[0-9]");
                                    }
                                    conto = false;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            conto = true;
                            while (conto) {
                                try {
                                    sc = new Scanner(System.in);
                                    System.out.println("Input type: ");
                                    type = sc.nextLine();
                                    if (!type.equals("physical") & !type.equals("mathematic") & !type.equals("chemistry")) {
                                        throw new Exception("You must input 1 in 3 options : physical, mathematic, chemistry");
                                    }
                                    conto = false;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            sc = new Scanner(System.in);
                            System.out.println("Input title");
                            title = sc.nextLine();
                            sc = new Scanner(System.in);
                            PkgExtend.ScienceBook y = new PkgExtend.ScienceBook(type, code, title);
                            obj.Add(y);
                            break;
                        case 3:
                            String deletecode;
                            sc = new Scanner(System.in);
                            System.out.println("Input delete code");
                            deletecode = sc.nextLine();
                            sc = new Scanner(System.in);
                            obj.Delete(deletecode);
                            break;
                        case 4:
                            String updatecode;
                            sc = new Scanner(System.in);
                            System.out.println("Input update code");
                            updatecode = sc.nextLine();
                            obj.Update(updatecode);
                            break;
                        case 5:
                            System.out.print("List of DetectiveBook:");
                            obj.displayDetectiveBooks();
                            System.out.print("\n");
                            break;
                        case 6:
                            System.out.print("List of ScienceBook:");
                            obj.displayScienceBooks();
                            System.out.print("\n");
                            break;
                        case 7:
                            String searchcode;
                            sc = new Scanner(System.in);
                            System.out.println("Input search code");
                            searchcode = sc.nextLine();
                            Book result = obj.Search(searchcode);
                            if (result != null) {
                                System.out.println(result.toString());
                            } else {
                                System.out.println("Not found");
                            }
                            break;
                        case 8:
                            String searchtitle;
                            sc = new Scanner(System.in);
                            System.out.println("Input search title");
                            searchtitle = sc.nextLine();
                            if (obj.search(searchtitle)) {
                                System.out.println("Found");
                            } else {
                                System.out.println("Not Found");
                            }
                            break;
                        case 9:
                            yearofpublication = 0;
                            conto = true;
                            while (conto) {
                                try {
                                    sc = new Scanner(System.in);
                                    System.out.println("Input year of publication");
                                    yearofpublication = sc.nextInt();
                                    conto = false;
                                } catch (InputMismatchException e) {
                                    System.out.println("Year must be a number");
                                }
                            }
                            Book[] list = obj.Search(yearofpublication);
                            if (list != null) {
                                for (int i = 0; i < list.length - 1 & list[i] != null; i++) {
                                    System.out.println(list[i].toString());
                                }
                            } else {
                                System.out.println("Not found");
                            }
                            break;
                        case 10:
                            System.out.println("BYE!!");
                            break;
                    }
                    doing = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                doing = true;

            } while (choice >= 1 & choice <= 10);
        }
    }
}
