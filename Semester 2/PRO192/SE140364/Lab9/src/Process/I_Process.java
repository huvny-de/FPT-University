/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Base.Animal;

/**
 *
 * @author Henry
 */
public interface I_Process {
	public boolean add(Animal x);
	
	public Animal Update(int id);
	
	public Animal Delete(int id);
	
	public Animal find(int id);
	
	public void sortByColor();
}

