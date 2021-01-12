
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class StudentManagement {
     List<Student> studentlist;

    public StudentManagement(){
        studentlist = new ArrayList();
    }
    public boolean addStudent(Student s){
        studentlist.add(s);
        return true;
    }public void displayAll() {
        for (int i = 0; i < studentlist.size(); i++) {
            System.out.println(studentlist.get(i).toString());

        }
        /*for (Book book : list) {
            System.out.println(book.toString());
         */
    }

    public int findStudent(int id) {
        for (int i = 0; i < studentlist.size(); i++) {
            if (studentlist.get(i).getId() == id) {
                return i;
            }
        }
        return -1;

    }

    public boolean updateStudnet(int id) {
        //tim vi tri book trung id
        int pos = findStudent(id);
        if (pos >= 0) {//thay
            String newname;
            System.out.println("Input new name");
            Scanner sc = new Scanner(System.in);
            newname = sc.nextLine();
            studentlist.get(pos).setName(newname);
            return true;
/* this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.email = email;*/
        }   
        return false;
    }

    public boolean removeBook(int id) {
        // tim vi tri book trong list   
        int pos = findBook(id);
        // chia thanh 2 truong hop: tim thay va kh thay
        if (pos < 0) {
            return false;
        }
        list.remove(pos);
        return true;
    }
     
     
    
}
