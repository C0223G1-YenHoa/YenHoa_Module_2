package case_study.repository;

import case_study.models.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository {
    void display(int choice);
    void addFacility(Facility facility);
    boolean checkId(String id);
    LinkedHashMap<Facility,Integer> displayMaintenance();
    LinkedHashMap<Facility,Integer> getLinkedHashMap();
}
