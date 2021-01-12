/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diem;

/**
 *
 * @author Henry
 */
public class Tester {

    public static void main() {
        Circle A = new Circle();
        DIem p = new Diem(2, 4);
        Circle B = new Circle(10, 2);
        A.relativePosition(B);
    }

}
