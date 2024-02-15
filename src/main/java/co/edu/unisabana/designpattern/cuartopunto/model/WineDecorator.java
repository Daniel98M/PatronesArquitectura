package co.edu.unisabana.designpattern.cuartopunto.model;

public class WineDecorator implements RoomDecorator {
    private final Room room;

    public WineDecorator(Room room) {
        this.room = room;
    }

    @Override
    public String addObject() {
        return ", con vino de alta calidad";
    }

    @Override
    public String getDescription() {
        return room.getDescription() + addObject();
    }

    @Override
    public double getCost() {
        return room.getCost() + 30.0;
    }
}

