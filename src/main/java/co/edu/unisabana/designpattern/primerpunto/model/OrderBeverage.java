package co.edu.unisabana.designpattern.primerpunto.model;

public class OrderBeverage extends OrderTemplate {

    @Override
    protected void takeOrder() {
        System.out.println("Tomar pedido de bebida");
    }

    @Override
    protected void verifyAvailability() {
        System.out.println("Verificar disponibilidad de bebidas");
    }

    @Override
    protected void calculatePrice() {
        System.out.println("Calcular precio de la bebida");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparar la bebida");
    }

    @Override
    protected void deliver() {
        System.out.println("Entregar la bebida al cliente");
    }
}

