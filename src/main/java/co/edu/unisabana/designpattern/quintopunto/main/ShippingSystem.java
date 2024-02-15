package co.edu.unisabana.designpattern.quintopunto.main;

import co.edu.unisabana.designpattern.quintopunto.model.*;

public class ShippingSystem {
    public static void main(String[] args) {
        ShippingImplementor groundImplementor = new GroundShipping();
        ShippingImplementor seaImplementor = new SeaShipping();
        ShippingImplementor airImplementor = new AirShipping();

        Shipping standardGroundShipping = new StandardShipping(groundImplementor);
        standardGroundShipping.shipPackage();

        Shipping standardSeaShipping = new StandardShipping(seaImplementor);
        standardSeaShipping.shipPackage();

        Shipping standardAirShipping = new StandardShipping(airImplementor);
        standardAirShipping.shipPackage();

        Shipping expressGroundShipping = new ExpressShipping(groundImplementor);
        expressGroundShipping.shipPackage();

        Shipping expressSeaShipping = new ExpressShipping(seaImplementor);
        expressSeaShipping.shipPackage();

        Shipping expressAirShipping = new ExpressShipping(airImplementor);
        expressAirShipping.shipPackage();
    }
}

