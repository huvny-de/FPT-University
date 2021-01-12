/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class PhanSo {

    int tu1, tu2, mau1, mau2;
    int congTu, congMau, truTu, truMau, nhanTu, nhanMau, chiaTu, chiaMau;

    void nhapPS() {
        System.out.println("Nhap phan so thu nhat");
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap tu:");
        tu1 = s.nextInt();
        s = new Scanner(System.in);
        System.out.println("Nhap mau: ");
        mau1 = s.nextInt();
        s = new Scanner(System.in);
        System.out.println("Nhap phan so thu hai");
        System.out.println("Nhap tu:");
        tu2 = s.nextInt();
        s = new Scanner(System.in);
        System.out.println("Nhap mau:");
        mau2 = s.nextInt();
        s = new Scanner(System.in);
    }

    void xuatPS() {
        System.out.println("Phan so 1: " + tu1 + "/" + mau1 + "\nPhan so 2: " + tu2 + "/" + mau2);
    }

    void tinhPS() {
        if (mau1 == mau2) {
            congTu = tu1 + tu2;
            congMau = mau1;
            truTu = tu1 - tu2;
            truMau = mau1;
            nhanTu = tu1 * tu2;
            nhanMau = mau1 * mau2;
            chiaTu = tu1 * mau2;
            chiaMau = mau1 * tu2;
            System.out.println("\nTong: " + congTu + "/" + congMau + "\nHieu: " + truTu + "/" + truMau
                    + "\nTich: " + nhanTu + "/" + nhanMau + "\nThuong: " + chiaTu + "/" + chiaMau);

        } else {
            int quyDongMau = mau1 * mau2;
            congTu = tu1 * mau2 + tu2 * mau1;
            congMau = quyDongMau;
            truTu = tu1 * mau2 - tu2 * mau1;
            truMau = quyDongMau;
            nhanTu = tu1 * tu2;
            nhanMau = mau1 * mau2;
            chiaTu = tu1 * mau2;
            chiaMau = mau1 * tu2;
            System.out.println("Tong: " + congTu + "/" + congMau + "\nHieu: " + truTu + "/" + truMau
                    + "\nTich: " + nhanTu + "/" + nhanMau + "\nThuong: " + chiaTu + "/" + chiaMau);
        }
    }

    public static void main(String[] args) {
        PhanSo x = new PhanSo();
        x.nhapPS();
        x.xuatPS();
        x.tinhPS();
    }

}
