/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Base.Tag;

/**
 *
 * @author Henry
 */
    public class Img extends Tag{
    private String src;
    private int top, left;

    public Img() {
    }

    public Img(String src, int top, int left, String name, String content) {
        super(name, content);
        this.src = src;
        this.top = top;
        this.left = left;
    }


    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }
    
    @Override
    public void format(int width, int height) {
        System.out.println("<img src=’" + src + "’ top='" + top + "' left='" + left + "'>");
    }
    
    
}

