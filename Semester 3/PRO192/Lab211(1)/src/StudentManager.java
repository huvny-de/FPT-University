
import java.util.List;
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
public class StudentManager {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            choice = sc.nextInt();
        } while (choice != 8);
            System.out.println("1. Add New Student.");
            System.out.println("2. Update Student.");
            System.out.println("3. Add New Subject.");
            System.out.println("4. Update Subject");
            System.out.println("5. Enter Grade.");
            System.out.println("6. Display Student Grade Report.");
            System.out.println("7. Display Subject Grade Report.");
            System.out.println("8. Exit.");
            sc = new Scanner(System.in);
            choice = sc.nextInt();
        } while (choice != 8);
    }

}
