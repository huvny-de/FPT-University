/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.Serializable;

/**
 *
 * @author Henry
 */
public class sanPham implements Serializable {
// java compiler  doi object => khoi nhi phan cho viec ghi vao buffer
// va nguoc lai. khoi nhi phan doc duoc tu buffer chuyen thanh object                                                
    private String id, name;

    public sanPham(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "sanPham{ id + "," + name + '}';
    }
    
}
