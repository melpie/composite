/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class Main {
    
    public static void main(String args[]) {
        
        MenuComponent pancakeHouseMenu = new Menu("PANNENKOEKENHUIS MENU", "Ontbijt");
        MenuComponent dinerMenu = new Menu("RESTAURANT MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Diner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert!");
        
        MenuComponent allMenus = new Menu("ALLE MENUS", "Alle menu's samen");
        
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        
        dinerMenu.add(new MenuItem("Pasta","Spaghetti met marinarasaus, en een snee zuurdesembrood", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Appeltaart", "Knapperige appeltaart, bedekt met vanille-ijs", true, 1.59));
        
        Waitress waitress = new Waitress(allMenus);
        
        waitress.printVegetarianMenu();        
        
    }
    
}
