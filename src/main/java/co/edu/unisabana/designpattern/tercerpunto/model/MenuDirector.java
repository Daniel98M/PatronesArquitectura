package co.edu.unisabana.designpattern.tercerpunto.model;

public class MenuDirector {
    public Menu construct(MenuBuilder builder) {
        builder.buildMainCourse();
        builder.buildAppetizer();
        builder.buildDessert();
        builder.buildBeverage();
        return builder.getMenu();
    }
}

