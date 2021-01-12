/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diem.pkgthis;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class sinhVienThis {

    int ma;
    String ten;

    void nhapSV() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma");
        ma = s.nextInt();
        s = new Scanner(System.in);
        System.out.println("Nhap ten");
        ten = s.nextLine();
    }

    void xuatSV() {
        System.out.println("Ma: " + ma + "\nTen: " + ten);
    }

    public sinhVienThis() {
        ma = 0; // this.ma=0
        ten = "";// this.ten="";
    }

    //constructor
    public sinhVienThis(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public sinhVienThis(sinhVienThis B) {
        ma = B.ma;
        ten = B.ten;
    }

    // setter
    void setMa(int ma) {
        if (ma > 0) {
            this.ma = ma;
        }
    }

    void setTen(String ten) {
        if (!ten.equals("")) {
            this.ten = ten;
        }
    }

    //getter
    public sinhVienThis(String ten) {
        this.ten = ten;
    }

    //getter

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public static void main(String[] args) {
        sinhVienThis x = new sinhVienThis();
        //cach 1:
        //x.ma=1;
        //x.ten="";
        x.setMa(1);
        x.setTen("love");
        x.nhapSV();
        System.out.println("Thong tin sinh vien da nhap");
        x.xuatSV();
        // xuat ten sinh vien 1
        //System.out.println("Ten cua sv 1: "+ x.ten);// bat lich su
        System.out.println("Ten cua sv 1: " + x.getTen());
    }
}
