public class MethodDemo {
    public static void main(String[] args) {
        // Call the greet method
        greet();

        // Call the printMessage method with a custom message
        printMessage("This is my message!");
    }

    // Method to greet the user
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method to print a custom message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
