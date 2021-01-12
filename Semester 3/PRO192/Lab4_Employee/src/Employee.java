/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class Employee {

    int code, basicSalary, experience;
    String name;

    public Employee(int code, int basicSalary, int experience, String name) {
        this.code = code;
        this.basicSalary = basicSalary;
        this.experience = experience;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double realSalary() {
        double bonus;
        if (getExperience() >= 10) {
            bonus = 1;
        } else if (getExperience() >= 5 & getExperience() < 10) {
            bonus = 0.8;
        } else {
            bonus = 0.1;
        }
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee: (" + code + ", " + name + ", " + (realSalary() + 1) * getBasicSalary() + ", " + experience + ')';
    }

}
