/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Base.Animal;
import Base.Cat;
import Process.I_Process;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class CatManager implements I_Process {

    HashSet<Animal> list;
    static int price = 10000;

    public CatManager() {
        list = new HashSet<>();
    }

    public boolean add(Animal x) {
        if (list.add(x)) {
            return true;
        } else {
            return false;
        }
    }

    public Animal find(int id) {
        for (Animal animal : list) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }

    @Override
    public Animal Update(int id) {
        Animal check = find(id);
        if (check != null) {
            check.input();
            return check;
        }
        return null;
    }

    @Override
    public Animal Delete(int id) {
        Animal check = find(id);
        if (check == null) {
            return null;
        } else {
            list.remove(check);
        }
        return check;
    }

    @Override
    public void sortByColor() {
        Cat[] arr = new Cat[list.size()];
        arr = list.toArray(arr);
        Arrays.sort(arr, Cat.byColor);

        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
