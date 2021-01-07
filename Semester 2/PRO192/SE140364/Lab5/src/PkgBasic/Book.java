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
public class Book {

    protected String code;
    protected String title;

    public Book(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public Book() {
        this.code = "";
        this.title = "";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "code=" + code + ", title=" + title + '}';
    }

}
