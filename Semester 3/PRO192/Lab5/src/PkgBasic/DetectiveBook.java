/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgBasic;

/**
 *
 * @author Henry
 */
public class DetectiveBook extends Book {

    public int price;
    int yearofpublication;

    public DetectiveBook(int price, int yearofpublication, String code, String title) {
        super(code, title);
        this.price = price;
        this.yearofpublication = yearofpublication;
    }

    public DetectiveBook() {
        super();
        this.price = 0;
        this.yearofpublication = 0;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(int yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    @Override
    public String toString() {
        return title + " - " + yearofpublication + " - " + price + "$; ";
    }

}
