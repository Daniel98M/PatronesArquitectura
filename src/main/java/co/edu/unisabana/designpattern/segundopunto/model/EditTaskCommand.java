package co.edu.unisabana.designpattern.segundopunto.model;

public class EditTaskCommand implements Command {
    private final Task task;
    private final String oldDescription;
    private final String newDescription;

    public EditTaskCommand(Task task, String newDescription) {
        this.task = task;
        this.oldDescription = task.getDescription();
        this.newDescription = newDescription;
    }

    @Override
    public void execute() {
        task.edit(newDescription);
    }

    @Override
    public void undo() {
        task.edit(oldDescription);
    }
}

