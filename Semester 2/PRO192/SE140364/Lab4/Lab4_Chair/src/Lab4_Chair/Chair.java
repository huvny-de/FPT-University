/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4_Chair;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Chair {

    int code, price, weight;

    public Chair(int code, int price, int weight) {
        this.code = code;
        this.price = price;
        this.weight = weight;
    }

    public Chair() {
        this.code = 0;
        this.price = 0;
        this.weight = 0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void Input() {
        boolean doing = true;
        Scanner sc = new Scanner(System.in);
        while (doing) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Add chair's code: ");
                code = sc.nextInt();
                doing = false;
            } catch (InputMismatchException e) {
                System.out.println("Chair's code must be number !!!");
            }
        }
        doing = true;
        while (doing) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Add chair's price: ");
                price = sc.nextInt();
                doing = false;
            } catch (InputMismatchException e) {
                System.out.println("Chair's price must be number !!!");
            }
        }
        doing = true;
        while (doing) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Add chair's weight: ");
                weight = sc.nextInt();
                doing = false;
            } catch (InputMismatchException e) {
                System.out.println("Chair's weight must be number !!!");
            }
        }
    }

    @Override
    public String toString() {
        return "Chair: (" + code + ", " + price + ", " + weight + ')';
    }

}
