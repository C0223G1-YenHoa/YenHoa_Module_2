package case_study.repository;

import case_study.data.ReadFacilityFile;
import case_study.data.WriteFacilityFile;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;


import java.time.LocalDate;
import java.util.LinkedHashMap;

public class FacilityRepository implements IFacilityRepository {
    protected static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    private static final String FACILITY_PATH = "C:\\Users\\Admin\\Desktop\\YenHoa_Module_2\\src\\case_study\\data\\facility.csv";
    private static LinkedHashMap<Facility, Integer> maintenance = new LinkedHashMap<>();

    static {

        Villa villa = new Villa("SVVL-1234", "Boutique ", 50.0, 40000.0, 15,
                "Boutique ", "Boutique ", 30, 3);
        Villa villa1 = new Villa("SVVL-1122", "Golf", 60.0, 50000.0, 16,
                "Golf", "Golf", 40, 4);
        Villa villa2 = new Villa("SVVL-1111", "Retreat", 70.0, 60000.0, 20,
                "Retreat", "Retreat", 50, 5);
        House house = new House("SVHO-1234", "BreakFast", 30.0, 20000.0, 15,
                "Breakfast", "BreakFast", 3);
        House house1 = new House("SVHO-5678", "Massage", 35.0, 10000.0, 5,
                "Massage", "Massage", 2);
        House house2 = new House("SVHO-2468", "Spa ", 40.0, 30000.0, 15,
                "Spa ", "Spa ", 3);
        Room room = new Room("SVRO-1111", "Normal", 31.0, 15000.0, 5,
                "Normal", "Free_Wifi");
        Room room1 = new Room("SVRO-2222", "Medium", 32.0, 16000.0, 6,
                "Medium", "Free_Breakfast");
        Room room2 = new Room("SVRO-3333", "Premium", 33.0, 17000.0, 6,
                "Premium", "Free_Breakfast-Wifi");

        linkedHashMap.put(villa, 0);
        linkedHashMap.put(villa1, 5);
        linkedHashMap.put(villa2, 0);
        linkedHashMap.put(house, 0);
        linkedHashMap.put(house1, 0);
        linkedHashMap.put(house2, 0);
        linkedHashMap.put(room, 0);
        linkedHashMap.put(room1, 0);
        linkedHashMap.put(room2, 0);
        for (Facility f : linkedHashMap.keySet()) {
            if (linkedHashMap.get(f) == 5) {
                maintenance.put(f, 5);
            }
        }
//        for (Facility f : maintenance.keySet()) {
//            linkedHashMap.remove(f, 5);
//        }
//        maintenance();
    }

//    static{
//        LocalDate current = LocalDate.now();
//        LocalDate firstDayOfMonth = current.withDayOfMonth(1);
//        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
//        LocalDate lastDayOfMonth = firstDayOfNextMonth.minusDays(1);
//        if (current.isEqual(lastDayOfMonth)) {
//            for (Facility f : linkedHashMap.keySet()) {
//                linkedHashMap.put(f, 0);
//                maintenance.remove(f);
//            }
//        }
//    }


    @Override
    public void display(int choice) {
        for (Facility f : linkedHashMap.keySet()) {
            if (choice == 1) {
                System.out.println(f);
            }
            if (choice == 2 && f instanceof Villa) {
                System.out.println(f);
            }
            if (choice == 3 && f instanceof House) {
                System.out.println(f);
            }
            if (choice == 4 && f instanceof Room) {
                System.out.println(f);
            }
        }
        WriteFacilityFile.writeFacilityFile(linkedHashMap, FACILITY_PATH);
        ReadFacilityFile.readFacility(FACILITY_PATH);
    }

    @Override
    public void addFacility(Facility facility) {
                linkedHashMap.put(facility, 0);
    }

    @Override
    public boolean checkId(String id) {
        for (Facility f : linkedHashMap.keySet()) {
            if (f.getServiceCode().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public LinkedHashMap<Facility, Integer> displayMaintenance() {
        for (Facility f : linkedHashMap.keySet()) {
            if (linkedHashMap.get(f) == 5) {
                maintenance.put(f, 5);
            }
        }
//        for (Facility f : maintenance.keySet()) {
//            linkedHashMap.remove(f);
//        }
        return maintenance;
    }

    @Override
    public LinkedHashMap<Facility, Integer> getLinkedHashMap() {
        return linkedHashMap;
    }

//    public static void maintenance() {
//        LocalDate current = LocalDate.now();
//        LocalDate firstDayOfMonth = current.withDayOfMonth(1);
//        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
//        LocalDate lastDayOfMonth = firstDayOfNextMonth.minusDays(1);
//        if (current.isEqual(lastDayOfMonth)) {
//            for (Facility f : linkedHashMap.keySet()) {
//                linkedHashMap.put(f, 0);
//                maintenance.remove(f);
//            }
//        }
//
//    }
}
