package co.edu.unisabana.designpattern.primerpunto.main;

import co.edu.unisabana.designpattern.primerpunto.model.OrderTemplate;
import co.edu.unisabana.designpattern.primerpunto.model.OrderBeverage;
import co.edu.unisabana.designpattern.primerpunto.model.OrderDessert;
import co.edu.unisabana.designpattern.primerpunto.model.OrderFood;

public class RestaurantManagementSystem {

    public static void main(String[] args) {
        OrderTemplate orderFood = new OrderFood();
        OrderTemplate orderBeverage = new OrderBeverage();
        OrderTemplate orderDessert = new OrderDessert();

        System.out.println("Procesando orden de comida:");
        orderFood.processOrder();

        System.out.println("\nProcesando orden de bebida:");
        orderBeverage.processOrder();

        System.out.println("\nProcesando orden de postre:");
        orderDessert.processOrder();
    }
}

