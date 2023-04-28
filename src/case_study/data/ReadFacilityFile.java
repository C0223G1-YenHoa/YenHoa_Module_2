package case_study.data;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.List;

public class ReadFacilityFile {
    public static List<Facility> readFacility(String path) {
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while (true) {
                if ((line = br.readLine()) != null && !line.equals("")) {
                    String[] houseArr = line.split(",");
                    String[] villaArr = line.split(",");
                    String[] roomArr = line.split(",");
                    House house = new House(houseArr[0], houseArr[1], Double.parseDouble(houseArr[2]),
                            Double.parseDouble(houseArr[3]), Integer.parseInt(houseArr[4]), houseArr[5],
                            Integer.parseInt(houseArr[6]), Integer.parseInt(houseArr[7]));

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
