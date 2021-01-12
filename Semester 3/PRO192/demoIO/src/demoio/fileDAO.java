/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Henry
 */
public class fileDAO {

    /* hàm này để đọc text file và chuyển các dòng thành object sp
    input
     */
    public static ArrayList<sanPham> readFile(String filename) {
        ArrayList<sanPham> list = new ArrayList<>();
        FileReader f = null;
        BufferedReader bf = null;
        try {
            f = new FileReader(filename);
            bf = new BufferedReader(f);
            while (bf.ready()) { //khi chua doc duoc EOF
                String s = bf.readLine();//s="TV123, TV Sam Sung"
                // doi chuoi s thanh object
                String[] arr = s.split(" ");// arr={"TV123","TV Sam Sung"}
                if (arr.length == 2) {
                    sanPham 
                }
                x = new sanPham(arr[0], arr[1]);
                list.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /*ham nay de ghi mang san pham vao file*/
    public static void writeFile(String filename, ArrayList<sanPham> list) {
        if (list != null) {
            PrintWriter w = null;
            try {
                w=new PrintWriter(filename);
                for (sanPham sp : list) {
                    w.println(sp.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
