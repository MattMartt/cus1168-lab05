package academy.javapro;

public class StackAdditionLab {
    public static void main(String[] args) {
        // Test case 1: Basic operations and addition
        System.out.println("=== Test Case 1: Basic Addition ===");
        // Create an instance of ArrayStack named stack
        ArrayStack<Integer> stack = new ArrayStack<>();

        // Verify the stack is empty using the isEmpty method
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push two elements to the stack: 10 and 20
        stack.push(10);
        stack.push(20);

        // Verify size of the stack using the size method
        System.out.println("Stack size: " + stack.size());

        // Print the stack statistics using the getStats method
        System.out.println("Stack stats: " + stack.getStats());

        // Print the global statistics using the getGlobalStats method
        System.out.println("Global stats: " + ArrayStack.getGlobalStats());

        // Add the top two elements using the addTopTwo method
        stack.addTopTwo();

        // Get the result of the addition using the pop method by assigning it to a variable named result
        Integer result = stack.pop();

        // Print the result of the addition
        System.out.println("Result of addition: " + result);

        // Test case 2: Resizing
        System.out.println("\n=== Test Case 2: Array Resizing ===");

        // Create an instance of ArrayStack named resizeStack
        ArrayStack<Integer> resizeStack = new ArrayStack<>();

        // Push 15 elements to trigger resize (default capacity is 10) using a loop
        System.out.println("Pushing 15 elements to trigger resize...");
        for (int i = 1; i <= 15; i++) {
            resizeStack.push(i);
        }

        // Print the stack size after pushing 15 elements
        System.out.println("Resize stack size: " + resizeStack.size());

        // Print the stack statistics using the getStats method
        System.out.println("Resize stack stats: " + resizeStack.getStats());

        // Test case 3: Multiple instances
        System.out.println("\n=== Test Case 3: Multiple Stack Instances ===");

        // Create an instance of ArrayStack named floatStack with Double type
        ArrayStack<Double> floatStack = new ArrayStack<>();

        // Push three elements to the floatStack: 1.5, 2.5, and 3.5
        floatStack.push(1.5);
        floatStack.push(2.5);
        floatStack.push(3.5);

        // Print the floatStack statistics using the getStats method

        System.out.println("First stack stats: " + stack.getStats());
        System.out.println("First stack stats: " + resizeStack.getStats());
        System.out.println("First stack stats: " + floatStack.getStats());
        System.out.println("Global stats: " + ArrayStack.getGlobalStats());
    }
}
