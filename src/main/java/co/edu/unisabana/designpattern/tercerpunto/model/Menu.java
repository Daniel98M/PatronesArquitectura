package co.edu.unisabana.designpattern.tercerpunto.model;

public class Menu {
    private String mainCourse;
    private String appetizer;
    private String dessert;
    private String beverage;

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mainCourse='" + mainCourse + '\'' +
                ", appetizer='" + appetizer + '\'' +
                ", dessert='" + dessert + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}

