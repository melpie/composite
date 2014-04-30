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
public class Waitress {
    
    MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu() {
        allMenus.print();
    }
    
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARISCH MENU\n----------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
    
}
