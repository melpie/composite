/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;

/**
 *
 * @author pieter.mels
 */
public class NullIterator implements Iterator {
    
    public Object next() {
        return null;
    }
    
    public boolean hasNext() {
        return false;
    }
    
    public void remove() {
        throw new UnsupportedOperationException();
    }
    
}
