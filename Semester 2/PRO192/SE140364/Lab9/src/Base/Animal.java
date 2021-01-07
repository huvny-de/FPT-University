/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Animal {
	int id;
	String name;

	public Animal(){
		id = 0;
		name = "";
	}
	
	public Animal(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id > 0 )
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(!name.equals(""))
		this.name = name;
	}
	
	public void input(){
		boolean doing = true;
		while(doing){
			try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Input Id:");
				id = sc.nextInt();
				if(id < 0)
					throw new Exception("Id must greater than 0 !!!");
				doing = false;
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		doing = true;
		while(doing){
			try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Input name: ");
				name = sc.nextLine();
				if(name.equals(""))
					throw new Exception("Name mustn't empty !!!");
				doing = false;
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}
	

	
	
}

