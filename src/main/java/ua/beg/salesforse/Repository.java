package main.java.ua.beg.salesforse;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<String> readFile(String fileNameInput) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileNameInput));
        List<String> list = new ArrayList<>();
        while (reader.ready()) {
            list.add(reader.readLine());
        }
        reader.close();
        return list;
    }

    public void writeFile(List<String> newList, String fileNameOutput) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameOutput));
        for (String line : newList) {
            writer.write(line + "\n");
        }
        writer.close();
    }
}
