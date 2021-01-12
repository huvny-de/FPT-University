/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe_csd;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Container {

    String id;
    double volume, netWeight, grossWeight;
    
    public Container() {
       
    }

    public Container(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }
    

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id: ");
        id = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Input volume: ");
        volume = sc.nextDouble();
        sc = new Scanner(System.in);
        System.out.println("Input netWeight: ");
        netWeight = sc.nextDouble();
        sc = new Scanner(System.in);
        System.out.println("Input grossWeight: ");
        grossWeight = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Container{" + "id=" + id + ", volume=" + volume + ", netWeight=" + netWeight + ", grossWeight=" + grossWeight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       return this.id.equals(((Container)obj).id);       
    }
    
    
}
