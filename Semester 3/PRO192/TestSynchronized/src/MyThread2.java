/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class MyThread2 extends Thread {

    Table t;

    public MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }

}
