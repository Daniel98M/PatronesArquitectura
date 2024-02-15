package co.edu.unisabana.designpattern.quintopunto.model;

public class AirShipping implements ShippingImplementor {
    @Override
    public void process() {
        System.out.println("Procesando envío aéreo.");
    }
}
