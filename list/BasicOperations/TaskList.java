// Create a class called "TaskList" that has a task list as an attribute. Each task is represented by a class called "Task" that has a description attribute. Implement the following methods:

// addTask(String description): Adds a new task to the list with the provided description.
// removeTask(String description): Removes a task from the list based on its description.
// getTotalNumberTasks(): returns the total number of tasks in the list.
// getDescriptionsTasks(): Returns a list containing the description of all tasks in the list.

package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> listTask;

    public TaskList() {
        this.listTask = new ArrayList<>();
    }

    public void addTask(String description) {
        listTask.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> removingTasks = new ArrayList<>();
        for (Task t : listTask) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                removingTasks.add(t);
            }

        }
        listTask.removeAll(removingTasks);
    }

    public int getTotalNumberTasks() {
        return listTask.size();
    }

    public void getDescriptionsTasks() {
        System.out.println(listTask);
    }

    // Unitary Tests
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        System.out.println("The total number of elements at the list is: " + taskList.getTotalNumberTasks());

        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 3");
        taskList.addTask("Task 3");
        System.out.println("The total number of elements at the list is: " + taskList.getTotalNumberTasks());

        taskList.removeTask("Task 3");
        System.out.println("The total number of elements at the list is: " + taskList.getTotalNumberTasks());

        taskList.getDescriptionsTasks();

    }

}
