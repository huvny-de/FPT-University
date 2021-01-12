/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class MyArray {

    public int count;
    public int arr[];
    public int valueSearch;

    public MyArray() {
        count = 0;
    }

    int choice() {
        int choice;
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose an option:");
        choice = s.nextInt();
        s = new Scanner(System.in);
        return choice;
    }

    public MyArray(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (this.count > 0) {
            this.count = count;
        }
    }

    void Menu() {
        System.out.println("------- Menu -------\n1. Create Array\n2. Display\n3. Sort the array\n4. Search a value \n5. Exit");
    }

    void createArray() {
        arr = new int[inputCount()];
        for (int i = 0; i < inputCount(); i++) {
            arr[i] = (int) (Math.round(Math.random() * 10000) % 100);
        }
        break;
    }

    void display() {
        for (int i = 0; i < inputCount(); i++) {
            System.out.println("Your array: " + arr[i]);
        }
    }

    void bubbleSort() {
        int tmpSort;
        for (int i = 0; i < inputCount() - 1; i++) {
            for (int j = inputCount() - 1; j >= 1; j--) {
                if (arr[i] < arr[j - 1]) {
                    tmpSort = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmpSort;
                }
            }
        }
        System.out.println("Mang sau khi sap xep: ");
        for (int i = 0; i < inputCount(); i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    int search() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap gia tri ban muon tim: ");
        valueSearch = s.nextInt();
        for (int i = 0; i < inputCount(); i++) {
            if (arr[i] == valueSearch) {
                System.out.println("Tim thay gia tri " + valueSearch + " tai vi tri: #" + i + 1);
            } else {
                System.out.println("Khong tim thay gia tri: " + valueSearch);
            }
        }
        return valueSearch;
    }

    public static void main(String[] args) {
        MyArray x = new MyArray();
        do {
            x.Menu();
            switch (x.choice()) {
                case 1:
                    Scanner s = new Scanner(System.in);
                    System.out.println("Please enter numbers of element in array: ");
                    count = s.nextInt();
                    s = new Scanner(System.in);
                    x.createArray();
                    break;
                case 2:
                    x.display();
                    break;
                case 3:
                    x.bubbleSort();
                    break;
                case 4:
                    x.search();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Vui long nhap lua chon tu 1..4 hoac 5 de thoat!");
                    break;
            }
        } while (x.choice() != 5);

    }

}
