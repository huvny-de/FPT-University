
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
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add new Category");
            System.out.println("2. Update category");
            System.out.println("\t2.1 Update category");
            System.out.println("\t2.2 Delete category");
            System.out.println("3. Add new product");
            System.out.println("4. Update product");
            System.out.println("\t4.1 Update product");
            System.out.println("\t4.2 Delete category");
            System.out.println("5. Order product");
            System.out.println("6. Show order list report");
            System.out.println("7. Exit");
            System.out.println("Please input your choice: ");
            sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    int choice2;
                    do {
                        System.out.println("1. Update Category");
                        System.out.println("2. Delete Category");
                        System.out.println("Input your choice: ");
                        sc = new Scanner(System.in);
                        choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } while (choice2 == 1 || choice2 == 2);
                    break;
                case 3:
                    break;
                case 4:
                    int choice4;
                    do {
                        System.out.println("1. Update Product");
                        System.out.println("2. Delete Category");
                        System.out.println("Input your choice: ");
                        sc = new Scanner(System.in);
                        choice4 = sc.nextInt();
                        switch (choice4) {
                            case 1:
                                break;
                            case 2:
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } while (choice4 == 1 || choice4 == 2);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 7);

    }

}
