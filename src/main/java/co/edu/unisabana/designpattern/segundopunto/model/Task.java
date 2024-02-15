package co.edu.unisabana.designpattern.segundopunto.model;

public class Task {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public void complete() {
        System.out.println("Tarea completada: " + description);
    }

    public void uncomplete() {
        System.out.println("Tarea desmarcada como incompleta: " + description);
    }

    public void edit(String newDescription) {
        this.description = newDescription;
        System.out.println("Tarea editada: " + newDescription);
    }

    public void delete() {
        System.out.println("Tarea eliminada: " + description);
    }

    public String getDescription() {
        return description;
    }
}

