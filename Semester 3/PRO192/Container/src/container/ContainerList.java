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
public class ContainerList {

    LinkedList_Container head;
    LinkedList_Container tail;

    public ContainerList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public LinkedList_Container ceiling(Comparable x) {
        LinkedList_Container t = head;
        //dùng while để filter ceiling
        while (t != null && t.data.compareTo(x) < 0) {
            t = t.next;
        }
        return t;
    }
//
//    public LinkedList_Container search(Comparable x) {
//        LinkedList_Container res = ceiling(x);
//        /*Cách 1*/
////        if(res==null){
////            return null;
////        }else {
////            if(res.data.compareTo(x)==0){
////                return res;
////            }else {
////                return null;
////            }
////        }
//        /*Cách 2*/
//        if (res == null) {
//            return null;
//        }
//        return (res.data.compareTo(x) == 0) ? res : null;
//        //if true return res else null
//    }

    public LinkedList_Container add(Comparable x) {
        LinkedList_Container newEle = new LinkedList_Container(x);
        LinkedList_Container after = ceiling(x);
        if (head == null) {
            head = tail = newEle;
        } else if (after == null) {
            newEle.next = null;
            newEle.previous = tail;
            tail.next = newEle;
            tail = after;
        } else if (after == head) {
            newEle.next = head;
            newEle.previous = null;
            head.previous = newEle;
            head = newEle;
        } else {
            LinkedList_Container before = after.previous;
            newEle.previous = before;
            newEle.next = after;
            before.next = newEle;
            after.previous = newEle;
        }
        return newEle;
    }

    public LinkedList_Container addFirst(LinkedList_Container newEle) {
        if (head == null) {
            head = tail = newEle;
        } else {
            newEle.next = head; //newEle will be head
            newEle.previous = null; //newEle is after null
            head.previous = newEle; //head is after newEle
            head = newEle; //newEle is head
        }
        return newEle; // trả về thàng head
    }

    public LinkedList_Container addLast(LinkedList_Container newEle) {
        if (head == null) {
            head = tail = null;
        } else {
            newEle.previous = null;
            tail.next = newEle; // tail will be element
            tail.next = newEle; // old tail is front of newEle
            tail = newEle; //new Ele is tail
        }
        return newEle;
    }

    public LinkedList_Container addAfter(LinkedList_Container newEle, LinkedList_Container p) {
        if (p == null || p == tail) {
            return addLast(newEle);
        }
        LinkedList_Container tAfter = p.next;
        //xet vi tri cua thang element so vs thang p(dia chi can add, va thang tafter)
        newEle.next = tAfter;
        newEle.previous = p;
        tAfter.previous = newEle;
        p.next = newEle;
        return newEle;
    }

    public LinkedList_Container addBefore(LinkedList_Container newEle, LinkedList_Container p) {
        if (p == null || p == head) {
            return addLast(newEle);
        }
        LinkedList_Container tBefore = p.previous;
        //xet vi tri cua thang element so vs thang p(dia chi can add, va thang tafter)
        newEle.next = p;
        newEle.previous = tBefore;
        tBefore.next = newEle;
        p.previous = newEle;
        return newEle;
    }

    public LinkedList_Container search(Comparable x) {
        LinkedList_Container t;
        for (t = head; t != null; t = t.next) {
            if (t.data.compareTo(x) == 0) {
                return t;
            }
        }
        return null;
    }

    public LinkedList_Container removeFirst() {
        LinkedList_Container result = head;
        if (head == null) {
            return null;
        }
        LinkedList_Container newHead = head.next;
        newHead.previous = null;
        head = newHead;
        return result;
    }

    public LinkedList_Container removeLast() {
        LinkedList_Container result = tail;
        if (tail == null) {
            return null;
        }
        if (tail == head) {
            head = tail = null;
        }
        LinkedList_Container newTail = tail.previous;
        newTail.next = null;
        tail = newTail;
        return result;
    }

    private class Traverse implements myIterator<Comparable> {

        LinkedList_Container curRef;

        //hàm khởi tạo mặc định
//        public Traverse(){
//            
//        }
        public Traverse() {
            curRef = new LinkedList_Container(null); //do là class nên khơi tạo phải là new
            curRef.next = head;
        }

        @Override
        public boolean hashNext() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Comparable next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public myIterator iterator() {
        if (head == null) {
            return null;
        }
        //return về hàm khởi tạo mặc định
        return new Traverse(); // trả về class Traverse nên phải new
    }

    public void addFirst(Comparable... group) {
        for (Comparable data : group) {
            addFirst(new LinkedList_Container(data));
        }
    }

    public void addLast(Comparable... group) {
        for (Comparable data : group) {
            addLast(new LinkedList_Container(data));
        }
    }
}
