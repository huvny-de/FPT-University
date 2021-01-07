/*
 * To change this license header, choice License Headers in Project Properties.
 * To change this template file, choice Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Tester {

    public static void main(String[] args) {
        StudentManager obj = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean doing = true;
        while (doing) {
            sc = new Scanner(System.in);
            do {
                System.out.println("1. Input");
                System.out.println("2. Test 1");
                System.out.println("3. Test 2");
                System.out.println("4. Test 3");
                System.out.println("5. Display students learn many campus");
                System.out.println("6. Exit");
                try {
                    System.out.print("Input choice :");
                    choice = sc.nextInt();
                    if (choice < 1 | choice > 6) {
                        throw new Exception("Your input must be from 1 to 6");
                    }
                    switch (choice) {
                        case 1:
                            obj.input();
                            break;
                        case 2:
                            obj.test1();
                            break;
                        case 3:
                            obj.test2();
                            break;
                        case 4:
                            obj.test3();
                            break;
                        case 5:
                            obj.displayStudentLearnManyCampus();
                            break;
                        case 6:
                            System.out.println("Good Bye !");
                            System.exit(0);
                            break;
                    }
                    doing = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                doing = true;
            } while (choice >= 1 & choice <= 6);
        }
    }
}
