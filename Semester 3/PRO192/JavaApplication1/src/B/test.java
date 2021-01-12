/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

import A.sinhVien;

/**
 *
 * @author Henry
 */
public class test {

    public static void main(String[] args) {
        // TODO code application logic here
        // tao 1 object/vung nho de chua thong tin 1 sv
        sinhVien x = new sinhVien();
        x.ma = 1;
        x.ten = "No";
        //cach 2
        x.nhapSV(); // gọi function nhapSV() chạy để nhập  mã, tên của x
        // tạo 1 object/vùng nhớ để chứa thông tin sinh viên thứ 2
        sinhVien y = new sinhVien();
        y.nhapSV(); // gọi function nhapSV để nhập mã, tên của y
        x.xuatSV(); // xuat SV x
        y.xuatSV(); // xuat SV y
    }
}
