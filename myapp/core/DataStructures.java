package myapp.core;

// import collection framework for data structures
import java.util.*;

public class DataStructures {
    public static void main(String[] args) {

        // create a list of integers (there are a lot of implementations like arrayList, Vectors, Stacks)
        // List<Integer> = generics
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(Integer.parseInt("42"));
        intList.add(10);
        intList.add(50);
        intList.add(2, 15);

        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {
            System.out.printf("the value of the list: %d\n" , intList.get(i));
        }
    }
}

