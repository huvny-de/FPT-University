/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diem;

/**
 *
 * @author Henry
 */
public class Circle {

    float radius;
    Diem p;

    public Circle() {
        radius = 0;
        p = new Diem();
    }

    public Circle(float radius, Diem p) {
        this.radius = radius;
        this.p = p;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Diem getP() {
        return p;
    }

    public void setP(Diem p) {
        if (p != null) {
            this.p = p;
        }
    }

    public void relativePosition() {
        double d = p.khoangCach2Diem(B.p);
        float sum= radius+B.radius;
        if(d==sum)
            System.out.println("two outer contact circles");
        else
            System.out.println("nothing");
    }
}
