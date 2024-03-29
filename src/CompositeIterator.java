/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;
import java.util.Stack;
/**
 *
 * @author pieter.mels
 */
public class CompositeIterator implements Iterator {
    
    Stack stack = new Stack();
    
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }
    
    public Object next() {
        if(hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }
    
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
    
    public void remove() {
        throw new UnsupportedOperationException();
    }
    
}
