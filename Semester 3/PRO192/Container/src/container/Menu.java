/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Menu {

    public static void main(String[] args) {
        ContainerList list = new ContainerList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add a container ");
            System.out.println("2. List all container");
            System.out.println("3. Remove a container");
            System.out.println("4. Exit");
            System.out.println("Input your choice:  ");
            sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String id;
                    double volume,
                     netWeight,
                     grossWeight;
                    System.out.println("------- Add container -------");
                    sc = new Scanner(System.in);
                    System.out.println("Input Container id");
                    id = sc.nextLine();
                    System.out.println("Input Volume");
                    volume = sc.nextDouble();
                    System.out.println("Input Net Weight");
                    netWeight = sc.nextDouble();
                    System.out.println("Input Gross Weight");
                    grossWeight = sc.nextDouble();
                    list.add();
                   // Containner ct = new Container(String id, double volume, double netWeight, double grossWeight);
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (choice != 4);
    }
}
