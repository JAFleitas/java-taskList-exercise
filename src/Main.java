
public class Main {
    public static void main(String[] args) {
    TaskManager taskManager = new TaskManager();

    taskManager.addTask("Terminar los ejercicios de java");
    taskManager.addTask("Seguir el trabajo integrador");
    taskManager.addTask("Tomarme un cafecito");

    taskManager.markTaskAsCompleted(2);

    taskManager.printTaskList();

    System.out.println("---------------------");
    taskManager.removeTask(2);

    System.out.println("---------------------");
    taskManager.printTaskList();

    // utilizar el metodo sort() para ordenar el array alfabeticamente
    System.out.println("---------------------");
    taskManager.sortListAZ();
    taskManager.printTaskList();

    // utilizar el metodo isEmpty
    System.out.println("---------------------");
    System.out.println("The list is empty?" + taskManager.checkEmptyList());


    // utilizar el metodo toArray
    String[] taskArray = taskManager.createVector();
        System.out.println(taskArray[0]);

    // utilizar el metodo isEmpty
    System.out.println("---------------------");
    taskManager.removeAllTask();
    System.out.println("The list is empty?" + taskManager.checkEmptyList());
    }


}
