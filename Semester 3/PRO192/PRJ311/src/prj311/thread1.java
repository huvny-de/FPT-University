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
public class thread1 extends Thread {

    public thread1() {
        super();
    }

    public void run() {
        System.out.println("I'm a child thread");
    }
}
