package ss10_dsa.practice.common;

import java.io.*;

public class ReadFile {
    public void readFile(){
        String PATH = "src/ss10_dsa/practice/file.csv/employee.csv";
        File file = new File(PATH);
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String s;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
           e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}