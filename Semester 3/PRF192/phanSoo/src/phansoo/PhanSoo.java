/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phansoo;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class PhanSoo {

    int tu, mau;

    
        do {
    Scanner s = new Scanner(System.in);
        System.out.println("Nhập tử: ");
        tu = s.nextInt();
        s = new Scanner(System.in);
        System.out.println("Nhập mẫu: ");
        mau = s.nextInt();

    }
    while ( mau != 0 );
                
}
    PhanSoo congPS(PhanSoo C){
        int tmp1=tu*C.mau+mau*C.tu;
        int tmp2=mau*C.mau;
        PhanSoo kq=new PhanSoo();
        kq.tu=tmp1;
        kq.mau=tmp2;
        return kq;
    }
    public static void main(String[] args) {
A.xuatcongPS(B);
PhanSoo C=A.congPS(B);
C.xuatPS();
        // TODO code application logic here
    }
    
}
