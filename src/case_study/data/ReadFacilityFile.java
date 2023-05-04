package case_study.data;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadFacilityFile {
    public static LinkedHashMap<Facility, Integer> readFacility(String path) {
        LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
        File file = new File(path);
        FileReader fr=null;
        BufferedReader br=null;
        try {
             fr = new FileReader(file);
             br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null && !line.equals("")) {
                String[] facilityArr = line.split(",");
                if (facilityArr[0].contains("HO")) {
                    House house = new House(facilityArr[0], facilityArr[1], Double.parseDouble(facilityArr[2]),
                            Double.parseDouble(facilityArr[3]), Integer.parseInt(facilityArr[4]), facilityArr[5],
                            facilityArr[6], Integer.parseInt(facilityArr[7]));
                    facilityList.put(house, 0);
                } else if (facilityArr[0].contains("VL")) {
                    Villa villa = new Villa(facilityArr[0], facilityArr[1], Double.parseDouble(facilityArr[2]),
                            Double.parseDouble(facilityArr[3]), Integer.parseInt(facilityArr[4]), facilityArr[5],
                           facilityArr[6], Integer.parseInt(facilityArr[7]), Integer.parseInt(facilityArr[8]));
                    facilityList.put(villa, 0);
                } else if (facilityArr[0].contains("RO")) {
                    Room room = new Room(facilityArr[0], facilityArr[1], Double.parseDouble(facilityArr[2]), Double.parseDouble(facilityArr[3]),
                            Integer.parseInt(facilityArr[4]), facilityArr[5], facilityArr[6]);
                    facilityList.put(room, 0);
                } else {
                    break;
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return facilityList;
    }
}
