/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class RunnableClassUsing {

    public static void main(String[] args) {
        RunnableThread obj = new RunnableThread();
        Thread t = new Thread(obj);
        t.start();
        System.out.println("I'm the main thread");
        System.out.println("Hello");
    }
}
