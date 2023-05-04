package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.repository.FacilityRepository;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private FacilityRepository facilityRepository = new FacilityRepository();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void display(int choice) {
        facilityRepository.display(choice);
    }

    @Override
    public void addFacility(int choice) {
        String newCode;
        String newName;
        Double newArea;
        Double newCost;
        int newMax;
        String newType;
        String newStandard;
        int newFloors;
        if (choice == 1) {
            int newPoolArea;
            do {
                System.out.print("Enter new Service Code: ");
                newCode = sc.nextLine();
                try {
                    if (!Validate.regexVl(newCode)) {
                        throw new Exception("Wrong format input");
                    }
                    if (facilityRepository.checkId(newCode)) {
                        throw new Exception("This code already exists");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!Validate.regexVl(newCode) || facilityRepository.checkId(newCode));

            do {
                System.out.print("Enter new Service Name:");
                newName = sc.nextLine();
                try {
                    if (!Validate.regexName(newName)) {
                        throw new Exception("Wrong format input");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!Validate.regexName(newName));
            do {
                System.out.print("Enter Usable Area(m2) : ");
                newArea = Double.parseDouble(sc.nextLine());
                try {
                    if (newArea < 30) {
                        throw new Exception("The usable area must be greater than 30.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newArea < 30);
            do {
                System.out.print("Enter new Rental Costs: ");
                newCost = Double.parseDouble(sc.nextLine());
                try {
                    if (newCost < 0) {
                        throw new Exception("The rental costs must be greater than 0.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newCost < 0);
            do {
                System.out.print("Enter Maximum People: ");
                newMax = Integer.parseInt(sc.nextLine());
                try {
                    if (newMax < 0 || newMax > 20) {
                        throw new Exception("The maximum people must be greater than 0 and less than 20.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newMax < 0 || newMax > 20);
            newType = newName;
            newStandard = newName;
            do {
                System.out.print("Enter Pool Area: ");
                newPoolArea = Integer.parseInt(sc.nextLine());
                try {
                    if (newPoolArea < 0) {
                        throw new Exception("The pool area must be greater than 0.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newPoolArea < 0);
            do {
                System.out.print("Enter Floors: ");
                newFloors = Integer.parseInt(sc.nextLine());
                try {
                    if (newFloors < 0) {
                        throw new Exception("Number of floors must be greater than 0.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newFloors < 0);
            Villa newVilla = new Villa(newCode, newName, newArea, newCost, newMax, newType, newStandard, newPoolArea,
                    newFloors);
            facilityRepository.addFacility(newVilla);
            System.out.println("Add new service successfully");
        } else if (choice == 2) {
            do {
                System.out.print("Enter new Service Code: ");
                newCode = sc.nextLine();
                try {
                    if (!Validate.regexHO(newCode)) {
                        throw new Exception("Wrong format input");
                    }
                    if (facilityRepository.checkId(newCode)) {
                        throw new Exception("This code already exists");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!Validate.regexVl(newCode) || facilityRepository.checkId(newCode));
            do {
                System.out.print("Enter new Service Name:");
                newName = sc.nextLine();
                try {
                    if (!Validate.regexName(newName)) {
                        throw new Exception("Wrong format input");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!Validate.regexName(newName));
            do {
                System.out.print("Enter Usable Area(m2) : ");
                newArea = Double.parseDouble(sc.nextLine());
                try {
                    if (newArea < 30) {
                        throw new Exception("The usable area must be greater than 30.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newArea < 30);
            do {
                System.out.print("Enter new Rental Costs: ");
                newCost = Double.parseDouble(sc.nextLine());
                try {
                    if (newCost < 0) {
                        throw new Exception("The rental costs must be greater than 0.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newCost < 0);
            do {
                System.out.print("Enter Maximum People: ");
                newMax = Integer.parseInt(sc.nextLine());
                try {
                    if (newMax < 0 || newMax > 20) {
                        throw new Exception("The maximum people must be greater than 0 and less than 20.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newMax < 0 || newMax > 20);
            newType = newName;
            newStandard = newName;
            do {
                System.out.print("Enter Floors: ");
                newFloors = Integer.parseInt(sc.nextLine());
                try {
                    if (newFloors < 0) {
                        throw new Exception("Number of floors must be greater than 0.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newFloors < 0);
            House newHouse = new House(newCode, newName, newArea, newCost, newMax, newType, newStandard,
                    newFloors);
            facilityRepository.addFacility(newHouse);
            System.out.println("Add new service successfully");
        } else if (choice == 3) {
            String newFreeService;
            do {
                System.out.print("Enter new Service Code: ");
                newCode = sc.nextLine();
                try {
                    if (!Validate.regexRO(newCode)) {
                        throw new Exception("Wrong format input");
                    }
                    if (facilityRepository.checkId(newCode)) {
                        throw new Exception("This code already exists");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!Validate.regexVl(newCode) || facilityRepository.checkId(newCode));
            do {
                System.out.print("Enter new Service Name:");
                newName = sc.nextLine();
                try {
                    if (!Validate.regexName(newName)) {
                        throw new Exception("Wrong format input");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (!Validate.regexName(newName));
            do {
                System.out.print("Enter Usable Area(m2) : ");
                newArea = Double.parseDouble(sc.nextLine());
                try {
                    if (newArea < 30) {
                        throw new Exception("The usable area must be greater than 30.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newArea < 30);
            do {
                System.out.print("Enter new Rental Costs: ");
                newCost = Double.parseDouble(sc.nextLine());
                if (newCost < 0) {
                    System.out.println(EmployeeService.ANSI_RED + "The rental costs must be greater than 0." + EmployeeService.ANSI_RESET);
                }
            } while (!(newCost < 0));
            do {
                System.out.print("Enter Maximum People: ");
                newMax = Integer.parseInt(sc.nextLine());
                try {
                    if (newMax < 0 || newMax > 20) {
                        throw new Exception("The maximum people must be greater than 0 and less than 20.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (newMax < 0 || newMax > 20);
            System.out.println("Enter Rental Type");
            newType = sc.nextLine();
            System.out.print("Enter Free Service: ");
            newFreeService = sc.nextLine();
            Room newRoom = new Room(newCode, newName, newArea, newCost, newMax, newType, newFreeService);
            facilityRepository.addFacility(newRoom);
            System.out.println("Add new service successfully");
        }
    }

    @Override
    public void displayMaintenance() {
        LinkedHashMap<Facility,Integer> maintenanceList= facilityRepository.displayMaintenance();
        for (Facility f: maintenanceList.keySet()) {
            System.out.println(f.toString());
        }
    }
}


