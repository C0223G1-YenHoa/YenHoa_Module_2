package ss16_io_file.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String PATH = "src/ss16_io_file/copy_file/source_file";
        File file = new File(PATH);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("hello");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        String PATH1 = "src/ss16_io_file/copy_file/source_file";
        List<String> strings = new ArrayList<>();
        File file1 = new File(PATH1);
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String s;
        try {
            fileReader = new FileReader(file1);
            if (!file1.exists()) {
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(fileReader);
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
                strings.add(s);
            }
        } catch (IOException e) {
            System.err.println("File không tồn tại");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        String PATH2 = "src/ss16_io_file/copy_file/target_file";
        File file2 = new File(PATH2);
        FileWriter fileWriter2;
        BufferedWriter bufferedWriter2 = null;
        int count = 0;
        try {
            fileWriter2 = new FileWriter(file2);
            bufferedWriter2 = new BufferedWriter(fileWriter2);
            for (String s1 : strings) {
                bufferedWriter2.write(s1);
                count += s1.length();
            }
            bufferedWriter2.newLine();
            bufferedWriter2.write("" + count);
            bufferedWriter2.flush();
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
