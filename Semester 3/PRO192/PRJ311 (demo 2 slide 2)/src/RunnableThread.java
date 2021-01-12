/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class RunnableThread implements Runnable{
    public RunnableThread(){
        
    }
    public void run(){
        System.out.println("I'm a child thread");
    }
    
}
