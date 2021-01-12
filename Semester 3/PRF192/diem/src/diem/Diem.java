/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diem;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Diem {

    String tenDiem1, tenDiem2;
    double khoangCach;
    float toaDoX1, toaDoY1, toaDoX2, toaDoY2;

    void nhapDiem() {
        System.out.println("Nhap diem thu nhat");
        Scanner s = new Scanner(System.in);
        System.out.println("Ten diem:");
        tenDiem1 = s.nextLine();
        s = new Scanner(System.in);
        System.out.println("Toa do X: ");
        toaDoX1 = s.nextFloat();
        s = new Scanner(System.in);
        System.out.println("Toa do Y: ");
        toaDoY1 = s.nextFloat();
        s = new Scanner(System.in);
        //
        System.out.println("Nhap diem thu hai");
        System.out.println("Ten diem:");
        tenDiem2 = s.nextLine();
        s = new Scanner(System.in);
        System.out.println("Toa do X: ");
        toaDoX2 = s.nextFloat();
        s = new Scanner(System.in);
        System.out.println("Toa do Y: ");
        toaDoY2 = s.nextFloat();
        s = new Scanner(System.in);
    }

    void xuatDiem() {
        //System.out.println("Diem: " + tenDiem + "\n" + "Toa do X: " + toaDoX1 + "\n" + "Toa do Y: " + toaDoY1 + "\n
        //System.out.println("Diem : " + tenDiem1 + "\n" + "Toa do X: " + toaDoX1 + "\n" + "Toa do Y: " + toaDoY1 + "\n");
        //System.out.println("Diem: " + tenDiem2 + "\n" + "Toa do X: " + toaDoX2 + "\n" + "Toa do Y: " + toaDoY2 + "\n");
        System.out.println("\n" + tenDiem1 + "(" + toaDoX1 + "," + toaDoY1 + ")\n" + tenDiem2 + "(" + toaDoX2 + "," + toaDoY2 + ")");
    }

    void khoangCach2Diem() {
        khoangCach = Math.sqrt(Math.pow(toaDoY2 - toaDoY1, 2) + Math.pow(toaDoX2 - toaDoX1, 2));
        System.out.printf("Khoang cach hai diem %s va %s: %.2f\n", tenDiem1, tenDiem2, khoangCach);
        // double tinhKC(Diem C)
        //
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diem x = new Diem();
        x.nhapDiem();
        x.xuatDiem();
        x.khoangCach2Diem();
    }

}
