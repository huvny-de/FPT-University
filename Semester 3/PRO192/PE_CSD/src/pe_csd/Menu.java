/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe_csd;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Menu {

    public static void main(String[] args) {
        System.out.println("1.Add a container");
        System.out.println("2.List all container");
        System.out.println("3.List container in range of volume");
        System.out.println("4.Remover container based on it's ID");
        System.out.println("5.Exit");
        Scanner sc = new Scanner(System.in);
        ContainerList obj = new ContainerList();
        int choice = 0;
        do {
            System.out.println("\nInput your choice: ");
            sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.addContainer();
                    break;

                case 2:
                    obj.ListallContainer();
                    break;

                case 3:
                    obj.printContainerinRange();
                    break;

                case 4:
                    String idtoDel;
                    System.out.println("Input id to delete container: ");
                    sc = new Scanner(System.in);
                    idtoDel = sc.nextLine();
                    if (obj.removeContainer(idtoDel)) {
                        System.out.println("Removed");
                    } else {
                        System.out.println("Remove failed");
                    }

                    break;

                case 5:
                    break;

            }
        } while (choice != 5);
    }
}
