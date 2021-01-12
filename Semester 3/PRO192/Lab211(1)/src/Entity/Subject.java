/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Henry
 */
public class Subject {
    int sbId, credit;
    String sbName;

    public Subject(int sbId, int credit, String sbName) {
        this.sbId = sbId;
        this.credit = credit;
        this.sbName = sbName;
    }

    public int getSbId() {
        return sbId;
    }

    public void setSbId(int sbId) {
        this.sbId = sbId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getSbName() {
        return sbName;
    }

    public void setSbName(String sbName) {
        this.sbName = sbName;
    }

    @Override
    public String toString() {
        return "Subject{" + "sbId=" + sbId + ", credit=" + credit + ", sbName=" + sbName + '}';
    }
    
}
