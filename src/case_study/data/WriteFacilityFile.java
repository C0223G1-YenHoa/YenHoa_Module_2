package case_study.data;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

public class WriteFacilityFile {
    public static void writeFacilityFile(LinkedHashMap<Facility, Integer> facilityLKM, String path) {
        File file = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (Facility f : facilityLKM.keySet()) {
                if (f.getServiceCode().contains("HO")) {
                    House house = (House) f;
                    bw.write(house.toWrite());
                } else if (f.getServiceCode().contains("VL")) {
                    Villa villa = (Villa) f;
                    bw.write(villa.toWrite());
                } else if (f.getServiceCode().contains("RO")) {
                    Room room = (Room) f;
                    bw.write(room.toWrite());
                }
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
