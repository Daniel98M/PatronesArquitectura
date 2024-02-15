package co.edu.unisabana.designpattern.primerpunto.model;

public abstract class OrderTemplate {

    public final void processOrder() {
        takeOrder();
        verifyAvailability();
        calculatePrice();
        prepare();
        deliver();
    }

    protected abstract void takeOrder();

    protected abstract void verifyAvailability();

    protected abstract void calculatePrice();

    protected abstract void prepare();

    protected abstract void deliver();
}

