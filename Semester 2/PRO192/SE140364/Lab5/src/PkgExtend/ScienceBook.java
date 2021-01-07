/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgExtend;

import PkgBasic.Book;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class ScienceBook extends Book {

    String type;

    public ScienceBook() {
        super();
        type = "";
    }

    public ScienceBook(String Code, String Title, String type) {
        super(Code, Title);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.equals("")) {
            this.type = type;
        }
    }

    public void inputScience() {
        boolean doing = true;
        while (doing) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input Type: ");
                type = sc.nextLine();
                if (type.equals("")) {
                    throw new Exception("Type must not be empty");
                }
                doing = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public String toString() {
        return " (" + type + ", " + code + ", " + title + ')' + ";";
    }
}
