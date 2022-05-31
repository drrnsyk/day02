package myapp.core;

public class ArgsArraySum {
    public static void main(String[] args) {

        int result = 0;
        int operand = 0;
        
        for (int i = 0; i <args.length; i++) {
            
            operand = Integer.parseInt(args[i]);
            result += operand;
        }

        System.out.printf("The sum of the array is: %d" , result);
    }
}