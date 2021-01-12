/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

/**
 *
 * @author Henry
 */
public class Img extends Tag{

    private String src; 
    private int width, height;

    public Img() {
    }

    public Img(String src, int width, int height, String name, String content) {
        super(name, content);
        this.src = src;
        this.width = width;
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public void format(int width, int height) {
        System.out.println("<img src=’" + src + "’ style =”width:’" + this.width + "px’; height:’" + this.height + "px’ alt=\"" + content + "\" />");
    }
    
}
