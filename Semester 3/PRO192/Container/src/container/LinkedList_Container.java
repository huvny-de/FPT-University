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
public class LinkedList_Container {

    Comparable data;
    LinkedList_Container next;
    LinkedList_Container previous;

    public LinkedList_Container(Comparable data, LinkedList_Container next, LinkedList_Container previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public LinkedList_Container(Comparable data) {
        this.data = data;
        next = previous = null;
    }

    public Comparable getData() {
        return data;
    }

    public void setData(Comparable data) {
        this.data = data;
    }

    public LinkedList_Container getNext() {
        return next;
    }

    public void setNext(LinkedList_Container next) {
        this.next = next;
    }

    public LinkedList_Container getPrevious() {
        return previous;
    }

    public void setPrevious(LinkedList_Container previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "LinkedList_Container{" + "data=" + data + ", next=" + next + ", previous=" + previous + '}';
    }

}
