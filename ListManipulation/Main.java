package ListManipulation;
import java.util.ArrayList;
import java.util.Collections;

class TaskManager{
    private ArrayList<String> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    public ArrayList<String> getTasks(){
        return tasks;
    }

    public void addTask(String task){
        try{
            if(task == null || task.trim().isEmpty()){
                throw new IllegalArgumentException("Task cannot be null or empty");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("error occurred");
        }
        tasks.add(task);
    }
    public void removeTask(String task){
        if(!tasks.contains(task)){
            System.out.println("Task not found");
        } else{
            tasks.remove(task);
        }
    }
    public void sortTasks(){
        try{
            Collections.sort(tasks);
        }catch(Exception e){
            System.out.println("error " + e.getMessage() + " occurred");
        }finally{
            System.out.println("error occurred");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Complete homework");
        taskManager.addTask("Go grocery shopping");
        taskManager.addTask("Clean the house");
        taskManager.addTask("Go to the gym");
        taskManager.addTask("Read a book");
        System.out.println("Tasks: " + taskManager.getTasks());
        taskManager.removeTask("Go grocery shopping");
        System.out.println("Tasks after removal: " + taskManager.getTasks());
    }
}
