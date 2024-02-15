package co.edu.unisabana.designpattern.segundopunto.model;

public class DeleteTaskCommand implements Command {
    private final Task task;
    private Task deletedTask;

    public DeleteTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        deletedTask = task;
        task.delete();
    }

    @Override
    public void undo() {
        System.out.println("Restaurando tarea eliminada: " + deletedTask.getDescription());
    }
}

