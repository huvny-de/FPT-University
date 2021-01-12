/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj311;

/**
 *
 * @author Henry
 */
public class thread1Using {

    public static void main(String[] args) {
        thread1 t = new thread1();
        System.out.println("I'm the main thread.");
        t.start();
        System.out.println("Hello");
    }

}
