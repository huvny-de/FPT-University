package Object;


import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sơn
 */
public class Student {

    String studentID;
    String firstName;
    String lastName;
    String gender;
    int date;
    int month;
    int year;
    String email;
    String phoneNumber;

    public Student() {
    }

    public Student(String studentID, String firstName, String lastName, String gender, int date, int month, int year, String email, String phoneNumber) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.date = date;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", date of birth=" + date + "/" + month + "/" + year + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
    }

}
