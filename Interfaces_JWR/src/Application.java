public class Application {
    public static void main(String[] args) {
        // This will test the Task class  
        Task task1 = new Task("Code writing project");
        Task task2 = new Task("Test for code project");
        task2.setPriority(Priority.MAX_PRIORITY);

        System.out.println(task1);
        System.out.println(task2);

        System.out.println("Result of comparing task1 and task2: " + task1.compareTo(task2));

        // This will test the Process class
        Process process1 = new Process("Process1");
        Process process2 = new Process("Process23");
        process2.setPriority(Priority.MIN_PRIORITY);

        System.out.println(process1);
        System.out.println(process2);

        System.out.println("Result of comparing process1 and process2: " + process1.compareTo(process2));
    }
}