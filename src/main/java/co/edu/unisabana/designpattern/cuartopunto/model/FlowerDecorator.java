package co.edu.unisabana.designpattern.cuartopunto.model;

public class FlowerDecorator implements RoomDecorator {
    private final Room room;

    public FlowerDecorator(Room room) {
        this.room = room;
    }

    @Override
    public String addObject() {
        return ", con flores frescas";
    }

    @Override
    public String getDescription() {
        return room.getDescription() + addObject();
    }

    @Override
    public double getCost() {
        return room.getCost() + 20.0;
    }
}

