package co.edu.unisabana.designpattern.segundopunto.model;

public class CompleteTaskCommand implements Command {
    private final Task task;

    public CompleteTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.complete();
    }

    @Override
    public void undo() {
        task.uncomplete();
    }
}

