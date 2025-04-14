import java.util.ArrayList;
import java.util.Collections;

// Custom exception class
class TaskNotFoundException extends Exception {
    public TaskNotFoundException(String message) {
        super(message);
    }
}

class TaskManager {
    private ArrayList<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        try {
            if (task == null || task.trim().isEmpty()) {
                throw new IllegalArgumentException("Task cannot be null or empty");
            }
            tasks.add(task);
            System.out.println("Task added: " + task);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("addTask completed.");
        }
    }

    public void removeTask(String task) {
        try {
            if (tasks.remove(task)) {
                System.out.println("Task removed: " + task);
            } else {
                throw new TaskNotFoundException("Task not found, cannot remove: " + task);
            }
        } catch (TaskNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("removeTask completed.");
        }
    }

    public void sortTasks() {
        try {
            Collections.sort(tasks);
            System.out.println("Tasks sorted successfully.");
        } catch (Exception e) {
            System.out.println("Error while sorting tasks: " + e.getMessage());
        } finally {
            System.out.println("sortTasks completed.");
        }
    }

    public void searchTask(String task) {
        try {
            int index = tasks.indexOf(task);
            if (index != -1) {
                System.out.println("Task found at index: " + index);
            } else {
                throw new TaskNotFoundException("Task not found: " + task);
            }
        } catch (TaskNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("searchTask completed.");
        }
    }

    public void findLongestTask() {
        try {
            if (tasks == null || tasks.isEmpty()) {
                System.out.println("No tasks available.");
                return;
            }
            String longestTask = tasks.get(0);
            for (String task : tasks) {
                if (task.length() > longestTask.length()) {
                    longestTask = task;
                }
            }
            System.out.println("Longest task: " + longestTask);
        } catch (Exception e) {
            System.out.println("Error while finding longest task: " + e.getMessage());
        } finally {
            System.out.println("findLongestTask completed.");
        }
    }

    public void getTaskByIndex(int index) {
        try {
            String task = tasks.get(index);
            System.out.println("Task at index " + index + ": " + task);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index " + index + ". " + e.getMessage());
        } finally {
            System.out.println("getTaskByIndex.");
        }
    }

    public void printTasks() {
        System.out.println("Tasks: " + tasks);
    }
}

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Complete homework");
        taskManager.addTask("Go shopping");
        taskManager.addTask("do coding task");
        taskManager.addTask("Jog");
        taskManager.addTask("work out");
        taskManager.addTask("  ");
        taskManager.printTasks();


        taskManager.sortTasks();
        taskManager.printTasks();

        taskManager.searchTask("Call mom");
        taskManager.addTask("do coding task");
        taskManager.searchTask("Go to gym");

        taskManager.removeTask("Go shopping");
        taskManager.removeTask("Go to gym");

        taskManager.getTaskByIndex(0);
        taskManager.getTaskByIndex(5);

        taskManager.findLongestTask();
    }
}
