package co.edu.unisabana.designpattern.tercerpunto.main;

import co.edu.unisabana.designpattern.tercerpunto.model.ItalianMenuBuilder;
import co.edu.unisabana.designpattern.tercerpunto.model.Menu;
import co.edu.unisabana.designpattern.tercerpunto.model.MenuBuilder;
import co.edu.unisabana.designpattern.tercerpunto.model.MenuDirector;

public class RestaurantMenu {
    public static void main(String[] args) {
        MenuDirector director = new MenuDirector();

        MenuBuilder italianMenuBuilder = new ItalianMenuBuilder();

        Menu italianMenu = director.construct(italianMenuBuilder);

        System.out.println("Menú Italiano:");
        System.out.println(italianMenu);
    }
}

