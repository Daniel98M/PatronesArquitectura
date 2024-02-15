package co.edu.unisabana.designpattern.cuartopunto.model;

public class ChocolateDecorator implements RoomDecorator {
    private final Room room;

    public ChocolateDecorator(Room room) {
        this.room = room;
    }

    @Override
    public String addObject() {
        return ", con chocolate gourmet";
    }

    @Override
    public String getDescription() {
        return room.getDescription() + addObject();
    }

    @Override
    public double getCost() {
        return room.getCost() + 15.0;
    }
}

