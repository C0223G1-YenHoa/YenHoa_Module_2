package mvc.mvc_1.common;

import mvc.mvc_1.model.Student1;

import java.io.*;

import java.util.ArrayList;

public class ReadAndWriteFile {
    private static final String PATH = "src/mvc/mvc_1/common/file.csv";

    public static ArrayList<Student1> readFile() {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        ArrayList<Student1> studentList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                String[] student = temp.split(",");
                Student1 s = new Student1(Integer.parseInt(student[0]), student[1],
                            Integer.parseInt(student[2]), student[3], Integer.parseInt(student[4]), student[5]);
                studentList.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }

    public static void writeFile(Student1 student1, boolean abs) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, abs);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student1.write());
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
