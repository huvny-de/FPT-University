/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class sinhVien {
    //fields
    public int ma;
    public String ten;
    protected int diem;
    private String gf;
    //methods
    public void nhapSV(){
        Scanner s=new Scanner(System.in); // input
        System.out.println("Nhap ma: ");
        ma=s.nextInt(); // nhập 1 số nguyên từ bàn phím và lưu vào ma
        s=new Scanner(System.in); // xóa bộ nhớ đệm
        System.out.println("Nhap ten: ");
        ten=s.nextLine(); // nhập chuỗi và lưu vào ten
    }
    public void xuatSV(){
        System.out.println("Ma : "+ ma);
        System.out.println("Ten : "+ ten);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tao 1 object/vung nho de chua thong tin 1 sv
        sinhVien x=new sinhVien();
        x.ma=1;
        x.ten="No";
        //cach 2
        x.nhapSV(); // gọi function nhapSV() chạy để nhập  mã, tên của x
        // tạo 1 object/vùng nhớ để chứa thông tin sinh viên thứ 2
        sinhVien y=new sinhVien();
        y.nhapSV(); // gọi function nhapSV để nhập mã, tên của y
        x.xuatSV(); // xuat SV x
        y.xuatSV(); // xuat SV y
        
    }
    
}