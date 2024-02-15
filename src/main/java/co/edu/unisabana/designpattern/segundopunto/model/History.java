package co.edu.unisabana.designpattern.segundopunto.model;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<Command> commandHistory = new ArrayList<>();

    public void addCommand(Command command) {
        commandHistory.add(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            System.out.println("\nDeshaciendo la última acción:");
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        } else {
            System.out.println("No hay acciones para deshacer.");
        }
    }
}

