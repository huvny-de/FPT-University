
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Henry
 */
public class BookList {

    Book[] list;
    int count, SIZE = 100;

    public BookList() {
        list = new Book[SIZE];
        count = 0;
    }

    public boolean addBook(Book b) {
        if (count == SIZE) {
            return false;
        }
        list[count] = b;
        count++;
        return true;

    }

    public boolean updateBook(String code) {
        int pos = findBook(code);
        if (pos >= 0) {
            String newTitle, newPublisher, newType;
            System.out.println("Input new book's title:");
            Scanner sc = new Scanner(System.in);
            newTitle = sc.nextLine();
            list[pos].setTitle(newTitle);
            System.out.println("Input new book's publisher:");
            sc = new Scanner(System.in);
            newPublisher = sc.nextLine();
            list[pos].setPublisher(newPublisher);
            System.out.println("Input new book's type:");
            sc = new Scanner(System.in);
            newType = sc.nextLine();
            list[pos].setType(newType);
            return true;
        }
        return false;
    }

    public int findBook(String code) {
        for (int i = 0; i < count; i++) {
            if ((list[i].getCode().equals(code))) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeBook(String code) {
        int pos = findBook(code);
        if (pos < 0) {
            return false;
        }
        for (int i = pos; i < count; i++) {
            list[i] = list[i + 1];

            count--;
        }
        return true;
    }

    public void sort() {
        for (int i = 0; i < count; i++) {
            for (int j = count - 1; j > i; j--) {
                if (list[i].getCode().compareTo(list[j].getCode()) < 0) {
                    Book temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(list[i].toString());
        }
    }

    public static void main(String[] args) {
        BookList obj = new BookList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add a book");
            System.out.println("2. Update a book by code");
            System.out.println("3. Find a book by code");
            System.out.println("4. Remove a book by code");
            System.out.println("5. Sort list of books (ascending order)");
            System.out.println("6. Display all books");
            System.out.println("7. Exit");
            System.out.println("Input your choice:");
            sc = new Scanner(System.in);
            choice = sc.nextInt();
            boolean doing = true;
            switch (choice) {
                case 1:
                    String code,
                     title,
                     publisher,
                     type;
                    sc = new Scanner(System.in);
                    System.out.println("Input book's code:");
                    code = sc.nextLine();
                    sc = new Scanner(System.in);
                    System.out.println("Input book's title:");
                    title = sc.nextLine();
                    sc = new Scanner(System.in);
                    System.out.println("Input book's publisher:");
                    publisher = sc.nextLine();
                    sc = new Scanner(System.in);
                    System.out.println("Input book's type:");
                    type = sc.nextLine();
                    Book b = new Book(code, title, publisher, type);
                    if (obj.addBook(b)) {
                        System.out.println("Added!");
                    } else {
                        System.out.println("Add fail!");
                    }
                    break;
                case 2:
                    String updateCode;
                    sc = new Scanner(System.in);
                    System.out.println("Input book's code you want to update:");
                    updateCode = sc.nextLine();
                    if (obj.updateBook(updateCode)) {
                        System.out.println("Updated!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 3:
                    String findCode;
                    int pos;
                    sc = new Scanner(System.in);
                    System.out.println("Input book's code that you want to find:");
                    findCode = sc.nextLine();
                    pos = obj.findBook(findCode);
                    if (pos >= 0) {
                        System.out.println("Found!");
                    } else {
                        System.out.println("Not found !");
                    }
                    break;
                case 4:
                    String removeCode;
                    sc = new Scanner(System.in);
                    System.out.println("Input book's code that you want to remove:");
                    removeCode = sc.nextLine();
                    if (obj.removeBook(removeCode)) {
                        System.out.println("Removed!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 5:
                    obj.sort();
                    System.out.println("Sorted!");
                    break;
                case 6:
                    obj.displayAll();
                    break;
                case 7:
                    System.exit(0);
            }

        } while (choice >= 1 && choice <= 7);
    }

}
