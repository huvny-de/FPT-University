/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Henry
 */
public class SE140364_Employee {

    private String Code;
    private String Name;
    private String Address;
    private int Salary;

    public SE140364_Employee(String Code, String Name, String Address, int Salary) {
        this.Code = Code;
        this.Name = Name;
        this.Address = Address;
        this.Salary = Salary;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "SE140364_Employee{" + "Code=" + Code + ", Name=" + Name + ", Address=" + Address + ", Salary=" + Salary + '}';
    }
}
