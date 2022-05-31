package myapp.core;

public class ArraySum {
    public static void main(String[] args) {

        int result = 0;

        int[] SumAll = new int[5];
        SumAll[0] = 5;
        SumAll[1] = 7;
        SumAll[2] = 3;
        SumAll[3] = -10;
        SumAll[4] = 4;
        
        for (int i = 0; i <SumAll.length; i++) {
            result += SumAll[i];
        }

        System.out.printf("The sum of the array is: %d" , result);
    }
}