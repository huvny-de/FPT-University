/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Henry
 */
public class Student {

    String id, lastName, firstName, gender, email;
    int day, month, year, phoneNumber;

    public Student(String id, String firstName, String lastName, String gender, int day, int month, int year, int phoneNumber, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String setId(String id) {
        this.id = id;
        return null;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", day=" + day + ", month=" + month + ", year=" + year + ", phoneNumber=" + phoneNumber + ", lastName=" + lastName + ", firstName=" + firstName + ", gender=" + gender + ", email=" + email + '}';
    }

}
