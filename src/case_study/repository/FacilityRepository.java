package case_study.repository;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class FacilityRepository implements IFacilityRepository{
    private static LinkedHashMap<Facility,Integer> linkedHashMap=new LinkedHashMap<Facility,Integer>();
    private   List<House> houseList = new ArrayList<>();
    private   List<Villa> villaList = new ArrayList<>();
    private   List<Room> roomList = new ArrayList<>();
    private   List<Facility> facilityList=new ArrayList<>();

    static {

    }

    @Override
    public List<Facility> getList() {

        return facilityList;
    }
}
