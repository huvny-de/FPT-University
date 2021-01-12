/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import Core.Paragraph;
import Base.Tag;
/**
 *
 * @author Henry
 */
public class WebPage {
    Tag[] List;
    int Count;

    public WebPage() {
        List = new Tag[10];
        Count = 0;
    }
    
    public void insertTag(Tag x){
        List[Count] = x;
        Count++;
    }
    
    public void deleteTag(String Name){
        for (int i = 0; i < Count; i++){
            if (List[i].getName().equals(Name)){
                for (int j = i + 1; j < Count ; j++){
                    List[j - 1] = List[j];
                }
                Count--;
            }
        }
    }
    
    public void displayWebPage(){
        for (int i = 0; i < Count; i++){
            List[i].format(0, 0);
        }
    }
    
    public void displayParagragh(){
        for (int i = 0; i < Count; i++){
            if (List[i] instanceof Paragraph){
                List[i].format(0, 0);
            }
        }
    }
}