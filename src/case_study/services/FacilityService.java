package case_study.services;

import case_study.models.Facility;
import case_study.repository.FacilityRepository;

import java.util.List;

public class FacilityService implements IFacilityService{
    private  FacilityRepository facilityRepository=new FacilityRepository();
    @Override
    public void displayList() {
        List<Facility> facilityList= facilityRepository.getList();
        for (Facility f: facilityList) {
            System.out.println(f);
        }
    }

}
