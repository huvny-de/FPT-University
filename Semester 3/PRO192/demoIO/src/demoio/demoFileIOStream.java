///*/*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package demoio;
//
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//
///**
// *
// * @author Henry
// */
//public class demoFileIOStream {
//
//    public static void writeFile(String filename, sanPham sp) {
//        FileOutputStream f = null;
//        ObjectOutputStream of = null;
//        try {
//            f = new FileOutputStream(filename);
//            of = new ObjectOutputStream(f);
//            of.writeObject(sp);// lenh nay chi chay duoc khi
//            of.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (f != null) {
//                    f.close();
//                }
//                if (of != null) {
//                    of.close();
//                }
//            } catch  {
//
//            }
//        }
//    }
//    public static sanPham readFile(String filename,sanPham sp){
//        FileOutputStream f = null;
//        ObjectOutputStream of = null;
//        try {
//            f = new FileOutputStream(filename);
//            of = new ObjectOutputStream(f);
//            of.writeObject(sp);// lenh nay chi chay duoc khi
//            of.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally{
//            
//        }
//        return result;
//    }
//
//*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author PC
 */
public class demoFileIOStream {
    public static byte[] rs;
    /*hàm này để đọc nhị phân từ file ảnh và cất kq vào rs*/
    public static void readImg(String filename){
        FileInputStream f=null;
        try{
            f=new FileInputStream(filename);//tạo buffer đang chứa dữ liệu nhị phân của filename
            int size=f.available();//hàm này để lấy kích thước buffer
            rs=new byte[size];
            f.read(rs);//đọc nội dung nhị phân từ buffer của f và cất vào rs
        } catch (Exception e){
            e.printStackTrace();//in lỗi nếu có
        }
        finally{
            try{
                if(f!=null) f.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /*hàm này để ghi mảng nhị phân rs vào file*/
    public static void writeImg(String filename){
        FileOutputStream f=null;
        try{
            f=new FileOutputStream(filename);
            f.write(rs);
            f.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(f!=null) f.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

