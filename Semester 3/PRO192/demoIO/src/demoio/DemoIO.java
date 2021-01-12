/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

/**
 *
 * @author Henry
 */
public class DemoIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //demoFile.getInformation();
        demoFileIOStream.readImg("Cat1.jpg");
        demoFileIOStream.writeImg("Cat2.jpg");
        sanPham x=new sanPham("TV123", "TV Samsung");
        
    }
    
}
