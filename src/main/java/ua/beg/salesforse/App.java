package main.java.ua.beg.salesforse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static final String FILE_NAME_INPUT = "src/main/resources/source.txt";
    public static final String FILE_NAME_OUTPUT = "src/main/resources/output.txt";

    public static void main(String[] args) throws IOException {


        Repository repository = new Repository();
        List<String> stringLinesFile = repository.readFile(FILE_NAME_INPUT);
        Integer numberOfLines = stringLinesFile.size();
        Fibonacci fibonacci = new Fibonacci(numberOfLines);
        List<Integer> listOfFibonacci = fibonacci.getListOfFibonacci();
        List<String> newStringLines = new ArrayList<>();
        Revers revers = new Revers();
        int countFibonacci = 2;
        for (int i = 0; i < (numberOfLines - 1); i++) {
            if ((i + 1) == listOfFibonacci.get(countFibonacci)) {
                newStringLines.add(revers.revers(stringLinesFile.get(i)));
                countFibonacci++;
                if (countFibonacci == listOfFibonacci.size()) {
                    break;
                }
            }
        }
        repository.writeFile(newStringLines, FILE_NAME_OUTPUT);


    }
}
