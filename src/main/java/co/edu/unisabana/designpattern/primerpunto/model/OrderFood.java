package co.edu.unisabana.designpattern.primerpunto.model;

public class OrderFood extends OrderTemplate {

    @Override
    protected void takeOrder() {
        System.out.println("Tomar pedido de comida");
    }

    @Override
    protected void verifyAvailability() {
        System.out.println("Verificar disponibilidad de ingredientes para comida");
    }

    @Override
    protected void calculatePrice() {
        System.out.println("Calcular precio de la comida");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparar la comida");
    }

    @Override
    protected void deliver() {
        System.out.println("Entregar la comida al cliente");
    }
}

