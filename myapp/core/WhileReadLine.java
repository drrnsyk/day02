package myapp.core;

import java.io.Console;

public class WhileReadLine {
    public static void main(String[] args) {

        Console cons = System.console();

        String input = "a";
        int result = 0;
        int operand = 0;

        while (input.length() > 0) {
            input = cons.readLine("Please enter a number. Blank to end \n");
            if (input.length() > 0 ) {
                System.out.printf(">>> %s <<< \n" , input.toUpperCase());
                operand = Integer.parseInt(input);
                result += operand;
            }
        }

        System.out.printf("The sum of the user input is: %d" , result);

    }
}
