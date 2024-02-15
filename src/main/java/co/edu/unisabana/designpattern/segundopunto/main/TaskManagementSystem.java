package co.edu.unisabana.designpattern.segundopunto.main;

import co.edu.unisabana.designpattern.segundopunto.model.*;

public class TaskManagementSystem {

    public static void main(String[] args) {
        Task task = new Task("Hacer ejercicio");

        Command completeCommand = new CompleteTaskCommand(task);
        Command editCommand = new EditTaskCommand(task, "Hacer ejercicio por 30 minutos");
        Command deleteCommand = new DeleteTaskCommand(task);

        Invoker invoker = new Invoker();

        invoker.setCommand(completeCommand);
        invoker.executeCommand();

        invoker.setCommand(editCommand);
        invoker.executeCommand();

        invoker.setCommand(deleteCommand);
        invoker.executeCommand();

        History history = new History();
        history.addCommand(completeCommand);
        history.addCommand(editCommand);
        history.addCommand(deleteCommand);
        history.undoLastCommand();
    }
}

