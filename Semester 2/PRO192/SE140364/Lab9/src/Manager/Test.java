/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Base.Cat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CatManager obj = new CatManager();

        int choice;
        do {
            System.out.println("1. Add a cat");
            System.out.println("2. Update a cat and display");
            System.out.println("3. Delete a cat and display");
            System.out.println("4. Find a cat and display");
            System.out.println("5. Sort by color");
            System.out.println("6. Exit");
            System.out.println("Input your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Cat x = new Cat();
                    x.input();
                    if (obj.add(x)) {
                        System.out.println("Added!");
                    } else {
                        System.out.println("Add Failed!");
                    }
                    break;
                case 2:
                    int updateId;
                    sc = new Scanner(System.in);
                    System.out.println("Input id for update: ");
                    updateId = sc.nextInt();
                    obj.Update(updateId);
                    break;
                case 3:
                    int deleteId;
                    sc = new Scanner(System.in);
                    System.out.println("Input id for remove: ");
                    deleteId = sc.nextInt();
                    System.out.println(obj.Delete(deleteId).toString());
                    break;
                case 4:
                    int findID;
                    sc = new Scanner(System.in);
                    System.out.println("Input id for find: ");
                    findID = sc.nextInt();
                    System.out.println(obj.find(findID).toString());
                    break;
                case 5:
                    obj.sortByColor();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (choice >= 1 && choice <= 6);
    }
}
