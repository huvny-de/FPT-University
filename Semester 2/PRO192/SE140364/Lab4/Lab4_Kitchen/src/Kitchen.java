/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class Kitchen {

    String code, style, warehouse;
    int width, length, price;

    public Kitchen(String code, String style, int width, int length, String warehouse, int price) {
        this.code = code;
        this.style = style;
        this.warehouse = warehouse;
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Kitchen(" + code + ", " + style + ", " + warehouse + ", " + width + ", " + length + ", " + price + ')';
    }

}
