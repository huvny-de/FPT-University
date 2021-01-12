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
public interface myIterator<E> {
    public boolean hashNext(); // kiếm tra ptu tiếp theo
    public E next(); // ptu ke tiep
}
