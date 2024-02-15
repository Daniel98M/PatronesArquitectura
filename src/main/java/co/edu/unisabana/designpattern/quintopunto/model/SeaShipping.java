package co.edu.unisabana.designpattern.quintopunto.model;

public class SeaShipping implements ShippingImplementor {
    @Override
    public void process() {
        System.out.println("Procesando envío marítimo.");
    }
}
