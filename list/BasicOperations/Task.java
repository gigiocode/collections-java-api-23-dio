// Create a class called "TaskList" that has a task list as an attribute. Each task is represented by a class called "Task" that has a description attribute. Implement the following methods:

// addTask(String description): Adds a new task to the list with the provided description.
// removeTask(String description): Removes a task from the list based on its description.
// getTotalNumberTasks(): returns the total number of tasks in the list.
// getDescriptionsTasks(): Returns a list containing the description of all tasks in the list.

package list.BasicOperations;

public class Task {

    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }

}
