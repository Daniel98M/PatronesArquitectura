package co.edu.unisabana.designpattern.quintopunto.model;

public class ExpressShipping extends Shipping {
    public ExpressShipping(ShippingImplementor implementor) {
        super(implementor);
    }

    @Override
    public void shipPackage() {
        System.out.println("Envío express:");
        implementor.process();
    }
}
