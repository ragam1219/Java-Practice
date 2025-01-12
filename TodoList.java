import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("To-Do List:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    break;
                case "2":
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case "3":
                    System.out.print("Enter task number to remove: ");
                    int taskIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // clear buffer
                    if (taskIndex >= 0 && taskIndex < tasks.size()) {
                        tasks.remove(taskIndex);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (!choice.equals("4"));
    }
}
