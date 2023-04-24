package ss17_io_binary_file_serialization.copy_file;

import java.io.*;


public class CopyFile {
    private static final String PATH_SOURCE = "src/ss17_io_binary_file_serialization/copy_file/source_file";
    private static final String PATH_TARGET = "src/ss17_io_binary_file_serialization/copy_file/target_file";

    public static void main(String[] args) throws IOException {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(PATH_SOURCE);
            byte[] by = {'l', 'e', 't', 'h', 'i', 'y', 'e', 'n', 'h', 'o', 'a'};
            for (byte b : by) {
                outputStream.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

            if (outputStream != null) {
                outputStream.close();
            }
        }


        InputStream inputStream = new FileInputStream(PATH_SOURCE);
        int i = -1;
        while ((i = inputStream.read()) != -1) {
            System.out.println((char) i);
        }
        inputStream.close();

        OutputStream os=new FileOutputStream(PATH_TARGET);
        File file=new File(PATH_SOURCE);
        if(file.exists()){
            long bytes= file.length();
           os.write(Integer.parseInt(String.valueOf(bytes)));
            System.out.println(bytes);
        }
    }
}
