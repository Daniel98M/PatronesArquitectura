package co.edu.unisabana.designpattern.primerpunto.model;

public class OrderDessert extends OrderTemplate {

    @Override
    protected void takeOrder() {
        System.out.println("Tomar pedido de postre");
    }

    @Override
    protected void verifyAvailability() {
        System.out.println("Verificar disponibilidad de postres");
    }

    @Override
    protected void calculatePrice() {
        System.out.println("Calcular precio del postre");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparar el postre");
    }

    @Override
    protected void deliver() {
        System.out.println("Entregar el postre al cliente");
    }
}

