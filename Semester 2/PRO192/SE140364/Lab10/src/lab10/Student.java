/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Henry
 */
public class Student {

    String id;
    String name;

    public Student() {
        this.id = "";
        this.name = "";
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ", " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student another = (Student) obj;
            if (this.id.equals(another.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 + id.hashCode();
    }
}
