package myapp.core;

public class Arrays {
    public static void main(String[] args) {

        // Create and Instantiate new array
        String[] todos = new String[3];
        todos[0] = "Learn Java";
        todos[1] = "Go Joggy";
        todos[2] = "Watch Movie";

        System.out.println("This is for todos: ");
        //System.out.printf("Size of array: %d\n", todos.length);
        System.out.print("Size of array: ");
        System.out.println(todos.length);
        // System.out.printf("Index: %d: value = %s\n", 0, todos[0]);
        // System.out.printf("Index: %d: value = %s\n", 1, todos[1]);
        // System.out.printf("Index: %d: value = %s\n", 2, todos[2]);
        // System.out.printf("Index: %d: value = %s\n", 3, todos[3]);

        // Iterating through the array using a while loop
        int i = 0;
        while (i < todos.length) {
            System.out.printf("Index: %d: value = %s\n", i, todos[i]);
            i++;
        }

        System.out.println();

        System.out.println("This is for args: ");
        System.out.print("Size of args: ");
        System.out.println(args.length);
        // System.out.printf("Index: %d: value = %s\n", 0, args[0]);
        // System.out.printf("Index: %d: value = %s\n", 1, args[1]);

        // Iterating through the array using a for loop
        for (int j = 0; j < args.length; j++) {
            System.out.printf("Index: %d: value = %s\n", j, args[j]);
        }
    }
}
