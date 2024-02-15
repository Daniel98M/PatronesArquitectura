package co.edu.unisabana.designpattern.cuartopunto.main;

import co.edu.unisabana.designpattern.cuartopunto.model.*;

public class HotelRoom {
    public static void main(String[] args) {
        Room basicRoom = new BasicRoom();

        Room decoratedRoom = new ChocolateDecorator(new FlowerDecorator(new WineDecorator(basicRoom)));

        System.out.println("Descripción de la habitación: " + decoratedRoom.getDescription());
        System.out.println("Costo total de la habitación: $" + decoratedRoom.getCost());
    }
}

