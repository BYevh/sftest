package main.java.ua.beg.salesforse;

import java.util.ArrayList;

public class Fibonacci {
    private ArrayList<Integer> listOfFibonacci;

    public Fibonacci(Integer maxNumber) {
        this.listOfFibonacci = new ArrayList<>();
        Integer result = 0;
        listOfFibonacci.add(0);
        if (maxNumber != 0) {
            listOfFibonacci.add(1);
            result = listOfFibonacci.get(0) + listOfFibonacci.get(1);
        }
        int count = 3;
        while (result <= maxNumber && maxNumber != 0) {
            listOfFibonacci.add(result);
            result = listOfFibonacci.get(count - 1) + listOfFibonacci.get(count - 2);
            count++;
        }
    }

    public ArrayList<Integer> getListOfFibonacci() {
        return listOfFibonacci;
    }


}
