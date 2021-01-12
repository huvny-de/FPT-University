/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class demoFile {
    /*sử dụng class File để lấy thông tin file/folder
    -user nhập path bất kỳ
    - check path có hợp lệ hay ko?
    - nếu hợp lệ
        + check path là file/folder
        + nó là folder: xuất tên file và folder con của path*/
    public static void getInformation(){
        String path;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập path: ");
        path=sc.nextLine();
        File f=new File(path);
        if(f.exists())//path có tồn tại trên máy tính
        {
            if(f.isFile())
                System.out.println("Path is a filename");
            else{
                String[] arr=f.list();
                for (String string : arr) {
                    System.out.println(string);
                }
            }
        }
        else System.out.println("path is invalid");
    }
    
}
