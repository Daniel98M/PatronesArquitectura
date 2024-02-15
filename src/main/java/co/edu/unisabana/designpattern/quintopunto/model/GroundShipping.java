package co.edu.unisabana.designpattern.quintopunto.model;

public class GroundShipping implements ShippingImplementor {
    @Override
    public void process() {
        System.out.println("Procesando envío terrestre.");
    }
}
