/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgExtend;

import PkgBasic.Book;
import PkgBasic.DetectiveBook;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class BookList {

    private Book[] arr;
    private int count;
    final int MAX = 100;

    public BookList() {
        this.arr = new Book[MAX];
        this.count = 0;
    }

    public void Add(Book x) {
        if (count < 100) {
            arr[count] = x;
            count++;
        }
    }

    public int FindBook(String code) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public void Delete(String code) {
        int index = FindBook(code);
        if (index < 0) {
            System.out.println("Failed");
        } else {
            for (int i = index; i < count; i++) {
                arr[i] = arr[i + 1];
                count--;
            }
        }
        System.out.println("Success");
    }

    public void Update(String code) {
        int index = FindBook(code);
        Scanner sc = new Scanner(System.in);
        String title;
        if (index < 0) {
            System.out.println("Failed");
        } else {
            if (arr[index] instanceof DetectiveBook) {
                int price = 0, yearofpublication = 0;
                System.out.print("Title : ");
                title = sc.nextLine();
                boolean keeping = true;
                while (keeping) {
                    try {
                        sc = new Scanner(System.in);
                        System.out.println("Input price");
                        price = sc.nextInt();
                        keeping = false;
                    } catch (InputMismatchException e) {
                        System.out.println("Price must be a number");
                    }
                }
                keeping = true;
                while (keeping) {
                    try {
                        sc = new Scanner(System.in);
                        System.out.println("Input year of publication");
                        yearofpublication = sc.nextInt();
                        keeping = false;
                    } catch (InputMismatchException e) {
                        System.out.println("Year must be a number");
                    }
                }
                arr[index].setTitle(title);
                ((DetectiveBook) arr[index]).setPrice(price);
                ((DetectiveBook) arr[index]).setYearofpublication(yearofpublication);
            } else if (arr[index] instanceof ScienceBook) {
                String type = null;
                sc = new Scanner(System.in);
                System.out.print("Title : ");
                title = sc.nextLine();
                boolean keeping = true;
                while (keeping) {
                    try {
                        sc = new Scanner(System.in);
                        System.out.println("Input type");
                        type = sc.nextLine();
                        if (!type.equals("physical") & !type.equals("mathematic") & !type.equals("chemistry")) {
                            throw new Exception("You must input 1 in 3 options : physical, mathematic, chemistry");
                        }
                        keeping = false;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                arr[index].setTitle(title);
                ((ScienceBook) arr[index]).setType(type);
            }
            System.out.println("Success");
        }
    }

    public void displayDetectiveBooks() {
        for (int i = 0; i < count; i++) {
            if (arr[i] instanceof DetectiveBook) {
                System.out.print(arr[i].toString());
            }
        }
    }

    public void displayScienceBooks() {
        for (int i = 0; i < count; i++) {
            if (arr[i] instanceof ScienceBook) {
                System.out.print(arr[i].toString());
            }
        }
    }

    public Book Search(String code) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getCode().equals(code)) {
                return arr[i];
            }
        }
        return null;
    }

    public Book[] Search(int YearOfPublish) {
        Book[] list = new Book[10];
        int temp = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] instanceof DetectiveBook) {
                if (((DetectiveBook) arr[i]).getYearofpublication() == YearOfPublish) {
                    list[temp] = arr[i];
                    temp++;
                }
            }
        }
        return list;

    }

    public boolean search(String title) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getTitle().equals(title)) {
                return true;
            }
        }
        return false;

    }

}
