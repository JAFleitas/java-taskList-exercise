import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
    private final List<String> taskList;

    public TaskManager(){
        this.taskList = new ArrayList<>();
    }

    public void addTask(String task){
        this.taskList.add(task);
    }

    public void markTaskAsCompleted(int index){
        if (index > 0 && index < this.taskList.size() ){
            this.taskList.set(index,"[COMPLETED] " + this.taskList.get(index));
            System.out.println("Task marked as complete");
        }
        else{
            System.out.println("invalid index.");
        }
    }

    public void removeTask(int index){
        this.taskList.remove(index);
        System.out.println("Removed task successfully");
    }

    public void printTaskList (){
        System.out.println("To do list size: " + this.taskList.size() );
        for (int i = 0; i < this.taskList.size(); i ++){
            System.out.println((i+1) +". "+ taskList.get(i));
        }
    }
    public void sortListAZ(){
        Collections.sort(this.taskList);
    }

    public String checkEmptyList() {
        return taskList.isEmpty() ? " Yes" : " No";

    }

    public String[] createVector(){
        return this.taskList.toArray(new String[0]);
    }

    public void removeAllTask() {
        this.taskList.removeAll(this.taskList);
    }
}