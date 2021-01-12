/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe_csd;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class ContainerList extends LinkedList<Container> {

    Scanner sc = new Scanner(System.in);

    public void addContainer() {
        Container c = new Container();
        c.input();
        if (this.add(c)) {
            System.out.println("Added succesfully !!!\n");
        } else {
            System.out.println("Add failed !!!\n");
        }
    }

    public void ListallContainer() {
        for (Container thi : this) {
            System.out.println(thi);
        }
    }

    public void printContainerinRange() {
        double minValue, maxValue;
        sc = new Scanner(System.in);
        System.out.println("Input min value: ");
        minValue = sc.nextDouble();
        sc = new Scanner(System.in);
        System.out.println("Input max value: ");
        maxValue = sc.nextDouble();
        if (minValue > maxValue) {
            double temp = minValue;
            minValue = maxValue;
            maxValue = temp;
        }
        for (Container thi : this) {
            if(thi.getVolume() >= minValue && thi.getVolume() <= maxValue){
                System.out.println(thi);
            }
        }
    }
    
    public int SearchContainer(String idFind){
        return indexOf(new Container(idFind));
    }
    
    public boolean removeContainer(String id){
        int pos=SearchContainer(id);
        if(pos < 0){
            System.out.println("Not found your id !!!");
            return false;
        }else {
            this.remove(pos);
            return true;
        }
    }
 
}