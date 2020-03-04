package main.java.ua.beg.salesforse;

public class Revers {

    public String revers(String line){
        StringBuilder newStr = new StringBuilder();
        for (int i = line.length() - 1; i >= 0; i--) {
            newStr.append(line.charAt(i));
        }
        return String.valueOf(newStr);
    }
}
