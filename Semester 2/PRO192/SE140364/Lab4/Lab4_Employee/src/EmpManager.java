
import java.util.InputMismatchException;
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
public class EmpManager {

    Employee[] arr;
    int SIZE = 100;
    int count;

    public EmpManager() {
        arr = new Employee[SIZE];
        count = 0;
    }

    public boolean Add(Employee e) {
        if (count == SIZE) {
            return false;
        }
        arr[count] = e;
        count++;
        return true;
    }

    void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static void main(String[] args) {
        EmpManager obj = new EmpManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add employee");
            System.out.println("2. Display all");
            System.out.println("3. Exit");
            System.out.println("Input your choice:");
            sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int code = 0,
                     basicSalary = 0,
                     experience = 0;
                    String name = null;
                    boolean doing = true;
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input code : ");
                            code = sc.nextInt();
                            doing = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Code must be a number!");
                        }
                    }
                    doing = true;
                    sc = new Scanner(System.in);
                    System.out.println("Input name: ");
                    name = sc.nextLine();
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input basic salary: ");
                            basicSalary = sc.nextInt();
                            doing = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Basic salary must be number!");
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input experience: ");
                            experience = sc.nextInt();
                            doing = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Experience must be number!");
                        }
                    }
                    Employee e = new Employee(code, basicSalary, experience, name);
                    if (obj.Add(e)) {
                        System.out.println("Added!");
                    } else {
                        System.out.println("Add fail!");
                    }
                    break;
                case 2:
                    obj.displayAll();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }

        } while (choice >= 1 && choice <= 3);
    }
}
