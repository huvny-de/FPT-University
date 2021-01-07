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
public class Paragraph extends Tag{

    private String color;

    public Paragraph() {
    }

    public Paragraph(String color, String name, String content) {
        super(name, content);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    @Override
    public void format(int width, int height) {
        System.out.println("<paragragh color=’" + color + "’> " + super.getContent() + "</paragragh>");
    }
    
}
