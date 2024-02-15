package co.edu.unisabana.designpattern.cuartopunto.model;

public class BasicRoom implements Room {
    @Override
    public String getDescription() {
        return "Habitación básica";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}

