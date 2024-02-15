package co.edu.unisabana.designpattern.quintopunto.model;

public abstract class Shipping {
    protected ShippingImplementor implementor;

    public Shipping(ShippingImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void shipPackage();
}

