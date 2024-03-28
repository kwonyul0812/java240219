package ch18.exercise.p7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/exercise/p7/Example.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while ((rowData = br.readLine()) != null) {
            rowNumber++;
            System.out.println(rowNumber + ": " + rowData);
        }

        br.close();
        fr.close();
    }
}
