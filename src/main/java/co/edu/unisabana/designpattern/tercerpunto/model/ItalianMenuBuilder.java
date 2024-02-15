package co.edu.unisabana.designpattern.tercerpunto.model;

public class ItalianMenuBuilder implements MenuBuilder {
    private final Menu menu;

    public ItalianMenuBuilder() {
        this.menu = new Menu();
    }

    @Override
    public void buildMainCourse() {
        menu.setMainCourse("Pizza Margherita");
    }

    @Override
    public void buildAppetizer() {
        menu.setAppetizer("Bruschetta");
    }

    @Override
    public void buildDessert() {
        menu.setDessert("Tiramisu");
    }

    @Override
    public void buildBeverage() {
        menu.setBeverage("Chianti");
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}

