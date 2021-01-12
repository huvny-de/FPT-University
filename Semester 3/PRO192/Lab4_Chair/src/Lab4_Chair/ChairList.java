/*
 * To change this license header, choice License Headers in Project Properties.
 * To change this template file, choice Tools | Templates
 * and open the template in the editor.
 */
package Lab4_Chair;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class ChairList {

    Chair[] arr;
    int count;

    public ChairList() {
        this.arr = new Chair[10];
        this.count = 0;
    }

    public void Add() {

        Chair c = new Chair();
        c.Input();
        arr[count] = c;
        count++;
    }

    public void Add(Chair x) {
        arr[count] = x;
        count++;
    }

    public void display(int min_weight, int max_weight) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getWeight() >= min_weight && arr[i].getWeight() <= max_weight) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        ChairList obj = new ChairList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1.Add new chair:");
            System.out.println("2.Add new chair (known)");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            sc = new Scanner(System.in);
            System.out.println("Input your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.Add();
                    break;
                case 2:
                    Chair x = new Chair();
                    x.Input();
                    obj.Add(x);
                    break;
                case 3:
                    int min_weight = 0,
                     max_weight = 0;
                    boolean doing = true;
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input min weight: ");
                            min_weight = sc.nextInt();
                            doing = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Min weight must be number!!!");
                        }
                    }
                    doing = true;
                    while (doing) {
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Input max weight: ");
                            max_weight = sc.nextInt();
                            doing = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Max weight must be number!!!");
                        }
                    }
                    obj.display(min_weight, max_weight);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Your choice must be from 1 to 4 !!!");
            }
        } while (choice >= 1 && choice <= 4);
    }
}
