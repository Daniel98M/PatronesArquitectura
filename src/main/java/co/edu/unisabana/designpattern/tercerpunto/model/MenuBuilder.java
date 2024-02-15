package co.edu.unisabana.designpattern.tercerpunto.model;

public interface MenuBuilder {
    void buildMainCourse();
    void buildAppetizer();
    void buildDessert();
    void buildBeverage();
    Menu getMenu();
}

