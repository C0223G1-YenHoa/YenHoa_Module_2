package case_study.services;


import case_study.models.Contract;

public interface IContractsService{
    void createContract();
    void displayContracts();
    void editContract(String bookingCode);
    boolean isCheck(String bookingCode);
}
