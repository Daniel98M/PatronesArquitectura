package co.edu.unisabana.designpattern.quintopunto.model;

public class StandardShipping extends Shipping {
    public StandardShipping(ShippingImplementor implementor) {
        super(implementor);
    }

    @Override
    public void shipPackage() {
        System.out.println("Envío estándar:");
        implementor.process();
    }
}


