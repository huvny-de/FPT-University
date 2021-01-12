/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanpham;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class sanPham {

    String ten;
    int ma, giaGoc, giaBan, soSP;
    float discount;

    //

    void nhapSP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap thong tin san pham");
        System.out.println("Ma:");
        ma = s.nextInt();
        s = new Scanner(System.in); // xóa bộ nhớ đệm
        System.out.println("Ten:");
        ten = s.nextLine();
        s = new Scanner(System.in); // xóa bộ nhớ đệm
        System.out.println("Gia goc:");
        giaGoc = s.nextInt();
        s = new Scanner(System.in); // xóa bộ nhớ đệm
        System.out.println("Discount:");
        discount = s.nextFloat();
        s = new Scanner(System.in); // xóa bộ nhớ đệm
        System.out.println("Gia ban:");
        giaBan = s.nextInt();
        s = new Scanner(System.in); // xóa bộ nhớ đệm

    }

    void xuatSP() {
        System.out.println("Ma: " + ma + "\n" + "Ten: " + ten + "\n" + "Gia goc: " + giaGoc + "\n" + "Discount: " + discount + "%" + "\n" + "Gia ban: " + giaBan + "\n");
        //System.out.println("Ma: "+ ma);
        //System.out.println("Ten: "+ ten);
        //System.out.println("Gia goc: "+ giaGoc);
        //System.out.println("Discount: "+ discount+"%"+ ten);
        //System.out.println("Gia ban: "+ giaBan);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soSP;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so san pham ban muon quan ly");
        soSP = s.nextInt();
        s = new Scanner(System.in);
        for (int i = 0; i < soSP; i++) {
            sanPham x = new sanPham();
            x.nhapSP();
            x.xuatSP();

        }

        /*sanPham x=new sanPham();
         x.nhapSP();
         x.xuatSP();*/
    }

}
