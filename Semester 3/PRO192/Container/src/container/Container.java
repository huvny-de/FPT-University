/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

/**
 *
 * @author Henry
 */
public class Container {

    String id;
    double volume, netWeight, grossWeight;

    public Container(String id, double volume, double netWeight, double grossWeight) {
        this.id = id;
        this.volume = volume;
        this.netWeight = netWeight;
        this.grossWeight = grossWeight;
    }

    @Override
    public String toString() {
        return "Container{" + "id=" + id + ", volume=" + volume + ", netWeight=" + netWeight + ", grossWeight=" + grossWeight + '}';
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

}
