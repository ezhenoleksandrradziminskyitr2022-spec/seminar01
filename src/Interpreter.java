import java.util.Scanner;

public class Interpreter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("> ");
            String input = scanner.nextLine();

            String[] parts = input.split(" ");
            String command = parts[0];

            System.out.println("Entered command = \"" + command + "\"");

            switch (command) {

                case "ping":
                    System.out.println("pong");
                    break;

                case "echo":
                    if (parts.length > 1) {
                        System.out.println(parts[1]);
                    }
                    break;

                case "login":
                    if (parts.length >= 3) {
                        System.out.println("Login: " + parts[1]);
                        System.out.println("Password: " + parts[2]);
                    }
                    break;

                case "list":
                    System.out.println("user1 user2 user3");
                    break;

                case "msg":
                    if (parts.length >= 3) {
                        System.out.println("Message to " + parts[1] + ": " + parts[2]);
                    }
                    break;

                case "file":
                    if (parts.length >= 3) {
                        System.out.println("File " + parts[2] + " sent to " + parts[1]);
                    }
                    break;

                case "exit":
                    System.out.println("Program finished");
                    return;

                default:
                    System.out.println("Unknown command");
            }
        }
    }
}