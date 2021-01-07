/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Cat extends Animal {

    String gender, colorHair;

    public Cat() {
        gender = "";
        colorHair = "";
    }

    public Cat(int id, String name, String gender, String colorHair) {
        super(id, name);
        this.gender = gender;
        this.colorHair = colorHair;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.equals("")) {
            this.gender = gender;
        }
    }

    public String getColorHair() {
        return colorHair;
    }

    public void setColorHair(String colorHair) {
        if (!colorHair.equals("")) {
            this.colorHair = colorHair;
        }
    }

    @Override
    public void input() {
        super.input();
        boolean nhaplai = true;
        while (nhaplai) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input gender: ");
                gender = sc.nextLine();
                if (!gender.equals("male") & !gender.equals("female")) {
                    throw new Exception("Male or Female!");
                }
                nhaplai = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        nhaplai = true;
        while (nhaplai) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input hair color: ");
                colorHair = sc.nextLine();
                if (colorHair.equals("")) {
                    throw new Exception("Hair color mustn't empty!!");
                }
                nhaplai = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public String toString() {
        return "Cat: (" + id + ", " + name + ", " + gender + ", " + colorHair + ')';
    }

    public static Comparator<Cat> byColor = new Comparator<Cat>() {
        @Override
        public int compare(Cat o1, Cat o2) {
            if (o1.getColorHair().compareTo(o2.getColorHair()) > 0) {
                return 1;
            } else if (o1.getColorHair().compareTo(o2.getColorHair()) < 0) {
                return -1;
            }
            return 0;
        }
    };

}
